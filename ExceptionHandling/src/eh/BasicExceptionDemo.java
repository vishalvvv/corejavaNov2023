package eh;

public class BasicExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"user1","user2","user3"};
		
		String username="kriti";
		try {
		System.out.println(arr[3]);
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(username);
		username = username.concat("@gmail.com");
		System.out.println(username);

	}

}
