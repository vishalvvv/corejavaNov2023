package com.wipro.socialnet.main;

import com.wipro.socialnet.user.account.SignUp;
import com.wipro.socialnet.user.account.SignUpImplementor;
import com.wipro.socialnet.user.account.User;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	SignUp signup = new SignUpImplementor();
	signup.signUpUser(new User(null,null,null));
	
	}
	

}
