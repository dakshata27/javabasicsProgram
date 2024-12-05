package classassignmentpackage;
class SupKeyMainUser
{
	void login()
	{
		System.out.println("Login with email id");
	}
}
class SupKeyAdmin extends SupKeyMainUser
{
	void login()
	{
		System.out.println("Login with username");
		super.login();
	}
}
class SupKeyTeacher extends SupKeyMainUser
{
	void login()
	{
		System.out.println("Login with thumb impression");
	}
}
public class SuperKeywordForMethodOverriding extends SupKeyMainUser
{
	void login()
	{
		System.out.println("Login with mobile number");
		super.login();
	}
	public static void main(String[] args) 
	{
		SuperKeywordForMethodOverriding supkey=new SuperKeywordForMethodOverriding();
		supkey.login();
	}

}
