package loopingPractice;
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int fib=0;
		for(int i=1;i<=num;i++)
		{
			System.out.println(a+" ");
			
			fib=a+b;
			a=b;
			b=fib;
			
		}
				
		//System.out.println(fib);

	}

}
