package fileinoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Inet4Address;
import java.net.Socket;

class Student implements Serializable{//将这样一个类的对象写到文件里，并且将来读出来
//	首先实现接口Serializable,可以被串行化的类
	private String name;
	private int age;
	private int grade;
	
	public Student(String name,int age,int grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	
	public String toString() {
		return name+" "+age+" "+grade;
	}
}

public class Hello {
	
	public static void main(String[] args) {
		try {
			Student s1=new Student("John",18,5);
			System.out.println(s1);
//			构造一个可以把这样一个s1直接写到文件里面去的方式，用ObjectOutputStream
			ObjectOutputStream out=new ObjectOutputStream(//ObjectOutputStream是一个可以用来直接把对象写进去的流
					new FileOutputStream("obj.dat"));
			out.writeObject(s1);//将s1写进out
			out.close();//obj.dat除了有数据外，还有
			ObjectInputStream in=new ObjectInputStream(
					new FileInputStream("obj.dat"));//ObjectInputStream也是建立在FileInputStream的基础上的
			Student s2=(Student) in.readObject();//之前写进obj.dat的是Student
			//当用readObject从一个流里面重新去反串行化，构造新的对象时，会另外构造一个新的对象给我们，和写进去的对象值一样
			System.out.println(s2);
			in.close();
			System.out.println(s1==s2);
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}


/**
 * 如果我们想把自己写的一个类，(类里面可能有很多数据)
 * 	1，把类中的东西格式化，用println、printf去输出，之后用Scanner读进来
 * 	2，类中的成员都是基本数据类型，那么这些基本数据类型就可以用DataOutputStream来输出
 * 	3，把这个类的对象整个写到文件里或流里，使用串行化
 * 	
 * 
 * 对象串行化
 * ObjectInputStream类
 * 	readObject()
 * ObjectOutputStream类
 * 	writeObject()
 * Serializable接口
 * 
 * 
 */
