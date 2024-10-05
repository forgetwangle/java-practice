package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int isPrime=1;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=0;
				System.out.println(n+"不是素数,i="+i);
				break;
			}
		}
		if(isPrime==1)
		{
			System.out.println(n+"是素数");
		}
		else
		{
			System.out.println(n+"不是素数");
		}
		
	}

}

/**
 * 复合赋值+=,-=,*=,/=,%=
 *i=6;
 *a=i++;->a=6
 *a=++i;->a=7
 *循环控制
 *break离开循环
 *continue离开这一轮循环
 */
