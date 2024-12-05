package classassignmentpackage;

import java.util.Arrays;

public class String_Space_Alphabet_Numeric_SC {
static int countalpha=0;
static int countspace=0;
static int countdigit=0;
static int countsc=0;
	public static void main(String[] args) 
	{
		String str=" Hello! 123@ jAvA_";
		char a[]=str.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			boolean b1=Character.isAlphabetic(a[i]);
		if(b1==true)
		{
			countalpha++;
		}
		boolean b2=Character.isDigit(a[i]);
			if(b2==true)
			{
				countdigit++;
			}
		boolean b3=Character.isWhitespace(a[i]);
		if(b3==true)
		{
			countspace++;
		}
		}
		System.out.println("The count of alphabet is = "+countalpha);
		System.out.println("The count of digit is = "+countdigit);
		System.out.println("The count of space is = "+countspace);
		countsc=a.length-(countalpha+countdigit+countspace);
		System.out.println("The count of special character is = "+countsc);
	}

}
