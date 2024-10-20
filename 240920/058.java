package notebook;

import java.util.ArrayList;

class Value{
	private int i;
	public void set(int i) { this.i=i ;}
	public int get() {return i; }
}

public class NoteBook {
	

	public static void main(String[] args) {
//		1，不初始化数组
		int[] ia=new int[10];
		String[] a=new String[10];
		System.out.println(ia[0]+2);
		System.out.println(a[0]+"a");//结果是nulla，因为此时数组a中的元素并没有指向任何对象
		for(int i=0;i<a.length;i++) {
			a[i]=""+i;//字符串加法；给a中元素指向的对象初始化
		}		
		System.out.println(a[0].length());
		
		String b="he"+1;
		System.out.println(b);
		
//		2，int数组，for-each
		for(int i=0;i<ia.length;i++) {
			ia[i]=i;
		}
		for(int k:ia) {
			k++;//不会起到任何作用，因为在for-each每一轮循环中k是ia中元素的复制品，不会影响ia中的元素
		}
		for(int k:ia) {
			System.out.println(k);
		}
		
//		3，对象数组,for-each		
		Value[] c=new Value[10];
		for(int i=0;i<c.length;i++) {
			c[i]=new Value();
			c[i].set(i);
		}
		for(Value v:c) {
			System.out.println(v.get());
			v.set(0);
//			v.set(0);起了作用，在for-each循环中，每一轮v=c[0],指向了c[0]管理的对象
//			此时v和c[0]共同管理c[0]管理的那个对象
		}
		for(Value v:c) {
			System.out.println(v.get());
		}
		
//		4，ArrayList数组，for-each
		ArrayList<String> d=new ArrayList<String>();
		d.add("first");
		d.add("second");
		for(String s:d) {
			System.out.println(s);
		}

	}

}

/**
 * 对象数组中的每个元素都是对象的管理者，而非对象本身
 */
