package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] data= {3,2,5,7,4,9,11,34,12,28};
		int x=in.nextInt();
		int loc=-1;
		boolean found=false;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==x)
			{
				loc=i;
				break;
			}
		}
		for(int k:data)//for-each循环
		{
			if(k==x)
				found=true;
		}
		if(loc!=-1)
		{
			System.out.println(x+"存在，位置为"+(loc+1));
		}
		else
		{
			System.out.println(x+"不存在");
		}
		
	}

}

/**
 *for-each
 *	for(<类型> <变量>:<数组>){}
 *
 */
