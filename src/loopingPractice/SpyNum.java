package loopingPractice;
import java.util.Scanner;
public class SpyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entyer a num:");
		int num=sc.nextInt();
		int i=1;
		int rem=0;
		int sum=0;
		int mul=1;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;
			
			
		}
		if(sum==mul)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a spy num");
		}

	}

}
