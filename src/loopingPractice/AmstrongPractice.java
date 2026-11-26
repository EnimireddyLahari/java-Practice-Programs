package loopingPractice;
import java.util.Scanner;
import java.math.*;
public class AmstrongPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		int sum=0;
		
		//double result=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
			
		}
		temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*rem;
			}
			sum=sum+power;
			temp=temp/10;
			
		}
		if(num==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not an armstrong");
		}
		

	}

}
