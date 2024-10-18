package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
//		char c='汉';
		char c='A';
		c++;
		System.out.println(c);
		System.out.println((int)c);
		int i='Z'-'A';
		System.out.println(i);
		char d='\u0041';// \ u表示是16进制编码，0041是16进制的数
		System.out.println(d);
		char e=(char)(c+'a'-'A');//进行运算后默认整数型，需要转换为char型
		System.out.println(e);
		
//		System.out.println("abc\bd");
		System.out.println("abc\t123");
		System.out.println("a\t123");
		
	}

}

/**
 *字符类型，单个的字符：char
 *	单引号表示字符字面量：'a','1'
 *	
 *逃逸字符
 *\b回退一格					\n换行
 *\t到下一个表格位			\r回车
 *\"双引号					\'单引号
 *\\反斜杠本身
 */
