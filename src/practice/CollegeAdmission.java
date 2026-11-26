package practice;
import java.util.Scanner;
public class CollegeAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your 12th Marks:");
		int marks=sc.nextInt();
		System.out.println("enter your entrance exam marks:");
		int rank=sc.nextInt();
		if(marks>=60)
		{
			if(rank<=1000)
			{
				System.out.println("You get the Admission");
			}
			else
			{
				System.out.println("Your Application is rejected");
			}
		}
		else
		{
			System.out.println("Your application is rejected");
		}
		sc.close();

	}

}
