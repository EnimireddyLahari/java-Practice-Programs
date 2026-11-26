package loopingPractice;
import java.util.Scanner;
public class BreakPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i==12)
			{
				break;
			}
			System.out.println(i);
		}

	}

}
