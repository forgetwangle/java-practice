package notebook;

import java.util.ArrayList;
import java.util.HashSet;

class Value{
	private int i;
	public void setValue(int i) {this.i=i;}
	public int getValue() {return i;}
	public String toString() {return ""+i;}
}

public class NoteBook {
	

	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();
		s.add("first");
		s.add("second");
		s.add("first");
		for(String k:s) {
			System.out.println(k);//结果仅输出first second
		}
		System.out.println(s);//ArrayList和HashSet都可以直接输出
		
		Value v=new Value();
		v.setValue(28);
		System.out.println(v);//需要实现Value的toString函数才能直接输出
	}

}

/**
 * HashSet集合，其中不会包含重复的元素
 */
