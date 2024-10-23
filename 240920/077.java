package exception;

import java.util.Scanner;

public class ArrayIndex {
	
	public static void f() {
		int[] a= new int[10];
		try {
			a[10]=10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("f()");
			throw e;
		}
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		int[] a= new int[10];
		int idx;
		Scanner in=new Scanner(System.in);
		idx=in.nextInt();
		try {
			f();
			a[idx]=10;
			System.out.println("hello");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
			System.out.println(e.toString());//println中e相当于e.toString()
			e.printStackTrace();
		}
		System.out.println("main");
	}
}

/**
 * try{
 * 	//可能产生异常的代码
 * }catch(Type1 id1){
 * 	//处理Type1异常的代码
 * }catch(Type2 id2){
 * 	//处理Type2异常的代码
 * }catch(Type3 id3){
 * 	//处理Type3异常的代码
 * }
 * 
 * 捕捉异常之后
 * 	String getMessage();
 * 	String toString();
 * 	void printStackTrace();//调用堆栈
 * 但是肯定是回不去了，而具体的处理逻辑则取决于你的业务逻辑需要
 * 
 * 再度抛出
 * catch(Exception e){
 * 	System.err.println("An exception was thrown");
 * 	throw e;
 * }
 * 如果在这个层面上需要处理，但是不能做最终决定
 * 
 * 如果捕捉到了一个异常，但是处理不了它；或是捕捉了处理了，但不能全部处理掉
 * 	用throw再度将异常抛出
 * 
 */
