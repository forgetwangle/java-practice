package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int type=in.nextInt();
		switch(type) {
		case 1:
		case 2:
			System.out.println("你好！");
			break;
		case 3:
			System.out.println("早上好！");
		case 4:
			System.out.println("再见！");
			break;
		default:
			System.out.println("什么？");
			break;
		}
		in.close();
	}

}

/**
 *switch(控制表达式){
 *	case 常量:
 *		语句;
 *	case 常量:
 *		语句;break;
 *	default:
 *		语句;
 *}
 *控制表达式只能是整数型的结果
 *常量可以是常数，也可以是常数计算的表达式
 */
