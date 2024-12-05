package classassignmentpackage;

import java.util.Scanner;

public class AssertInJava {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
			assert age>0 && age<=60:"Your age should not be less 0 & greater than 60";
			System.out.print("Its work");
	}
}
