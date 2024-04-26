package eh;

class PasswordValidator extends Exception{
	
	public PasswordValidator(String message) {
		super(message);
	}
}

class User{
	void authenticate(String username,String password) throws PasswordValidator{
		if(password.length() < 8) {
			throw new PasswordValidator("Password should be atleast 8 characters");
		}
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		try {
			user.authenticate("abc", "xyz");
		}
   catch(PasswordValidator exception) {
	   System.out.println("exception:"+exception);
   }
		System.out.println("After Validation");
	}

}
