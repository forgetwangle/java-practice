package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
//		int a=in.nextInt();
//		int b=in.nextInt();
//		int gcd=1;
//		for(int i=2;i<=a&&i<=b;i++) {
//			if(a%i==0 && b%i==0)
//			{
//				gcd=i;
//			}
//		}
//		System.out.println("a和b的最大公约数是:"+gcd);
		int a=in.nextInt();
		int b=in.nextInt();
		int oa=a;
		int ob=b;
		while(b!=0)
		{
			int r=a%b;
			System.out.println(a+","+b+","+r);
			a=b;
			b=r;
		}
		System.out.println(oa+"和"+ob+"的最大公约数是："+a);
		
	}

}

/**
 *
 */
