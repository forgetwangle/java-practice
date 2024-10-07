package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean[] isPrime=new boolean[100];
		for(int i=0;i<isPrime.length;i++)
		{
			isPrime[i]=true;
		}
		for(int i=2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				for(int j=2;i*j<isPrime.length;j++)
				{
					isPrime[i*j]=false;
				}
			}
		}
		
//		int[] primes=new int[50];
//		primes[0]=2;
//		int cnt=1;
//		MAIN_LOOP:
//		for(int x=3;cnt<primes.length;x++)
//		{
//			for(int i=0;i<cnt;i++)
//			{
//				if(x%primes[i]==0)
//					continue MAIN_LOOP;
//			}
//			primes[cnt++]=x;
//		}
		
		for(int i=2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
//		for(int k:primes)
//		{
//			System.out.print(k+" ");
//		}
		
	}

}

/**
 *要判断x是不是素数
 *就判断x能否被已知的且<x的素数整除
 *	构造前50个素数的表
 *令x=2
 *将2x,3x,…,4x直至ax<n的数标记为素数
 *令x为下一个没有被标记为素数的数，重复上述步骤
 */
