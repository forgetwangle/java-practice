package castle;

import java.util.HashMap;
import java.util.Scanner;

class Room {
    private String description;
    private HashMap<String,Room> exits=new HashMap<String,Room>();

    public Room(String description) 
    {
        this.description = description;
    }
    
    public void setExit(String dir,Room room) {
    	exits.put(dir,room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc() {
    	StringBuffer sb=new StringBuffer();
    	for(String dir:exits.keySet()) {
    		sb.append(dir);
    		sb.append(' ');
    	}
    	return sb.toString();
    }
    public Room getExit(String dir) {
//    	Room ret=exits.get(dir);
//    	return ret;
    	return exits.get(dir);
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
        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        study.setExit("north",outside);
        study.setExit("east", bedroom);
        bedroom.setExit("west", study);
        lobby.setExit("up", pub);
        pub.setExit("down", lobby);

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
 * 消除代码复制：封装，提高可扩展性
 * 
 * 提高可扩展性
 * 
 * 用接口实现聚合
 * 给Room类实现新的方法，把方向的细节彻底隐藏在Room类内部了，今后方向如何实现就和外部无关了
 * 之前的封装过程将Room的成员变量定义为私有，并提供了getExit和getExitDesc两个接口
 * 
 * 但Room的方向使用成员变量表示的，增加或减少方向就要改变代码，
 * 	如果用Hash表来表示方向，那么方向就不是“硬编码”的了
 * 
 * 
 */
