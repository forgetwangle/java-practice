package notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class CD{
	private String title;
	private String artist;
	private int numofTracks;
	private int playingTime;
	private boolean gotIt=false;
	private String comment;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
//		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playingTime = playingTime;
		this.comment = comment;
	}

	public void print() {
		System.out.println("CD:"+title+":"+artist);
		
	}
}

class DVD{
	private String title;
	private String director;
	private int playingTime;
	private boolean gotIt=false;
	private String comment;
	public void print() {
		System.out.println("DVD:"+title+":"+director);		
	}
	public DVD(String title, String director, int playingTime, String comment) {
		super();
		this.title = title;
		this.director = director;
		this.playingTime = playingTime;
		this.comment = comment;
	}
	
}

public class Database {	
	private ArrayList<CD> listCD=new ArrayList<CD>();
	private ArrayList<DVD> listDVD=new ArrayList<DVD>();
	
	public void add(CD cd) {
		listCD.add(cd);
	}
	
	public void add(DVD dvd) {
		listDVD.add(dvd);
	}
	
	public void list() {
		for(CD cd:listCD) {
			cd.print();
		}
		for(DVD dvd:listDVD) {
			dvd.print();
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
 * 
 */
