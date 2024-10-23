package cell;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//外部类
class OkListener implements ActionListener {
	private Cell aa;
	public OkListener(Cell a) {
		aa=a;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("按了一次");
		aa.step;
		aa.repaint();
	}		
}

public class Cell {
	private JFrame frame;
	
	public void repaint() {
		frame.repaint(); 
	}
	
	//内部类
	//内部类，是Cell的一个成员，和成员变量、成员函数一样，可以访问其他成员以及其他成员函数
	private class StepListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("按了一次");
			step();//调用其他的成员函数
			frame.repaint();//访问其他的成员变量
		}		
	}
	
	public Cell() {
		System.out.println("s");
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		JButton btnStep=new JButton("单步");
		frame.add(btnStep);
		btnStep.addActionListener(new StepListener());
		
		//这儿是定义了一个匿名类
		btnStep.addActionListener(new ActionListener()//ActionListener是一个接口
		{//下面的代码块是定义了一个实现了ActionListener接口的新的类
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("按下了！");
				step();
				frame.repaint();
			}
		});
		frame.pack();//自己决定大小
		frame.setVisible(true);
	}
}

/**
 *外部类
 *内部类
 *	定义在别的类内部、函数内部的类
 *	内部类能直接访问外部的全部资源
 *		包括任何私有的成员
 *		外部是函数时，只能访问那个函数里final的变量
 *			可以访问函数的final的本地变量，也可以访问函数所在类的成员变量和成员函数
 *匿名类
 *	在new 对象的时候给出的类的定义形成了匿名类
 *	匿名类可以继承某类，也可以实现某接口
 *	Swing的消息机制广泛使用匿名类
 *	匿名类也是内部类	
 *
 *
 *注入反转
 *	由按钮公布一个守听者接口和一对注册/注销函数
 *	你的代码实现那个接口，将守听者对象注册在按钮上
 *	一旦按钮被按下，就会反过来调用你的守听者对象的某个函数
 *
 */
