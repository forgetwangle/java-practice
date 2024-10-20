package notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Item{
//	protected String title;protected可以让同一个包内的子类访问父类的成员变量
	private String title;
	private int playingTime;
	private boolean gotIt=false;
	private String comment;
	
	public Item() {
		
	}

	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}

	public void print() {
		System.out.print(title);		
	}
	
}

class CD extends Item{//继承
	private String artist;
	private int numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title,playingTime,false,comment);//super调用父类的构造函数
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

}

class DVD extends Item{//继承
	private String director;
	
	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment);//如果没有super就会默认去找父类的无参构造方法
//		this.title = title;
		this.director = director;
	}
	
	public void print() {
		System.out.print("DVD:");
		super.print();
		System.out.println(":"+director);
	}
	
}

public class Database {
	private ArrayList<Item> listItem=new ArrayList<Item>();
	
	public void add(Item item) {
		listItem.add(item);
	}
	
	public void list() {
		for(Item item:listItem) {
			item.print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Database db=new Database();
		db.add(new CD("abc", "abc", 4, 60, "..."));
		db.add(new CD("def", "def", 4, 60, "..."));
		db.add(new DVD("xxx", "aaa", 60, "..."));
		
		db.list();
		
	}

}

/**
 * super()调用父类的无参构造方法
 * super.xxx()调用父类的xx方法
 * 
 * 子类和子类型
 * 类定义了类型，子类定义了子类型
 * 子类的对象可以当作父类的对象来使用
 * 	赋值给父类的变量 Vehicle v1=new Car();
 * 	传递给需要父类对象的函数DVD dvd=new DVD();database.add(dvd);
 * 	放进存放父类对象的容器里
 * 
 * 多态变量
 * java的对象变量是多态的，它们能保存不知一种类型的对象
 * 它们可以保存的是声明类型的对象，或者是声明类型的子类的对象
 * 当把子类的对象保存给父类的变量的时候，就发生了向上造型
 * 	多态变量有两个类型，静态类型(或称声明类型),动态类型
 * 		静态类型就是字面上看得出来的类型Item DVD中的Item
 * 		动态类型是静态类型管理的对象的类型，Item DVD中的DVD
 * 
 * 变量的多态，变量在运行时，某一时刻它所管理的那个对象的类型是会变化
 * 	
 * 造型：把一个类型的对象赋给另一个类型的变量，子类的对象可以赋值给父类的变量
 * 	注意，对象变量的赋值，并不是拿一个对象去给另一个对象赋值，而是让两个对象的管理者管理同一个对象
 * 	Vehicle v;Car c=new Car();
 * 	v=c;c=(Car)v;只有v这个变量实际管理的是Car才行
 * 
 * 函数调用的绑定
 * 	当通过对象变量调用函数时，调用哪个函数这件事叫绑定
 * 		静态绑定：根据变量的声明类型来决定
 * 		动态绑定：根据变量的动态类型来决定，默认所有绑定都是动态的
 * 			编译时并不知道对象绑定的哪个函数，而在运行时才知道，运行时才知道的叫做动态绑定
 * 	在成员函数中调用其他成员函数也是通过this这个对象变量来调用的
 * 		可以视为this.来调用，这也是动态绑定
 * 
 * 覆盖override，子类和父类中存在名称和参数表完全相同的函数，这一对函数构成覆盖关系
 * 	通过父类的变量调用存在覆盖关系的函数时，会调用变量当时所管理的对象所属的类的函数
 */
