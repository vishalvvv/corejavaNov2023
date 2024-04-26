package io;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Vishal\\OneDrive\\Documents\\saikumarcorejava\\JavaIO");
		
		String files[]=file.list();
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i]);
		}
	}

}
