package classassignmentpackage;

import java.util.Scanner;

public class Local_Gobal_Final_Variable {
int a = 10;
static String s="Dakshata Patne";
	public static void main(String[] args) {
		final float pi=3.14f;
		Local_Gobal_Final_Variable var=new Local_Gobal_Final_Variable();
		int n=var.a=5;
		System.out.println("Value of a is = "+n);
		s="Dakshata Patil";
		System.out.println("Name ="+s);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle");
	float r=s.nextFloat();
		System.out.println("Area of a circle ="+(pi*r*r));
		

	}

}
