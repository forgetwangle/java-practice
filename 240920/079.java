package exception;

import java.util.Scanner;

class OpenException extends Exception{}

class CloseException extends OpenException{}

class NewException extends Exception{}

class NewClass extends ArrayIndex{
	public NewClass() throws OpenException,NewException{}//
	
//	public void f() {}//OK,不会抛出任何异常
//	public void f() throws CloseException{}//OK,CloseException是OpenException的子类
//	public void f() throws NewException{}//不OK,覆盖父类方法时不能声明比父类版本更多的异常
	public void f() throws OpenException{}
	
	public static void main(String[] args) {
		try {
			ArrayIndex p=new NewClass();//up cast向上造型
			p.f();
		} catch (OpenException e) {
			e.printStackTrace();
		} catch (NewException e) {
			e.printStackTrace();
		}
	}
}

public class ArrayIndex {
	
	public ArrayIndex() throws OpenException{}
	
	public void f() throws OpenException{}
	
	public static int open() {
		int[] a=new int[10];
		a[10]=10;
		return -1;
	}
	
	public static void readFile() throws OpenException,CloseException {
		if(open()==-1) {
			throw new CloseException();
		}
	}
	
	public static void main(String[] args) {
		try {
			readFile();
		} catch (CloseException e) {
			e.printStackTrace();
			System.out.println("Close");
		} catch (OpenException e) {
			e.printStackTrace();
			System.out.println("Open");
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Anything");
		}
	}
}

/**
 * catch怎么匹配异常的
 * 	is-A的关系
 * 	就是说，抛出子类异常会被捕捉父类异常的catch给捉到
 * 
 * 捕捉任何异常
 * catch(Exception e){
 * 	System.err.println("Caught an exception");
 * }
 * 
 * (系统)运行时刻异常
 * 像ArrayIndexOutOfBoundsException这样的异常是不需要声明的(throws ArrayIndexOutOfBoundsException)
 * 但是如果没有适当的机制来捕捉，就会最终导致程序终止
 * 
 * 异常声明
 * 	如果你的函数可能抛出异常，就必须在函数头部加以声明
 * 		void f() throws TooBig,TooSmall,DivZero{…}
 * 		void f(){…}
 * 	你可以声明并不会真的抛出的异常
 * 	如果你调用一个声明会抛出异常的函数，那么你必须：
 * 		把函数的调用放到try块中，并设置catch来捕捉所有可能抛出的异常；
 * 		或声明自己会抛出无法处理的异常
 * 
 * 异常声明遇到继承关系
 * 	当覆盖一个函数的时候，子类不能声明抛出比父类的版本更多的异常
 * 	在子类的构造函数中，必须声明父类可能抛出的全部异常
 * 子类的Override成员函数不能抛出更多的异常，
 * 	是因为我们有可能拿着子类的对象当成父类的对象来看待,
 * 	这个时候如果通过父类的这个变量去调用子类的一个函数时,没办法处理子类的新的异常
 * 子类构造函数是在构造过程中自动调用父类的构造，所以子类得声明父类构造抛出的所有异常，还有自身新的异常
 * 
 */
