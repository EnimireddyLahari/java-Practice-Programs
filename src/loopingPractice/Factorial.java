package loopingPractice;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int result=1;
		for(int i=num;i>=1;i--)
		{
			result=i*result;
		}
		System.out.println(result);

	}

}
