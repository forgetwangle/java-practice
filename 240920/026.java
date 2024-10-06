package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double sum=0.0;
		for(int i=1;i<=n;i++) 
		{
			sum+=1.0/i;
		}
//		System.out.println("和为："+sum);
		System.out.printf("%.2f",sum);
		
	}

}

/**
 *
 */
