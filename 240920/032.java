package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//数组创建
//		int[] scores= {87,98,69,54,65,76,87,99};
//		System.out.println(scores.length);
//		for(int i=0;i<scores.length;i++)
//		{
//			System.out.print(scores[i]+" ");
//		}
//		System.out.println();
		//数组变量之间的赋值
//		int[] a=new int[10];
//		a[0]=5;
//		int[] b=a;
//		System.out.println(a[0]);
//		b[0]=16;
//		System.out.println(a[0]);
		//
//		int[] a1= {1,2,3,4,5};
//		int[] a2=a1;
//		for(int i=0;i<a2.length;i++)
//			a2[i]++;
//		for(int i=0;i<a1.length;i++)
//			System.out.print(a1[i]+" ");
		//数组变量之间的比较
//		int[] a= {1,2,3,4,5};
//		int[] b= {1,2,3,4,5};
//		System.out.println(a==b);
		//复制数组
		int[] a= {1,2,3,4,5};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		//判断数组元素逐个在相应位置上是否相等
		boolean isEqu=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=a[i])
			{
				isEqu=false;
				break;
			}
		}
		if(isEqu)
			System.out.println("相等");
		else
			System.out.println("不相等");
		
	}

}

/**
 *两种数组创建方式
 *	int[] goals=new int[4];
 *	int[] scores={87,89,56,74};
 *数据变量和数组变量的区别
 *	int i=5;i是数据的所有者
 *	int[] a=new int[10];a是数组的管理者
 *数组变量
 *	是数组的管理者而非数组本身
 *	数组必须创建出来然后交给数组变量来管理
 *	数组变量之间的赋值是管理权限的赋予
 *	数组变量之间的比较是判断是否管理同一个数组
 *
 */
