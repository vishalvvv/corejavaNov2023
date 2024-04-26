package CS;

public class Sequential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		int age=19;
		if(age>=18) {
		System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not Eligible to vote");
		}
		String username = "kiran123";
		if(username.length() < 8) {
			System.out.println("Username should be atleast 8 chars");
		}
		else {
			System.out.println("Username accepted");
		}
	}

}
