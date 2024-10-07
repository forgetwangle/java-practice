package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] primes=new int[50];
		primes[0]=2;
		int cnt=1;
		MAIN_LOOP:
		for(int x=3;cnt<primes.length;x++)
		{
			for(int i=0;i<cnt;i++)
			{
				if(x%primes[i]==0)
					continue MAIN_LOOP;
			}
			primes[cnt++]=x;
		}
		for(int k:primes)
		{
			System.out.print(k+" ");
		}
		
	}

}

/**
 *要判断x是不是素数
 *就判断x能否被已知的且<x的素数整除
 *	构造前50个素数的表
 */
