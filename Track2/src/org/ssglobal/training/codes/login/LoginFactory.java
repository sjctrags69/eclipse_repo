package org.ssglobal.training.codes.login;

public class LoginFactory {
	
	public boolean isValidUser() {
		LoginAuth auth = new LoginAuth();
		LogPermission permission = new LogPermission();
		Logout logout = new Logout();
		return true;
	}

}
