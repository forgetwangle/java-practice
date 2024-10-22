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

class Handler{
	protected Game game;
	
	public Handler(Game game) {this.game=game;}
	public void doCmd(String word) {}
	public boolean isBye() {return false;}
}

class HandlerBye extends Handler{

	public HandlerBye(Game game) {
		super(game);
	}

	@Override
	public boolean isBye() {
		return true;
	}
	
}

class HandlerHelp extends Handler{
	
	public HandlerHelp(Game game) {
		super(game);
	}

	@Override
	public void doCmd(String word) {
		System.out.println("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
	}
}

class HandlerGo extends Handler{
	
	public HandlerGo(Game game) {
		super(game);
	}

	@Override
	public void doCmd(String word) {
		game.goRoom(word);
	}
}

public class Game {
    private Room currentRoom;
    private HashMap<String,Handler> handlers=new HashMap<String, Handler>();
        
    public Game() 
    {
    	handlers.put("go", new HandlerGo(this));
    	handlers.put("bye", new HandlerBye(this));
    	handlers.put("help", new HandlerHelp(this));
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

    public void goRoom(String direction) 
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
    
    public void play() {
    	Scanner in = new Scanner(System.in);
    	while ( true ) {
    		String line = in.nextLine();
    		String[] words = line.split(" ");
    		Handler handler=handlers.get(words[0]);
    		String value="";
    		if(words.length>1)
    			value=words[1];
    		if(handler!=null) {
    			handler.doCmd(value);
    			if(handler.isBye()) 
    				break;
    		}
//    		if ( words[0].equals("help") ) {
//    			game.printHelp();
//    		} else if (words[0].equals("go") ) {
//    			game.goRoom(words[1]);
//    		} else if ( words[0].equals("bye") ) {
//    			break;
//    		}
    	}
    	in.close();
    }
	
	public static void main(String[] args) {
		Game game = new Game();
		game.printWelcome();
        game.play();
        System.out.println("感谢您的光临。再见！");
	}

}

/**
 * 把出口从原来以成员变量作硬编码，变成了用容器、用Hash表
 * 	原本是硬编码的东西，做成了框架
 * 这样一个框架表明我建立了一个数据结构，这个数据结构是名字和对应的那个房间之间的一个对应关系
 * 	围绕这样一个框架的不仅仅是HashMap,还有那些接口
 * 	框架是HashMap和那些接口，数据是放在HashMap里的那些东西
 * 
 * 以框架+数据来提高可扩展性(之前让出口脱离了硬编码，但命令依然是硬编码)
 * 	命令的解析是否可以脱离if-else
 * 	定义一个Handler来处理命令
 * 	用Hash表来保存命令和Handler之间的关系
 * 
 * 
 */
