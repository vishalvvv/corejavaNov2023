 package eh;

class PasswordValidator extends RuntimeException{
	
	public PasswordValidator(String message) {
		super(message);
	}
}

class Client{
	void authenticate(String username,String password) {
		if(password.length() < 8) {
			throw new PasswordValidator("Password should be atleast 8 characters");
		}
	}

}
	
	public class UncheckedExceptionDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Client  client = new Client();
     try {
    	 client.authenticate("abc", "xyz");
     }
     catch(PasswordValidator exception) {
    	 System.out.println("exception:"+exception);
     }
     System.out.println("After Validation");
	}
}


