package org.ssglobal.training.codes.answers;

import org.ssglobal.training.codes.login.LoginFactory;

public class MenuAccess {
	
	public void showMenu() {
		LoginFactory login = new LoginFactory();
		login.isValidUser();
	}

}
