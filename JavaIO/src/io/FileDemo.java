package io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("tempfile.txt");
		try {
			boolean result = file.createNewFile();
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
