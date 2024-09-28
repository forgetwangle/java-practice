package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
//		int max=0;
//		if(x>y) {
//			max=x;
//		}else max=y;
		int max=y;
		if(x>y)max=x;
		System.out.println("最大值是"+max);
	}

}

/**
 *
 */
