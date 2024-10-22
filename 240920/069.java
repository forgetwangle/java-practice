package cell;

import java.awt.Graphics;
 
public class Cell {
	private boolean alive = false;
	
	public void die() { alive = false; }
	public void reborn() { alive = true; }
	public boolean isAlive() { return alive; }
	
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size);
		if ( alive ) {
			g.fillRect(x, y, size, size);
		}
	}
}


/**
 * 细胞自动机
 * 	死亡：如果活着的邻居数量<2或>3，则死亡
 * 	新生：如果正好有3个邻居活着，则新生
 * 	其他情况则保持原状
 * 
 * 看懂一个新的程序：
 * 	1，找main,努力读懂每一句，这一句中提到了一些什么样的类，然后再展开去看那个类
 * 	2，去找一个最小的类，找一个很细节的类，然后去追父类，一直追追追，追到最顶上的一个父类，然后从细节开始看懂每一个小部件在干什么
 * 
 */
