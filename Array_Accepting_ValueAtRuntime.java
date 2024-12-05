package classassignmentpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Accepting_ValueAtRuntime {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value of array");
		for (int i=0;i<a.length;i++)
		{	
			a[i] =s1.nextInt();	
			
			if(34==a[i])
			{
				System.out.println(Arrays.toString(a));
				System.out.println("34 is present in array list");
				System.out.println("indexing of 34 is "+i);
			}
			
		}
		
         }

}
