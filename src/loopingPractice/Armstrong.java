package loopingPractice;
import java.util.Scanner;
import java.math.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		int count=0;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		for(int i=temp;i>0;i=i/10)
		{
			
			int rem=i%10;
			int power=1;
			for(int j=1;j<=count;j++) 
			{
				power=power*rem;
			}
			sum=sum+power;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not armstrong");
			
		}
		
			

	}

}
