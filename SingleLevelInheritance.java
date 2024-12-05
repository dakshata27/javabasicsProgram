package classassignmentpackage;
class SingleLevelParentClass
{
	static void add(int a,int b)
	{
		System.out.println("Addition of a+b is = "+(a+b));
	}
	static void sub(int a,int b)
	{
		System.out.println("Subtraction of a-b is = "+(a-b));
	}
	
}
public class SingleLevelInheritance extends SingleLevelParentClass {
	static void mul(int a,int b)
	{
		System.out.println("Multiplication of a*b is = "+(a*b));
	}
	static void div(int a,int b)
	{
		System.out.println("Divison of a/b is = "+(a/b));
	}


	public static void main(String[] args) {
		
add(5,4);
sub(10,5);
mul(4,9);
div(20,5);
	
	}
}
