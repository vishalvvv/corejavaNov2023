package CS;

import java.util.Scanner;

public class Switchex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" 1. Second Class \n 2. Sleeper \n 3. 3AC \n 4. 2AC \n 5.1AC \n");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Choice" + choice);
		switch(choice) {
		case 1: System.out.println("you choose Second Class"); break;
		case 2: System.out.println("you choose Sleeper Class"); break;
		case 3: System.out.println("you choose 3AC"); break;
		case 4: System.out.println("you choose 2AC"); break;
		case 5: System.out.println("you choose 5AC"); break;
		default:System.out.println("N/A");
		}
		
		
		
	}

}
