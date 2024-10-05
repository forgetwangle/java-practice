package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		boolean isPrime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
				System.out.println(n+"不是素数,i="+i);
				break;
			}
		}
		if(isPrime)
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
 *逻辑类型
 *	结果是一个逻辑值true或false
 *逻辑运算，对逻辑量进行的运算
 *	!逻辑非
 *	&&逻辑与
 *	||逻辑或
 *运算优先级
 *	!>&&>||
 *所有运算优先级
 *1	()					从左到右
 *2	! + - ++ --			从右到左（单目的+和-）
 *3	* / %				从左到右
 *4	+ -					从左到右
 *5	< <= > >=			从左到右
 *6	== !=				从左到右
 *7	&&					从左到右
 *8	||					从左到右
 *9	= += -= *= /= %=	从右到左
 */
