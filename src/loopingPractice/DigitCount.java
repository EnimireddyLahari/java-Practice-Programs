package loopingPractice;
import java.util.Scanner;
public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int rev=0;
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			count++;
		}
			System.out.println(count);
	
		

	}

}
