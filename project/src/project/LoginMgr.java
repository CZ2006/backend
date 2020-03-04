package project;

import java.util.Scanner;

public class LoginMgr {
	private static Scanner sc = new Scanner(System.in);
	//for testing
	private static String test_username = "hi";
	private static String test_pw = "bye";
	
	public static boolean login(String username, String password) {
		//login
		System.out.print("Username : ");
		String input_username = sc.next();
		String dummy = sc.nextLine();
		System.out.print("Password : " );
		String input_password = sc.next();
		//use valid user function in UserMgr to check if username and password is valid
		return false;
	}
}
