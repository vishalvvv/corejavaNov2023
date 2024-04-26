package CS;

import java.util.Scanner;

public class ReturnDemo {
	
	public static boolean authenticate(String username,String password) {
		boolean returnValue=false;
		if(username.equals("digital") && password.equals("lync")){
				returnValue=true;
	}
		return returnValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		boolean  result=ReturnDemo.authenticate(username, password);
		if(result) {
			System.out.println("login success");
			}
		else {
			System.out.println("login failure");
		}

	}

}
