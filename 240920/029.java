package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x;
		int[] numbers=new int[100];//定义了一个数组
		int cnt=0;
		double sum=0;
		x=in.nextInt();
		while(x!=-1) 
		{
			numbers[cnt]=x;
			sum+=x;
			cnt++;
			x=in.nextInt();
		}
		if(cnt>0) {
			double average=sum/cnt;
			for(int i=0;i<cnt;i++)
			{
				if (numbers[i]>average)
				{
					System.out.print(numbers[i]+" ");
				}
			}
			System.out.println();
			System.out.println("平均数是："+average);
		}
		
	}

}

/**
 *数组
 *	其中的元素具有相同的数据类型
 *	一旦创建，不能改变大小
 *数组元素个数
 *	必须是整数
 *	必须给出
 *	可以是变量
 *<类型>[] <名字>=new <类型>[元素个数];
 */
