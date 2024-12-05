package classassignmentpackage;

public class String_Functions {

	public static void main(String[] args) {
		String str= "I Love MySelf";
		System.out.println("Length of the given string is = "+(str.length()));
		System.out.println("Uppercase of given string is ="+(str.toUpperCase()));
		System.out.println("Lowercase of given string is ="+(str.toLowerCase()));
		System.out.println("String after removing all the white spaces is = "+(str.replaceAll("\s","")));
		String reverse="";
		for(int i=12;i>=0;i--)
		{
			char a=str.charAt(i);
			reverse=reverse+a;
		}
		System.out.println("Reverse of given string is = "+reverse);
	}

}
