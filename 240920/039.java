package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=10;
		Integer k=10;
		k=i;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Character.isDigit('1'));
		
	}

}

/**
 *包裹类型：每种基础类型都有对应的包裹类型
 *boolean	Boolean
 *char		Character
 *int		Integer
 *double	Double
 *
 *.运算符，让一个类或者对象做事情
 *
 *包裹类型的作用
 *	获取该类型的最大最小值Integer.MIN_VALUE	Integer.MAX_VALUE
 *		Character的方法
 *		static boolean isDigit(char ch);判断是不是数字
 *		static boolean isLetter(char ch);字母
 *		static boolean isLetterOrDigit(char ch);字母或数字
 *		static boolean isLowerCase(char ch);小写字母
 *		static boolean isUpperCase(char ch);大写字母
 *		static boolean isWhitespace(char ch);空格
 *		static char toLowerCase(char ch);字符转换成小写
 *		static char toUpperCase(char ch);字符转换成大写
 */
