package firsttestpackage;

public class Ifelse_ConditionalStatement {
 public static void main (String[] args)
 {
	 int a=10;
	 int b= 20;
	 if(a>b)
	 {
		 System.out.println("This condition 1 is false");
		 if(a<b)
		 {
			 System.out.println("This condition 2 is true");
		 }
	 }
	 if (a<b)
	 {
		 System.out.println("This condition 3 is true");
	 }
	 if(a==b)
	 {
		 System.out.println("This condition 1 is false");
	 }
 }
}
