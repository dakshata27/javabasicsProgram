package firsttestpackage;
public class LOgicalOperator 
{
public static void main(String[] args) 
{
	int age=18;
	char gender='M';
/*	if(age>=18 && gender=='F')
	{
		System.out.println("Both are satisfied in AND");
	}
	*/
	if(age>=56 || gender=='C')
	{
		System.out.println("Both are satisfied in OR");
	}
	if(!(age>=56 || gender=='C'))
	{
		System.out.println("Both are satisfied in OR with noT");
	}
	if(!(age>=18 && gender=='F'))
	{
		System.out.println("Both are satisfied in AND with not");
	}
	
	
}
}
