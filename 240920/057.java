package notebook;

import java.util.ArrayList;

public class NoteBook {
	//记事本
	public ArrayList<String> notes=new ArrayList<String>();
	
	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s,int location) {
		notes.add(location,s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a=new String[notes.size()];
//		for(int i=0;i<notes.size();i++)	{
//			a[i]=notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}

	public static void main(String[] args) {
		String[] a=new String[2];
		a[0]="first";
		a[1]="second";
		
		NoteBook nb=new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third",1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
		nb.removeNote(1);
		String[] b=nb.list();
		for(String s:a) {
			System.out.println(s);
		}

	}

}

/**
 * ArrayList,泛型类，一种容器
 * ArrayList<String> notes=new ArrayList<String>();
 * 容器类有两个类型：容器的类型，元素的类型
 */
