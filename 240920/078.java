package exception;

import java.util.Scanner;

class OpenException extends Throwable{
	
}

class CloseException extends Throwable{
	
}

public class ArrayIndex {
	
	public static int open() {
//		int[] a=new int[10];
//		a[10]=10;
		return -1;//1，返回-1表示文件打开不成功
	}
	
	public static void readFile() throws OpenException,CloseException {//5，throws OpenException是说readFile会抛出OpenException这个异常
		if(open()==-1) {//2，readFile发现了open是-1，如何让别人知道异常发生了
			throw new OpenException();//3，throw不能抛出int类型的对象，必须是Throwable类型的对象
		}//4，抛出异常后readFile要被终止，可是既没有处理这个异常(try-catch)，也没有告诉别人readFile会抛出这么个异常函数(throws)
	}
	
	public static void main(String[] args) {
		try {
			readFile();
		} catch (OpenException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
		
	}
}

/**
 * 如果要读文件
 * 	打开文件，判断文件大小，分配足够的内存空间，把文件读入内存，关闭文件
 * 
 * 不能正常工作的情况:用上异常机制
 * 	打开文件：文件不存在
 * 	判断文件大小：文件并不是磁盘上的文件，比如socket通信时，客户端和服务端之间建立的网络连接，也是以文件的形式访问的
 * 		如果服务端或者客户端还在不断地写数据，就无法知道文件什么时候结束，也就无法判断文件大小
 * 	
 * 用上异常机制
 * try{
 * 	open the file;
 * 	determine its size;
 * 	allocate that much memory;
 * 	read the file into memory;
 * 	close the file;
 * }catch(fileOpenFailed){
 * 	doSomething;
 * }catch(sizeDeterminationFailed){
 * 	doSomething;
 * }catch(memoryAllocationFailed){
 * 	doSomething;
 * }catch(readFailed){
 * 	doSomething;
 * }catch(fileCloseFailed){
 * 	doSomething;
 * }
 * 将business logic(业务逻辑BL)连贯地写下来、连贯地表达，并放在try代码块中
 * 
 * 异常
 * 	有不寻常的事情发生了
 * 	当这个事情发生时，原本打算要接着做的事情不能再继续了，必须得要停下来，让其他地方的某段代码来处理
 * 异常机制最大的好处是清晰地分开了正常的业务逻辑代码和遇到情况时的处理代码
 * 
 * 异常的抛出与声明
 * 	
 * 异常声明
 * 	如果你的函数可能抛出异常，就必须在函数头部加以声明
 * 		void f() throws TooBig,TooSmall,DivZero{…}
 * 		void f(){…}
 * 	你可以声明并不会真的抛出的异常
 * 
 * 什么能扔
 * 	任何继承了Throwable类的对象
 * 	Exception类继承了Throwable//一般新建的异常继承Exception类
 * 		throw new Exception();
 * 		throw new Exception("HELP");
 * 
 * 异常捕捉时的匹配
 * 
 * catch怎么匹配异常的
 * 	is-A的关系
 * 	就是说，抛出子类异常会被捕捉父类异常的catch给捉到
 * 
 * 
 */
