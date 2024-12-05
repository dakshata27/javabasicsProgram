package classassignmentpackage;

import java.util.Scanner;

interface login
{
	void login_details();
}
public class Interface_Concept {
Scanner s=new Scanner(System.in);
	void login_details()
	{
		System.out.println("Enter your username.");
		String username =s.next();
		System.out.println("Enter your password");
		String password=s.next();
		if(username.equals("Dakshata") && password.equals("123456"))
		{
			System.out.println("Your have been successfully logged in");
		}
		else
		{
			System.out.println("Entered username & password is incorrect");
		}
	}
	public static void main(String[] args) {
		Interface_Concept ic=new Interface_Concept();
		ic.login_details();

	}

}
