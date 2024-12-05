package classassignmentpackage;
public class Palindrome_Trim_Equals {

	public static void main(String[] args) {
		String dr1= "rotator";
		String reverse="";
		for (int i=6;i>=0;i--)
		{
			char c=dr1.charAt(i);
			reverse=reverse+c;
		}
		System.out.println("Reverse of string is = "+reverse);
 if(dr1.equals(reverse))
 {
	 System.out.println("Given string is Palindrome");
 }
 else
 {
	 System.out.println("Given string is not Palindrome");
 }
 			String s1 = "Java";
	        String s2 = "java";    
	        if(s1.equals(s2)==true)
	        {
	        	System.out.println("Both the strings are equal");
	        }
	        else
	        {
	        	System.out.println("Both the strings are not equal");
	        }
	        
	        String original_string= "  A very Good Morning !  ";
	        System.out.println("Trimming the orginal string gives output as = "+original_string.trim());
	}

}
