package fileinoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.Socket;

public class Hello {
	
	public static void main(String[] args) {
		try {
			Socket socket =new Socket(Inet4Address.getByName("localhost"),12345);//如果要做通信，就可以通过Socket对象得到一个流
			PrintWriter out= new PrintWriter(//写文本需要PrintWriter
					new BufferedWriter(
							new OutputStreamWriter(
									socket.getOutputStream())));//socket连上后，通过getOutputStream()得到一个虚拟的流(此程序与服务端程序间的网络连接)
			out.println("Hello");
			out.flush();//将缓冲区里的数据输出
			BufferedReader in=new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			String line;
			line=in.readLine();
			System.out.println(line); 
			out.close();
			socket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}


/**
 * 流的应用
 * 	1，用流的方式打开一个文件，对文件进行读写
 * 	2，以某种方式获得了一个流，在这个流的基础上去做一些事情
 * 
 * 写一个socket，以网络端口的方式去访问一个服务器，然后和服务器之间进行一个文本的连接，来进行文本的读写
 * 
 * 
 * 阻塞/非阻塞
 * read()函数是阻塞的，在读到所需的内容之前会停下来等
 * 	使用read()的更"高级"的函数，如nextInt()、readLine()都是这样的
 * 	所以常用单独的线程来做socket读的等待，或使用nio的channel选择机制
 * 对于socket,可以设置SO时间
 * 	setSoTimeout(int timeOut)
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
