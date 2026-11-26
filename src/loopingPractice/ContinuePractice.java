package loopingPractice;
import java.util.Scanner;
public class ContinuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%5==0)
			{
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
