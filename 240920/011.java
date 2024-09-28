package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		final int PASS=60;
		Scanner scan=new Scanner(System.in);
		System.out.print("你的成绩是：");
		int score=scan.nextInt();
		System.out.println("你输入的成绩是："+score);
		if(score<PASS)
			System.out.println("很遗憾，没有及格。");
		else
			System.out.println("恭喜你，及格了。");
		scan.close();	
	}

}

/**
 *
 */
