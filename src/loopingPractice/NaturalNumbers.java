package loopingPractice;
import java.util.Scanner;
import java.math.*;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=sc.nextInt();
		/*int result=0;
		for(int i=1;i<=num;i++)
		{
			result=result+i;
			
		}
		
		System.out.println(result);*/
		//other method
		int result=num*(num+1)/2;
		System.out.println(result);
		

	}

}
