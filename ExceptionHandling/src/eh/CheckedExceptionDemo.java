package eh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		try {
			String name = br.readLine();
			System.out.println("entered name:"+ name);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
