package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		double a=1.0;
		double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(a==b);
		System.out.println("a="+a+",b="+b);
		System.out.println(Math.abs(a-b)<1e-6);
//		System.out.println(5==5.0);
		//初始化
		Scanner in=new Scanner(System.in);
		//读入投币金额
		System.out.print("请投币：");
		int amount=in.nextInt();
		System.out.println(amount>=10);
		//计算并打印找零
		System.out.println("找零："+(amount-10));
		
		
		in.close();
	}

}

/**
 *关系运算
 *==,!=,>,>=,<,<=
 *==和!=的优先级最低
 */
