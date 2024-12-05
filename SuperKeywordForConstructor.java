package classassignmentpackage;
class ParentClass
{
	ParentClass()
	{
		System.out.println("Its my parent class constructor");
	}
}
public class SuperKeywordForConstructor extends ParentClass 
{  
	
       SuperKeywordForConstructor() 
       {
	super();
	System.out.println("By super keyword calling the parent class "
			+ "constructor as we cannot inherit constructor");
       }
	
	public static void main(String[] args) 
	{
		
		new SuperKeywordForConstructor();
	}

}
