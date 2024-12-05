package classassignmentpackage;
import java.util.*;

abstract class Student 
{
	     abstract void details(int id,int rollno);
	     abstract void studentDetails(String name);
	}
	public class Abstraction extends Student
	{
	     Scanner s=new Scanner(System.in);
	   public void details(int id,int rollno)
	    {
	         System.out.println("Enter id of student");
	        id=s.nextInt();
	        System.out.println("Id of student is ="+id);
	        System.out.println("Enter rollno of student");
	        rollno=s.nextInt();
	        System.out.println("Roll No of student is ="+rollno);
	    }
	   public void studentDetails(String name)
	    {
	         System.out.println("Enter name of student");
	        name=s.next();
	    }
	        public void studentDept(String deptname)
	        {
	        System.out.println("Enter department of student");
	        deptname=s.next();
	        System.out.println("Department of student is = "+deptname);
	        }
	        public void studentClass(int std)
	        {
	        System.out.println("Enter class of student");
	        std=s.nextInt();
	        System.out.println("Class of student is = "+std);
	        }
	     public static void main(String[] args) 
	     {
	    	 Abstraction stu = new Abstraction();
	         stu.details(5,6);
	         stu.studentDetails("Dakshata");
	         stu.studentDept("CS");
	         stu.studentClass(12);
	     }
	}

