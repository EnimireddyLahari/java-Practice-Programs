package loopingPractice;
import java.util.Scanner;
public class PerfectNumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<num)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}

	}

}
