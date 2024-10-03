package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
//		int max=y;
//		if(x>y)max=x;
//		if(max<z)max=z;
		int max=0;
		if(x>y)
			if(x>z)max=x;
			else max=z;
		else
			if(y>z)max=y;
			else max=z;
		System.out.println("最大值是"+max);
	}

}

/**
 *嵌套和级联的判断
 */
