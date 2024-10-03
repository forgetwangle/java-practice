package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		//初始化
		Scanner in=new Scanner(System.in);
		int balance=0;
		
		while(true)
		{
			//读入投币金额
			System.out.print("请投币：");
			int amount=in.nextInt();
//			System.out.println(amount>=10);
			balance=balance+amount;
			//计算并打印找零
			if(balance>=10) {
				System.out.println("找零："+(balance-10));
				balance=0;
			}
		}
		
	}

}

/**
 *
 */
