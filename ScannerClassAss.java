package classassignmentpackage;
import java.util.Scanner;
public class ScannerClassAss {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=s.nextInt();
		System.out.println("Your id is :- "+id);
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Your name is :- "+name);
		System.out.println("Enter your branchname");
		String branchname=s.next();
		System.out.println("Your branchname is :- "+branchname);
		System.out.println("Enter your College name");
		String collegename=s.next();
		System.out.println("Your College name is :- "+collegename);
		System.out.println("Enter your phone number");
		String phonenumber=s.next();
		System.out.println("Your phone number is :- "+phonenumber);
	}
	}


