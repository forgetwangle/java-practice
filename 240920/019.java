package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=(int)( Math.random()*100+1);
		int count=0;
		int guess;
		do {
			guess=in.nextInt();
			count++;
			if(guess>number)System.out.println("猜大了");
			else if(guess<number)System.out.println("猜小了");
		}while(guess!=number);
		System.out.println("恭喜，你猜了"+count+"次");
		
	}

}

/**
 *
 */
