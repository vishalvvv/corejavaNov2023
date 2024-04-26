package eh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemoThrows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		
			String name = br.readLine();
			System.out.println("entered name:"+ name);
		
		
	}
}


