package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		int foot;
//		int inch;
		double inch;
		System.out.println(1.2-1.1);
		Scanner in=new Scanner(System.in);
		foot=in.nextInt();
//		inch=in.nextInt();
		inch=in.nextDouble();
		System.out.println(10/3);
		System.out.println("foot="+foot+" inch="+inch);
//		System.out.println((foot+inch/12.0)*0.3048);
		System.out.println((foot+inch/12)*0.3048);
		
		
		in.close();
	}

}

/**
 * 两个整数的运算结果只能是整数
 * 10和10.0在java中是完全不同的两个数
 * 10.0是浮点数
 */

