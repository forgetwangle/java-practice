package notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Item{
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

class CD extends Item{
	private String artist;
	private int numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title,playingTime,false,comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

	@Override//告诉编译器下面的函数是覆盖
	public boolean equals(Object obj) {
		CD cc=(CD)obj;
		return artist.equals(cc.artist);//obj没有artist方法，cc有，因此将obj转换为cc
	}

}

public class Database {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		System.out.println(al.equals(a));
		String s="aa"+al;//al不是字符串，toString自动将al转换成字符串
		System.out.println(s);//自动调用父类Object的toString(),
		
	}

}

/**
 * java中所有的类都是Object的子类，Object是java类型系统中的root(根)，这就是单根结构
 * Object类中包含一些方法，如：toString(),equals()
 */
