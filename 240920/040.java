package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
//		初始化字符串变量
		String s =new String("a string");
//		也可以直接用双引号创建，编译器会帮你创建一个String类的对象来交给t来管理
		String t ="hello";
		System.out.println(t+" world");
//		t=in.nextLine();
//		t=in.next();
//		System.out.println(t);
//		System.out.println(t=="bye");
//		System.out.println(t.equals("bye"));
//		
//		System.out.println(t.compareTo("see"));
//		System.out.println("".length());
//		System.out.println(t.charAt(3));
//		for(int i=0;i<t.length();i++)
//		{
//			System.out.println(t.charAt(i));
//		}
//		System.out.println(t.substring(1,3));
		
		String s1="0123A56739汉字";
		System.out.println(s1.indexOf('3'));
		int loc=s1.indexOf('3');
		System.out.println(s1.indexOf('3',loc+1));
		
	}

}

/**
 *字符串，用双引号括起来的0个或多个字符就是一个字符串字面量
 *	"hello","1",
 *字符串变量，String s，String的变量是对象的管理者而非所有者
 *	就像数组变量是数组的管理者而非所有者一样
 *	另外，String是一个类，不是基础类型之一
 *
 *输入字符串
 *	in.next();读入一个单词，单词的标志是空格，（空格包括空格、tab、换行）
 *in.nextLine();读入一整行
 *
 *String用.equals()区分值是否相等
 *String用.compareTo()比较大小
 *	s1.compareTo(s2);s1比s2小，结果是负的；相等，结果是0；s1比s2大，结果是正的
 *String用.compareToIgnoreCase()比较大小(不区分大小写)
 *String用.length()获取字符串的长度
 *String用.charAt(index)访问String里的字符
 *	返回在index上的单个字符
 *	index的范围是0到length()-1
 *	不能用for-each循环来遍历字符串
 *String用.substring()得到子串
 *	s.substring(n)得到n号位置到末尾的全部内容
 *	s.substring(b,e)得到n号位置到e号位置之前的内容
 *String用.indexOf()寻找字符
 *	s.indexOf(c)得到c字符所在的位置，-1表示不存在
 *	s.indexOf(c,n)从n号位置开始寻找c字符
 *	s.indexOf(t)找到字符串t所在的位置
 *String用.lastIndexOf()从右边开始寻找字符
 *String用.startsWith(t)字符串是否以另一个子字符串t开头
 *String用.endsWith(t)字符串是否以另一个子字符串t结尾
 *String用.trim()把字符串两端的空格删掉
 *String用.replace(c1,c2)把所有的c1都换成c2
 *String用.toLowerCase()把所有字母都变成小写字母
 *String用.toUpperCase()把所有字母都变成大写字母
 *
 *可以用Integer.parseInt(s)从String变量s中得到其所表达的整数数字；而Integer.parseInt(s, 16)从String变量s中得到其所表达的十六进制数字
 *
 *所有的字符串都是不可变的，对它们的操作结果都是创造出新的字符串出来
 *
 *switch-case除了整数变量和常数作为判断外，也可以用字符串作为判断
 *	switch(s){
 *	case "this":语句;break;
 *	case "that":语句;break;
 *	}
 *
 */
