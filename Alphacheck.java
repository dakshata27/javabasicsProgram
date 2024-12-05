package classassignmentpackage;

import java.util.Arrays;

public class Alphacheck {
	static int countofalpha;
	static int countofdigit;
	static int countofspace;
	public static void main(String[] args) {
		String s="Dakshata's birthdate is 27 Oct 1993 !! ";
		
		char c1[]=s.toCharArray();
		String u = Arrays.toString(c1);
		System.out.println(u);
		for (int i=0; i<c1.length;i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
				if(b1==true)
				{
					countofalpha++;
				}
				boolean b2 = Character.isDigit(c1[i]);
				if(b2==true)
				{
					countofdigit++;
				}
				boolean b3 = Character.isWhitespace(c1[i]);
				if(b3==true)
				{
					countofspace++;
				}
		}
		System.out.println("Count of alpha character in a string is = "+countofalpha);	
		System.out.println("Count of digits character in a string is = "+countofdigit);
		System.out.println("Count of space character in a string is = "+countofspace);
		int count =countofalpha+countofdigit+countofspace;
		int countofspecialcharacter= s.length()-count;
		System.out.println("Length of the orginal string is = "+s.length());
		System.out.println("Count of special character in a string is = "+countofspecialcharacter);
	}

}
