package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int f=0;
		if(x>0) {
			f=-1;
		}else if(x==0) {
			f=0;
		}else f=2*x;//级联
		System.out.println("f的值为："+f);
		scan.close();
	}

}

/**
 *嵌套和级联的判断
 */

