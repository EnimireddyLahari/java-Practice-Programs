package corejavatraining;
import java.util.Scanner;
public class GradeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks=sc.nextInt();
		if(marks<0 || marks >100)
		{
			System.out.println("Marks are in valid");
		}
		
		else if(marks>=90)
		{
			System.out.println("A Grade");
		}
		else if(marks>=75) {
			System.out.println("B Garade");
			
		}
		else if(marks>65) {
			System.out.println("C Garade");
			
		}
		else if(marks>=45) {
			System.out.println("D Garade");
			
		}
	
		else
		{
			System.out.println("Fail");
		}
		sc.close();
		

	}

}
