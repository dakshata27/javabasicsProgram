package classassignmentpackage;
public class ThisKeyword 
{
	 ThisKeyword(String EmployeeName)
	 {
		 this("Sr Application Tester",45000);
		System.out.println("Employee name is= "+EmployeeName);
	}
	 ThisKeyword(int Employee_id , String Company_Name)
	  {
		 System.out.println("Employee id is = "+Employee_id+ " and company name is ="+Company_Name );
	  }
	  ThisKeyword(String Designation,int salary) 
	 { 
		  this(4500,"TCS");
		System.out.println("Designation of employee is = "+Designation+ " and salary is ="+salary);
	}

	public static void main(String[] args) {
		
ThisKeyword k=new ThisKeyword("Dakshata");

	}

}
