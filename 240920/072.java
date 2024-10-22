package cellmachine;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;

public class CellMachine {

	public static void main(String[] args) {
		//准备数据
		Field field = new Field(30,30);
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				if ( Math.random() < 0.2 ) {
					cell.reborn();
				}
			}
		}
		//画图
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//让frame界面有个默认的关闭的按钮
		frame.setResizable(false);//不可以改变大小
		frame.setTitle("Cells");//标题是Cells
		frame.add(view);
		frame.pack();//自己决定大小
		frame.setVisible(true);//画出图像
		
		for ( int i=0; i<1000; i++ ) {
			for ( int row = 0; row<field.getHeight(); row++ ) {
				for ( int col = 0; col<field.getWidth(); col++ ) {
					Cell cell = field.get(row, col);
					Cell[] neighbour = field.getNeighbour(row, col);
					int numOfLive = 0;
					for ( Cell c : neighbour ) {
						if ( c.isAlive() ) {
							numOfLive++;
						}
					}
					System.out.print("["+row+"]["+col+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfLive+"-->");
					if ( cell.isAlive() ) {
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();
							System.out.print("die");
						}
					} else if ( numOfLive == 3 ) {
						cell.reborn();
						System.out.print("reborn");
					}
					System.out.println();
				}
			}
			System.out.println("UPDATE");
			frame.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

/**
 * Field 是data
 * View 是presentation
 * 
 * View和Field是表现和数据的关系，
 * 	View只管根据Field画出图形
 * 	Field只管数据的存放
 * 	一旦数据更新后，通知View重新画出整个画面
 * 		不去精心设计哪个局部需要更新
 * 		这样简化了程序逻辑
 * 		实在计算机运行速度提高的基础上实现的
 * 
 * 数据与表现分离
 * 	程序的业务逻辑与表现无关
 * 		表现可以是图形的，也可以是文本的
 * 		表现可以是当地的，也可以是远程的
 * 
 * control、model、view三分离
 * 
 * 将程序要实现的功能分配到合适的类/对象中去是设计中非常重要的一环
 * 	单个类的功能要设计得单一
 * 
 * 网格化
 * 	图形界面本身有更高的解析度
 * 	但是将画面网格化后，数据就更容易处理了
 * 
 * 
 * Q1：为什么不是在Cell提供一个函数setAlive(boolean),而是采用两个函数die()、reborn()
 * A1：让alive的设置脱离if-else判断
 * 
 * Q2：为什么Field.getNeighbour()不直接看Cell.isAlive来返回一个数字，而是返回一个数组让外面数数
 * A2：数据与操作分离，仅保留了Field细胞表格这么一个数据，返回数字是一个操作；哪怕新增一个变量存储数字，也会污染原本单一的数据
 * 
 * Q3：为什么不是由Cell自己判断自己的邻居的情况来决定自己是死是活
 * A3：现在仅是将Cell引入到了Field，如果Cell要判断的话，则要将Field引入到Cell,增加了耦合度，(类与类之间的关系越松越好)
 * 
 */
