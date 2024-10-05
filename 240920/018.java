package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number;
		int count=0;
		int sum=0;
//		do {
//			number=in.nextInt();
//			if(number!=-1)
//			{
//				sum+=number;
//				count++;
//			}
//		}while(number!=-1);
		number=in.nextInt();
		while(number!=-1) {
			sum+=number;
			count++;
			number=in.nextInt();
		}
//		System.out.println("平均数是："+1.0*sum/count);
		if(count>0) {//边界条件
			System.out.println("平均数是："+(double)sum/count);
		}
			
	}

}

/**
 *
 */
