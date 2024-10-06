package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double sum=0.0;
		double sign=1.0;
//		for(int i=1;i<=n;i++) 
//		{
//			//方法一
////			sum+=sign/i;
////			sign*=-1;
//			//方法二
////			if(i%2==1) 
////			{
////				sum+=1.0/i;
////			}
////			else
////			{
////				sum-=1.0/i;
////			}			
//		}
		//方法三
		for(int i=1;i<=n;i++,sign*=-1)
		{
			sum+=sign/i;
		}
//		System.out.println("和为："+sum);
		System.out.printf("%.2f",sum);
		
	}

}

/**
 *System.out.printf()有点类似c中的printf()
 */
