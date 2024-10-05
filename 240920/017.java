package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int count=0;
		do {
			number/=10;
			count++;
			System.out.println("number="+number+",count="+count);
		}while(number>0);
		System.out.println("位数是"+count);
		
	}

}

/**
 *测试程序所用的边界数据
 *个位数，10，0，负数
 */
