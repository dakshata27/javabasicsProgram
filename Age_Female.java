package classassignmentpackage;

import java.util.Scanner;

public class Age_Female {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		System.out.println("Enter you gender");
		String gender=s.next();
		if (age>=18)
		{
			if(gender.equals("female")) 
			{
				System.out.println("you are eligible to vote");
			}
			else 
				System.out.println("Your are not eligible to vote");
			}
		
		
			
		

	}

}
