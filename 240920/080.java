package yszl;

import java.io.IOException;
import java.util.Scanner;

public class Ngzs {
	
	public static void main(String[] args) {
		System.out.println("hello world");
//		Scanner in=new Scanner(System.in);
		byte[] buffer=new byte[1024];
		try {
			int len=System.in.read(buffer);//返回这次读了多少东西
			String s=new String(buffer,0,len);//从0开始读len个字节
			System.out.println("读到了"+len+"字节");
			System.out.println(s);
			System.out.println("s的长度是："+s.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.
	}

}

/**
 *处理输入输出的手段叫做流
 *
 *流(Stream)是输入输出的方式
 *	流是一维单向的
 *
 *System.out.println
 *System是一个类，out是System的一个类成员，println是out可以做的一件事情
 *	out这个成员就是某种用来做输出的流
 *
 *流的基础类
 *	InputStream标准输入流
 *	OutputStream标准输出流
 *	这两个类都是抽象的，
 *	https://docs.oracle.com/javase/8/docs/api/overview-summary.html
 *
 *输入System.out.后alt+/	就可以看到System.out能做的各种动作
 *
 *https://docs.oracle.com/javase/8/docs/api/overview-summary.html
 *	在这个网址中的java.io中的OutputStream和InputStream
 *InputStream：将外界输入当作字节流来看待
 *	如何使用：System.in.以下方法
 *	read()
 *		int read()读一个字节;用这个函数表达如果文件读到头了，函数读到文件结束的地方了，就返回-1
 *		read(byte b[])
 *		read(byte[],int off,int len)
 *	skip(long n)
 *	int available()返回流里面有多少字节可读
 *	mark()在流读到某个位置时打个标记，会覆盖上一个标记
 *	reset()回到mark()打标记的地方
 *	boolean markSupported()返回能不能进行mark(),不是所有的流都能mark()的，比如特殊的输入、键盘的输入无法mark()
 *	close()
 *OutputStream：输出单个字节或输出一个字节数组
 *	write()
 *		write(int b)
 *		write(byte b[])
 *		write(byte b[],int off,int len)
 *	flush()保证从缓冲区里面写到物理介质上去
 *	close()
 *
 *
 */
