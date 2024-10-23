package cell;

import java.awt.Graphics;

import animal.Animal;

public interface Cell {//定义一个接口，
	void draw(Graphics g,int x,int y,int size);
}

/**
 * 	接口，接口是纯抽象类
 *		所有的成员函数都是抽象函数
 *		所有的成员变量都是public static final
 *	接口规定了长什么样，但是不管里面有什么
 *	
 *	接口中所有的函数都是abstract，因此不需要添加修饰词abstract
 *
 *	类表达的是东西，接口表达的是概念、规范
 *
 *	public class Fox extends Animal implements Cell//继承Animal且实现Cell
 *
 *	
 *	interface是一种特殊的class,与class的地位一样的。
 *		定义变量的类型，定义参数的类型，定义函数的返回类型
 *
 *实现接口
 *	类用extends,接口用implements(继承、实现)
 *	类可以实现很多接口
 *	接口可以继承接口，但不能继承类
 *	接口不能实现接口
 *
 *如cell,field,view与animal,fox,rabbit，这是两个体系，
 *	cell作为接口，实现了两个体系间的连接，fox、rabbit实现cell就能调用field和view
 *
 *面向接口的编程方式
 *	设计程序时先定义接口，再实现类
 *	任何需要在函数间传入传出的一定是接口，而不是具体的类
 *	
 *
 */
