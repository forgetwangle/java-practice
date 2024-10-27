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
					new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream("a.txt"))));
			int i=123456;
			out.println(i);
			out.close();
			BufferedReader in=new BufferedReader(
					new InputStreamReader(//这一行处理文本，默认将stream(FileInputStream)对象中的二进制数据转换成文本数据时，采用系统默认的方式转换
//							new FileInputStream("gb18030.txt")));
//							new FileInputStream("utf8.txt")));//这一行处理二进制
							new FileInputStream("gb18030.txt"),"gb18030"));//给出二进制数据转换成文本数据的方式
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
 * 汉字编码，告诉Read怎么做编码、怎么做解码
 * InputStreamReader(InputStream in)
 * 	创建一个使用默认字符集的InputStreamReader
 * InputStreamReader(InputStream in,Charset cs)
 * 	创建使用给定字符集的InputStreamReader
 * InputStreamReader(InputStream in,CharsetDecoder dec)
 * 	创建使用给定字符集解码器的InputStreamReader
 * InputStreamReader(InputStream in,String charsetName)
 * 	创建使用指定字符集的InputStreamReader
 * 
 * 
 */
