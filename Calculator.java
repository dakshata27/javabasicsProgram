package classassignmentpackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for a");
		int a=s.nextInt();
		System.out.println("Enter value for b");
		int b=s.nextInt();
		System.out.println("Enter value for c");
		int c=s.nextInt();
		System.out.println("Enter value for d");
		int d=s.nextInt();
		int sum=a+b+c+d;
		System.out.println("Your sum is "+sum);
		
}

}
