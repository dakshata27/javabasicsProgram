package classassignmentpackage;
import java.util.Arrays;
public class Anagram_Exact_Same_Characters {

	public static void main(String[] args) {
		String str1 ="Listen";
		String str2 ="sIlent";
		char a[]=str1.toLowerCase().toCharArray();
		char b[]=str2.toLowerCase().toCharArray();
		 Arrays.sort(a);
		 Arrays.sort(b);
		if(Arrays.toString(a).equals(Arrays.toString(b)))
				{
			System.out.println("String "+str1+ " and "+str2+ " are anagram");
				}
		else
		{
			System.out.println("String "+str1+ " and "+str2+ " are not anagram");
		}
	}

}
