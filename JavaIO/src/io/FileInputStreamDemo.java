package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Vishal\\\\OneDrive\\\\Documents\\\\saikumarcorejava\\\\JavaIO\\abc.txt");
  //  int i = fis.read();
//		int i=0;
   //  System.out.println((char)i);
 //   System.out.println((char)fis.read());
	//	while((i=fis.read())!= -1) {
	//		System.out.print((char) i);
	//	}
		byte b[] = fis.readAllBytes();
		for(int i=0;i<b.length;i++) {
			System.out.print((char)b[i]);
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}
	


