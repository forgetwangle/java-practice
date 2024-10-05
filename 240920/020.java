package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number;
		int digit;
		int result=0;
		number=in.nextInt();
		do {
			digit=number%10;
			result=result*10+digit;
			number/=10;
//			System.out.print(digit);
		}while(number!=0);
		System.out.println(result);
		
	}

}

/**
 *
 */
