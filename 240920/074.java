package cell;

import java.awt.Graphics;

import animal.Animal;

public interface Cell {//定义一个接口，
	void draw(Graphics g,int x,int y,int size);
}

/**
 *java关键字顺序：1. Annotations。2. public。3. protected。4. private。5. abstract。6. static。
 *	7. final。8. transient。9. volatile。10. synchronized。11. native。12. strictfp。
 *
 *View view = new View(field);
 * //JFrame frame = new JFrame();
 *frame = new JFrame();//frame拿出来作为类的成员变量，private JFrame frame;
 *frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//让frame界面有个默认的关闭的按钮
 *frame.setResizable(false);//不可以改变大小
 *frame.setTitle("Cells");//标题是Cells
 *frame.add(view);
 *JButton btnStep=new JButton("单步");
 * //frame.add(btnStep);
 *frame.add(btnStep,BorderLayout.NORTH);
 *btnStep.addActionListener(new ActionListener(){
 *	@override
 *	public void actionPerformed(ActionEvent e){
 *		System.out.println("按下了！");
 *		step();
 *		frame.repaint();
 *	}
 *});
 *frame.pack();//自己决定大小
 *frame.setVisible(true);//画出图像
 *
 *这一套图形机制叫Swing
 *	在容器(界面/窗口/图形)中，看到的所有东西是部件
 *容器frame中，有各种部件如btnStep,部件可以放在容器里
 *	容器也是一种部件，容器也可以被放在另外一种容器里
 *	view也是一个容器，在view里面能画出网格，而view是能加到frame中去的
 *容器对当中的部件的管理
 *	部件在哪里，部件显示出来多大
 *	容器对部件的管理手段叫做布局管理器(layout manager)
 *	上面frame默认采用的布局管理器叫Border
 *	BorderLayout将容器划分为五个区域，NORTH、SOUTH、EAST、WEST、CENTER
 *
 *消息机制：用户在图形界面上所作的操作，这个操作如何让程序知道这中间走过去的路径
 *	java Swing的消息机制
 *
 *java未采取的注入方式
 *	JButton
 *	MyButton extends JButton//MyButton override JButton中的一个doprint函数，然后函数输入并执行
 *		System.out.println("按下了！");
 *		step();
 *		frame.repaint();
 *
 *反转控制(注入反转)
 *	Swing的消息机制
 *	JButton提供了一个ActionListener接口，通过addActionListener和removeActionListener调用
 *	ActionListener接口中有个actionPerformed()函数
 *	如果实现了ActionListener接口的一个对象，那么对象中也有actionPerformed()函数
 *		然后将该对象通过addActionListener函数注册给JButton
 *		注册进去的是运行时刻动态的一个对象，而按钮被按下去时JButton会检查是否被注册
 *	
 *
 *
 *
 */
