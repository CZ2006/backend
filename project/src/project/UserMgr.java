package project;

import java.util.ArrayList;

public class UserMgr {
	
	public static boolean addUser(String email, String name, String number,String pw) {
		//add user to database
		email = email.toUpperCase().trim();
		//add function to see if email has been taken?
		return true;
	}
	
	public static void removeUser() {
		//delete user from database
	}
	
	public static boolean validUser(String username, String pw) {
		return false;
	}
}
