package firsttestpackage;

public class CallingStatic_Nonstatic {

	void areaofcircle()
	{
		double pi = 3.14;
		int r=5;
		double circle = pi*r*r;
		System.out.println("Area of circle = " +circle);
	}
	static void areaofsquare (int a)
	{
		int square=a*a;
		System.out.println("Area of square = " +square);
	}
	static void areaofrectangle (double l,double w)
	{
		double rectangle=l*w;
		System.out.println("Area of rectangle = " +rectangle);
	}
	void areaoftriangle(int b , int h)
	{
		double triangle =0.5*(b*h);
		System.out.println("Area of triangle = " +triangle);
	}
	static void Circumferenceofcircle ()
	{
		double pi=3.14;
		double r=15;
		double c= 2*pi*r;
		System.out.println("Circumference of circle = " +c);
	}
	 public static void main (String [] args)
	 {
		 CallingStatic_Nonstatic nonstatic= new CallingStatic_Nonstatic();
		 nonstatic.areaofcircle();
		 areaofsquare(5);
		 areaofrectangle(2.5,3.2);
		 nonstatic.areaoftriangle(5, 7);
		 Circumferenceofcircle();
	 }
}
