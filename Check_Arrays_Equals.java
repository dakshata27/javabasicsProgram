package classassignmentpackage;

import java.util.Arrays;

public class Check_Arrays_Equals {

	public static void main(String[] args) 
	{
		String str1= "kv no2 bangalore";
		String str2= "karnataka";
		char a[]=str1.toCharArray()	;
		char b[]=str2.toCharArray();
		if(Arrays.toString(a).equals(Arrays.toString(b)))
		{
			System.out.println("String 1 & String 2 are equals");
		}
		else
		{
			System.out.println("String 1 & String 2 are not equals");
		}
	}

}
