package fileinoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		byte[] buf=new byte[10];
		for(int i=0;i<buf.length;i++) {
			buf[i]=(byte)i;
		}
		try {
			PrintWriter out=new PrintWriter(
					new BufferedWriter(//缓冲
							new OutputStreamWriter(//Stream和Writer之间的桥梁(输入Stream输出Writer)
									new FileOutputStream("a.txt"))));//处理字节
			int i=123456;
			out.println(i);
			out.close();
			BufferedReader in=new BufferedReader(
					new InputStreamReader(
							new FileInputStream("src/fileinoutput/Hello.java")));
			String line;
			while((line=in.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

/**
 * 
 * Reader/Writer
 * 二进制数据采用InputStream/OutputStream
 * 文本数据采用Reader/Writer
 * 
 * 在流上建立文本处理
 * PrintWriter pw=new PrintWriter(
 * 	new BufferedWriter(
 * 		new OutputStreamWriter(
 * 			new FileOutputStream("abc.txt")));
 * 
 * Reader/Writer是处理Unicode字符的
 * 	如果文件本身是Unicode的文件，可以直接用Reader和Writer来打开进行读写
 * 	如果不是Unicode文件，如ASCII码文件、utf-8，由Stream打开文件，
 * 		在Stream基础上以过滤器流的方式,建立Reader/Writer来做文本的输入输出
 * 
 * Reader
 * 	常用的是BufferedReader...readLine()
 * 	LineNumberReader...得到行号getLineNumber()...特殊：可以在行号中跳来跳去，可以要求跳到第几行
 * 
 * FileReader
 * 	InputStreamReader类的子类，所有方法都从父类中继承而来
 * 	FileReader(File file);在给定从中读取数据的File的情况下创建一个新的FileReader
 * 	FileReader(String fileName);在给定从中读取数据的文件名的情况下创建一个新FileReader
 * 	FileReader不能指定编码转换方式
 * FileReader可以从一个二进制的或非Unicode文件上建立起一个流，最后形成一个Reader
 * 
 */
