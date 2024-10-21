package castle;

import java.util.Scanner;

class Room {
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc() {
//    	String ret="";
//    	if(northExit!=null)
//    		ret+="north";
//    	if(eastExit!=null)
//    		ret+="east";
//    	if(westExit!=null)
//    		ret+="west";
//    	if(southExit!=null)
//    		ret+="south";
    	StringBuffer sb=new StringBuffer();//String是一个immutable对象，不可修改，每次新建对象开销很大
    	if(northExit!=null)
    		sb.append("north");
    	if(eastExit!=null)
    		sb.append("east");
    	if(westExit!=null)
    		sb.append("west");
    	if(southExit!=null)
    		sb.append("south");
    	return sb.toString();
    }
    public Room getExit(String direction) {
    	Room ret=null;
    	if(direction.equals("north")) {
            ret = northExit;
        }
        if(direction.equals("east")) {
            ret = eastExit;
        }
        if(direction.equals("south")) {
            ret = southExit;
        }
        if(direction.equals("west")) {
            ret = westExit;
        }
    	return ret;
    }
}

public class Game {
    private Room currentRoom;
        
    public Game() 
    {
        createRooms();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口
        outside.setExits(null, lobby, study, pub);
        lobby.setExits(null, null, null, outside);
        pub.setExits(null, outside, null, null);
        study.setExits(outside, bedroom, null, null);
        bedroom.setExits(null, null, null, study);

        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        showPrompt();
    }

    // 以下为用户命令

    private void printHelp() 
    {
        System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
    }

    private void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
    
    public void showPrompt() {
    	System.out.println("你在" + currentRoom);
        System.out.print("出口有: ");
        System.out.print(currentRoom.getExitDesc());//之前需要多次调用Room中变量，现在解耦合
        System.out.println();
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Game game = new Game();
		game.printWelcome();

        while ( true ) {
        		String line = in.nextLine();
        		String[] words = line.split(" ");
        		if ( words[0].equals("help") ) {
        			game.printHelp();
        		} else if (words[0].equals("go") ) {
        			game.goRoom(words[1]);
        		} else if ( words[0].equals("bye") ) {
        			break;
        		}
        }
        
        System.out.println("感谢您的光临。再见！");
        in.close();
	}

}

/**
 * 封装的思想：
 * 要写低耦合的代码，类与类之间的关系越松越好，
 * 	比如原代码中Game来判断方向，耦合度太高，应该让Room判断各方向地点,然后交给Game，
 * 		最后达成Game不清楚Room有那些属性，仅能调用Room处理好后的结果
 * 
 * 用封装来降低耦合
 * 	Room类和Game类中都有大量的代码和出口相关
 * 	Game类中大量使用了Room类的成员变量
 * 	类与类之间的关系称作耦合
 * 	耦合越低越好，保持距离是形成良好代码的关键
 *
 *
 */
