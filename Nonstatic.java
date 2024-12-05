package firsttestpackage;

public class Nonstatic {
	
	void add()
	{
		int a=300;
		int b=100;
		int c= a+b;
		System.out.println("Addition of a & b ="+c);
	}
	public static void main(String[] args)
	{
		Nonstatic m = new Nonstatic();
		m.add();
	}
}
