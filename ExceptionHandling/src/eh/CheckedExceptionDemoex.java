package eh;

import java.io.FileReader;

public class CheckedExceptionDemoex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("c://abc");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		String str = "shakira";
		System.out.println(str);
	}

}
