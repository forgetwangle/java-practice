package yszl;

import java.util.Scanner;

public class Ngzs {
	
	public static void main(String[] args) {
		System.out.println("ss");
		
	}

}

/**
 *public abstract class Shape{
 *	public abstract void draw(Graphics g);//抽象类的抽象方法没有{}
 *}
 *抽象类不能产生对象
 *
 *抽象函数：表达概念而无法实现具体代码的函数
 *抽象类：表达概念而无法构造出实体的类
 *	带有abstract修饰符的函数
 *	有抽象函数的类一定是抽象类
 *	Shape circle=new Circle();//Circle extends Shape
 *	抽象类不能制造对象,不能new Shape()
 *	但是可以定义变量，但能Shape circle
 *		任何继承了抽象类的非抽象类的对象可以付给这个变量
 *			指的是管理子类的对象的变量
 *
 *实现抽象函数
 *	继承自抽象类的子类必须覆盖父类中的抽象函数(或者说实现抽象类里的所有抽象函数)
 *	否则这个子类就成为了抽象类，成为抽象类后(前缀要加上abstract，也不能制造对象)
 *
 *在继承中，子类继承了父类所有的方法
 *
 *两种抽象：
 *	1，与具体相对，表达一种概念而非实体
 *	2，与细节相对，表达一定程度上忽略细节而着眼大局
 *	
 */
