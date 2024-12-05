package classassignmentpackage;
class MainUser
{
	void login()
	{
		System.out.println("Login with email id");
	}
}
class Admin extends MainUser
{
	void login()
	{
		System.out.println("Login with username");
	}
}
class Teacher extends MainUser
{
	void login()
	{
		System.out.println("Login with thumb impression");
	}
}
public class MethodOverriding extends MainUser {
	void login()
	{
		System.out.println("Login with mobile number");
	}
	public static void main(String[] args) {
		
		MethodOverriding mo=new MethodOverriding();
		mo.login();
}
}
