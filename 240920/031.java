package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x;
		int[] numbers=new int[10];
		for(int i=0;i<numbers.length;i++)
			System.out.print(numbers[i]+",");
		System.out.println();
		x=in.nextInt();
		while(x!=-1) 
		{
			if(x>=0&&x<=9)
			{
				numbers[x]++;
			}
			x=in.nextInt();
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(i+"有"+numbers[i]+"个,");
		}
		
	}

}

/**
 *
 */
