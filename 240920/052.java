package vendingmachine;

public class VendingMachine {
	//自动售货机的属性
	int price =80;//商品价格
	int total;//总收入
	int balance=f();//结账，初始化时调用函数
	
	VendingMachine()//无参构造函数：会在新建对象时自动调用构造函数
	{
		total=0;//构造函数会先去函数外对成员变量进行初始化，而后进入函数内执行语句
	}

	VendingMachine(int price)//含参构造函数，重载
	{
		this();//this()只能在构造函数里出现，只能是构造函数的第一句且只能使用一次
		this.price=price;
	}
	
	int f()
	{
		return 0;
	}
	
	void setPrice(int price)
	{
		this.price=price;
		this.getFood();
	}
	
	void showPrompt()
	{
		System.out.println("welcome");
	}
	
	void insertMoney(int amount)
	{
		balance+=amount;
		showBalance();//函数内部可以直接调用成员的其他函数
	}
	
	void showBalance()
	{
//		System.out.println(balance);等价于this.balance
		System.out.println(this.balance);
	}
	
	void getFood()
	{
		if(balance>=price) {
			System.out.println("here you are");
			balance-=price;
			total+=price;
		}
	}

	public static void main(String[] args) {
		VendingMachine vm=new VendingMachine();//调用无参构造函数
		vm.showPrompt();//用.运算符调用某个对象的函数
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		VendingMachine vm1=new VendingMachine(100);//调用含参构造函数
		
	}

}

/**
 *创建对象
 *VendingMachine v=new VendingMachine();
 *对象变量是对象的管理者而非所有者
 *
 *.运算符使用类的方法
 *
 *类定义了对象中所具有的变量，这些变量称作成员变量
 *每个对象有自己的变量，和同一个类的其他对象是分开的
 *
 *this是成员函数的一个特殊的固有的本地变量，它表达了调用这个函数的那个对象
 *
 *调用函数
 *通过.运算符调用某个对象的函数
 *在成员函数内部直接调用自己(this)的其他函数
 *
 *定义在函数内部的变量是本地变量
 *	本地变量的作用域和生存期都是函数内部
 *定义在函数外部的变量是成员变量
 *	成员变量的生存期是对象的生存期，作用域是类内部的成员函数
 *
 *java不会对本地变量进行初始化，
 *java会将成员变量初始化为0（boolean值初始化为false，对象变量初始化为null）
 *
 *成员变量可以在定义的地方就给出初始值
 *没有给出初始值的成员变量会自动获得0值
 *定义初始化可以调用函数，甚至可以使用已经定义的成员变量
 *
 *构造函数
 *如果一个成员函数的名字和类的名字完全相同，则在创建这个类的每一个对象的时候会自动调用这个函数
 *构造函数不能有返回类型
 *
 *函数重载
 * 一个类可以有多个构造函数，只要它们的参数表不同
 * 创建对象时给出不同的参数值，就会自动调用不同的构造函数
 * 通过this()还可以调用其他的构造函数
 * 一个类里同名但参数表不同的函数构成了重载关系
 */
