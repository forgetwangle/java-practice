package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World你好");
		Scanner in=new Scanner(System.in);
//		System.out.println("echo: "+in.nextLine());
//		System.out.println("2+3="+5);
//		System.out.println(2+3+"=2+3="+(2+3));
//		System.out.println(100-23+"=100-23="+(100-23));
//		System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));
		int amount=100;
//		final int amount=100;	
		int price=0;//初始化
		System.out.print("请输入票面：");
		amount=in.nextInt();
		System.out.print("请输入金额：");
		price=in.nextInt();
//		System.out.println("100-"+price+"="+(100-price));
		System.out.println(amount+"-"+price+"="+(amount-price));
	}

}

/*

alt加/注释
System.out.println()中以+号连接不同输出
shift加方向键选中好几行

变量定义一般形式
	<类型名称><变量名称>;
int price;
int price,amount;
变量的名字是一种标识符

*/

