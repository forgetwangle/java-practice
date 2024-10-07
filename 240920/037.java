package yszl;

import java.util.Scanner;

public class Ngzs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		final int SIZE=3;
		int[][] board=new int[SIZE][SIZE];
		boolean gotResult=false;
		int numOfX=0;
		int numOfO=0;
		
		//读入矩阵
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=in.nextInt();
			}
		}
		//检查
		MAIN_LOOP:
		while(!gotResult) {
			for(int i=0;i<SIZE;i++)
			{
				numOfX=0;
				numOfO=0;
				for(int j=0;j<SIZE;j++)
				{
					if(board[i][j]==1)
					{
						numOfX++;
					}
					else
					{
						numOfO++;
					}
				}
				if(numOfX==3||numOfO==3)
					break MAIN_LOOP;
			}
			numOfX=0;
			numOfO=0;
			for(int i=0;i<SIZE;i++)
			{
				if(board[i][i]==1)
				{
					numOfX++;
				}
				else
				{
					numOfO++;
				}
				if(numOfX==3||numOfO==3)
					break MAIN_LOOP;
			}
			numOfX=0;
			numOfO=0;
			for(int i=0;i<SIZE;i++)
			{
				if(board[i][SIZE-1-i]==1)
				{
					numOfX++;
				}
				else
				{
					numOfO++;
				}
				if(numOfX==3||numOfO==3)
					break MAIN_LOOP;
			}
			
		}
		
	}

}

/**
 *二维数组
 *int[][] a=new int[3][5];
 *	通常理解为a是一个3行5列的矩阵
 *	遍历
 *		for(i=0;i<3;i++)
 *		{
 *			for(j=0;j<5;j++)
 *			{
 *				a[i][j]=i*j;
 *			}
 *		}
 *	初始化
 *		int[][] a={
 *			{1,2,3,4},
 *			{1,2,3},
 *		};
 */
