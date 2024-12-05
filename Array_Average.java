package classassignmentpackage;
// Given array find out the average value of it
public class Array_Average {

	public static void main(String[] args) {
		double salary[]=new double[5];
		salary[0]=7890;
		salary[1]=9890;
		salary[2]=1290;
		salary[3]=6790;
		salary[4]=4490;
		double average , sum=0;
		for (int i=0;i<salary.length;i++)
		{
			sum=sum+salary[i];
		}
		System.out.println("Sum of all the salaries = "+sum);
		average=sum/salary.length;
		System.out.println("Average of all the salaries ="+average);
	}

}
