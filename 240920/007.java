package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		//初始化
		Scanner in=new Scanner(System.in);
		//读入投币金额
		System.out.print("请投币：");
		int amount=in.nextInt();
		System.out.println(amount>=10);
		//计算并打印找零
		if(amount>10) {
			System.out.println("找零："+(amount-10));
		}
		
		
		in.close();
	}

}

/**
 *
 */
