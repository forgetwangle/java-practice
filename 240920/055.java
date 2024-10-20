package yszl;

import java.util.Scanner;
/**
 * 只要用到的类不在同一个包内，就需要import
 * import display.Display;
 * class Clock{
 * 	Display hour=new Display(24);
 * }
 * 也可以不import，而是给出全名
 * class Clock{
 * 	display.Display hour=new display.Display(24);
 * }
 */
/**
 * 一个类Ngzs前面有public修饰词时，任何人可以用这个类的定义来定义变量
 * 但如果这个类是public 的，那么它必须处于一个与它同名的源代码文件里
 * 
 * 每个java文件(一个源代码文件)就是一个编译单元
 * 编译单元是指在编译时的一次对这个编译单元去做编译的动作
 * 一个编译单元中可以有不止一个类，但只有一个类可以是public的(与编译单元同名的类)
 */
public class Ngzs {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		
	}

}

/**
 *对象和类，类定义了对象，对象是类的实体
 *对象=属性+服务
 *	数据：属性或状态
 *	操作：函数
 *封装：把数据和对数据的操作放在一起，由操作保护内部的数据
 *
 *private
 *只有这个类内部可以访问
 *	类内部指类的成员函数和类的初始化
 *	这个限制是对类的，而不是对对象的
 *public
 *
 *friendly
 *	(不加任何词，比如int x;时，默认是friendly的)
 *	和它位于同一个包内的其他类可以访问
 */

