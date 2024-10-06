package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] primes=new int[50];
		primes[0]=2;
		int x=in.nextInt();
		boolean isPrime=true;
		if(x==1||x%2==0&&x!=2)
		{
			isPrime=false;
		}
		else
		{
//			for(int i=3;i<x;i+=2) {//n/2遍
			for(int i=3;i<=Math.sqrt(x);i+=2) {//sqrt(n)遍
				if(x%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime)System.out.println("是素数");
		
	}

}

/**
 *
 */
