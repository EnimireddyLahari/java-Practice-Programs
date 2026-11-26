package loopingPractice;
import java.util.Scanner;
public class FactorialUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int fact=1;
		
		do
		{
			fact=fact*num;
			num--;
		}
		while(num>0);
		System.out.println(fact);
		

	}

}
