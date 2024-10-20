package yszl;

import java.util.Scanner;

public class Ngzs {
	private int value=0;
	private static int step=1;//静态成员变量
	
	public void increase() {
		value++;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void f() {//静态成员函数
//		value++;该行报错，因为static函数中不能直接访问非static成员
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Ngzs n1=new Ngzs();
		Ngzs n2=new Ngzs();
		n1.increase();//increase不是static的，不能在类中直接访问，要通过对象来访问
		f();//f()是static的，可以在类中直接访问
		n1.f();//f()也可以通过对象来访问
		System.out.println(n1.getValue());
		System.out.println(n2.getValue());
		System.out.println(n1.step);
		System.out.println(n2.step);
		n1.step=2;//对象也可以访问静态成员变量
		System.out.println(n1.step);//n1.step的结果是2
		System.out.println(n2.step);//n2.step的结果也变成了2，说明所有对象共用一个静态成员变量
		Ngzs.step=3;//类可以访问静态成员变量，但类不可以访问非静态的成员变量
		System.out.println(n1.step);
		System.out.println(n2.step);		
		
		
	}

}

/**
 * 类变量和类函数
 * 
 *static成员变量是类变量，
 *	不属于类的任何一个对象，
 *	仅属于这个类。
 *	对象可以通过类访问静态成员变量
 *
 *函数中的static说明这个函数不属于任何对象,public static void main
 *	static函数仅属于这个类，和对象没关系，
 *
 *static函数只能调用static函数，访问static成员
 *	如果在public static void main中要访问非static成员，需要通过对象来访问
 */
