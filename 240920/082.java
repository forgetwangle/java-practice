package fileinoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		byte[] buf=new byte[10];
		for(int i=0;i<buf.length;i++) {
			buf[i]=(byte)i;
		}
		try {
			DataOutputStream out=new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("a.dat")));//将基本数据类型以二进制的形式写到文件里去
//			int i=0xcafebabe;
			int i=123456;
			out.writeInt(i);//DataOutputStream以二进制的形式，把数据在内存中的二进制，原封不动地写到文件里去
			out.close();
			DataInputStream in=new DataInputStream(//读写基础数据类型
					new BufferedInputStream(//缓冲
							new FileInputStream("a.dat")));
			int j=in.readInt();
			System.out.println(j);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

/**
 * 流过滤器
 * 	以一个介质流对象为基础层层构建过滤器流，最终形成的流对象能在数据的输入输出过程中，
 * 		逐层使用过滤器流的方法来读写数据
 * 	所谓过滤器流，就是在已经有的文件流的基础上，去增加一层层的过滤器，
 * 		每一层的过滤器可以去做一些事情(buffer缓冲，data读写基本数据类型)
 * 		其中有一些过滤器就可以做那些基础数据、基础类型(int float double等)的读写
 * 
 * Data
 * 	DataInputStream
 * 	DataOutputStream
 * 	用以读写二进制方式表达的基本数据类型的数据
 *
 */
