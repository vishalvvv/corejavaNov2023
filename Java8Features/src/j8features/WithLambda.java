package j8features;
@FunctionalInterface
interface User{
	void login();
}

public class WithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = () -> {
			System.out.println("Login function called");
		};
     user.login();
	}

}
