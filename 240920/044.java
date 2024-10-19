package yszl;

import java.util.Scanner;

public class Ngzs {
	public static void sum(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println(a+"到"+b+"的和是"+sum);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
//		int i;
//		int sum;
//		sum=0;
//		for(i=1;i<=10;i++) {
//			sum+=i;
//		}
//		System.out.println(1+"到"+10+"的和是"+sum);
//		sum=0;
//		for(i=20;i<=30;i++) {
//			sum+=i;
//		}
//		System.out.println(1+"到"+10+"的和是"+sum);
//		sum=0;
//		for(i=35;i<=45;i++) {
//			sum+=i;
//		}
//		System.out.println(1+"到"+10+"的和是"+sum);
		sum(1,10);
		sum(20,30);
		sum(35,45);
		
	}

}

/**
 *函数是一块代码，可以接收零个或多个参数，返回零个或一个值
 *
 *如果函数有参数，调用时必须传递给它数量、类型正确的值
 *可以传递给函数的值是表达式的结果，包括：
 *	字面量max(10,12)
 *	变量max(a,b)
 *	函数的返回值max(max(c,a),15)
 *	计算结果
 *
 *当函数期待的参数类型比调用函数时给的值的类型宽的时候，编译器自动转换好类型
 *	char->int->double
 *	反之需要强制类型转换，(int)5.0
 *
 *java语言在调用函数时，永远只能传值给函数
 *
 *定义在块内部的变量就是本地变量，函数的参数也是本地变量
 *本地变量的生存期和作用域均在 大括号内（块）
 *调用函数时给参数的值是为了：让参数在进入函数时被初始化
 */
