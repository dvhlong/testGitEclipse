package helloworld;

import java.util.Scanner;

public class uap{
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Username :");
		String username=nhap.nextLine();
		System.out.println("Password :");
		String password=nhap.nextLine();
		if (password.length()>=6) {
			if (authentication(username,password))
				System.out.println("Log in Successful");
			else {
				System.out.println("Invalid username or password");
				System.out.println("Please try again !");
				uap.main(args);
			}
		}
		else {
			System.out.println("Please try again !");
			uap.main(args);
		}
	}
	public static boolean authentication(String user,String pass) {
		if (user.equals("long599") && pass.equals("123456"))
			return true;
		else
			return false;
	}
}