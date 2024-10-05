package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		OUT:
		for(int one=0;one<=amount;one++) {
			for(int five=0;five<=amount/5;five++) {
				for(int ten=0;ten<=amount/10;ten++) {
					for(int twenty=0;twenty<=amount/20;twenty++) {
						if(one+five*5+ten*10+twenty*20==amount) {
							System.out.println(one+"张1元，"+five+"张5元，"+ten+"张10元，"+twenty+"张20元");
							break OUT;
						}
					}
				}
			}
		}
		
	}

}

/**
 *在循环前可以放一个标号来标示循环
 *	label:
 *带标号的break和continue对那个循环起作用
 */
