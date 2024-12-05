package classassignmentpackage;
class SuperMostClass
{
	void add(int a,int b)
	{
		System.out.println("Addition of a+b is = "+(a+b));

	}
	void sub(double a,double b)
	{
		System.out.println("Substraction of a-b is = "+(a-b));

	}
	static void mul(float a, double b)
	{
		System.out.println("Multiplication of a*b is = "+(a*b));

	}
}
class MultipleLevelParentClass extends SuperMostClass
{
	
	static void div(double a,double b)
	{
		System.out.println("Divison of a/b is = "+(a/b));
	}
}
public class MultipleLevelInheritance extends MultipleLevelParentClass {

	static void mod(float a, float b)
	{
		System.out.println("Modules of a%b is = "+(a%b));
	}
	public static void main(String[] args) {
		MultipleLevelInheritance m=new MultipleLevelInheritance();
		m.add(5, 7);
		m.sub(90, 42);
		mul(-5, 4);
		div(95, 45);
		mod(25, 4);
	}

}
