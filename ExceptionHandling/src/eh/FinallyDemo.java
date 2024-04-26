package eh;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileReader fr = null;
		try {
			 fr = new FileReader("C:\\Users\\Vishal\\OneDrive\\Documents\\saikumarcorejava\\ExceptionHandling\\src\\eh\\FinallyDemo.java");
			if(1==1) {
				throw new Error("Some error");
			}
			 
			 }
		catch(Exception e) {
			System.out.println(e);
			// log info into Database
		}
		finally {
			try {
				fr.close();
			}
		
		catch(Exception e) {
				System.out.println(e);
					}
		System.out.println("fr closed");
	}
		System.out.println("Statement 1");
		System.out.println("Statement 2");
	}


}
