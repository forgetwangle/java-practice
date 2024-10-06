package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int cnt=0;
		double sum=0;
		cnt=in.nextInt();
		if(cnt>0) {
			int[] numbers=new int[cnt];//数组元素个数可以是变量
			for(int i=0;i<cnt;i++)
			{
				numbers[cnt]=in.nextInt();
				sum+=numbers[cnt];
			}
			double average=sum/cnt;
			for(int i=0;i<numbers.length;i++)
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
 *数组的内部成员length,数组元素个数
 */
