package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamOutputStreamCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Vishal\\OneDrive\\Documents\\saikumarcorejava\\JavaIO\\abc.txt");
			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\Vishal\\\\OneDrive\\\\Documents\\\\saikumarcorejava\\\\JavaIO\\\\temp.txt");
		
			  // Read data from FileInputStream and write it to FileOutputStream
			int byteRead;
            // Read byte-by-byte from input stream and write to output stream
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
                
            }

            System.out.println("File copied successfully.");
		
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			

	}

}
