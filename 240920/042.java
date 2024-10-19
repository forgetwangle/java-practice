package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		if(m==1)m=2;
		int cnt=0;
		int sum=0;
		for(int i=m;i<=n;i++) {
			//判断
			boolean isPrime=true;
			for(int k=2;k<i;k++) {
				if(i%k==0) {
					isPrime=false;
					break;
				}
			}
			//做计算
			if(isPrime) {
				cnt++;
				sum+=i;
			}
		}
		System.out.println("共"+cnt+"个数，和为"+sum);
		
	}

}

/**
 *
 */
