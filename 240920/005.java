package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		int foot;
		double inch;
		foot=(int)(30/3.0);
		Scanner in=new Scanner(System.in);
		foot=in.nextInt();
		inch=in.nextDouble();
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
		
		in.close();
	}

}

/**
 *强制类型转换
 */
