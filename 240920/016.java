package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int count=0;
		while(number>0) {
			number/=10;
			count++;
		}
		System.out.println("位数是"+count);
		
	}

}

/**
 *
 */

