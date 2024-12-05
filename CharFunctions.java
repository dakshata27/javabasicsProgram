package classassignmentpackage;

public class CharFunctions {

	public static void main(String[] args) {
		String a1 = "Welcome India";
		System.out.println("Index of c is = "+a1.indexOf("c"));
		String str = "Programming ";
		System.out.println("Character at index 4 is = "+str.charAt(4));
	    String str1 = "Hello";
	    String str2 = "World" ;
	    System.out.println("Concat of string 1 & string 2 is = "+str1.concat(" ").concat( str2));
	    String p1 = "Programming is fun";
	    System.out.println("Substring from position 0 to 11 is = "+p1.substring(0, 11));
	    String name = "Welcome to Java Programming";
	    System.out.println("Substring from position 11 to end is = "+name.substring(11, 27));

	}

}
