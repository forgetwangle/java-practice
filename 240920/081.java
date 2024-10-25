package yszl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ngzs {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		byte[] buf=new byte[10];
		for(int i=0;i<buf.length;i++) {
			buf[i]=(byte)i;
		}
		try {
			FileOutputStream out=new FileOutputStream("a.dat");
			out.write(buf);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

/**
 * 文件流：直接写文件或者读文件
 * 	FileInputStream
 * 	FileOutputStream
 * 	对文件作读写操作
 * 	实际工程中已经较少使用
 * 		更常用的是以在内存数据或通信数据上建立的流，如数据库的二进制数据读写或网络端口通信
 * 		具体的文件读写往往有更专业的类，比如配置文件和日志文件
 * 
 * 流过滤器
 * 	以一个介质流对象为基础层层构建过滤器流，最终形成的流对象能在数据的输入输出过程中，
 * 		逐层使用过滤器流的方法来读写数据
 * 	所谓过滤器流，就是在已经有的文件流的基础上，去增加一层层的过滤器，
 * 		每一层的过滤器可以去做一些事情
 * 		其中有一些过滤器就可以做那些基础数据、基础类型(int float double等)的读写
 * 
 *
 */
