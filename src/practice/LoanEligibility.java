package practice;
import java.util.*;

public class LoanEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		System.out.println("enter your salary:");
		int salary=sc.nextInt();
		if(age>=21 && salary>=25000)
		{
			System.out.println("Eligible for loan");
		}
		else
		{
			System.out.println("not eligible to loan");
		}
		

	}

}
