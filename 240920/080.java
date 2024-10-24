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
			String s=new String(buffer,0,len);
			System.out.println("读到了"+len+"字节");
			System.out.println(s);
			System.out.println("s的长度是："+s.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
 *
 */
