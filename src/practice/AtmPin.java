package practice;
import java.util.Scanner;
public class AtmPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter your pin");
		int pin=1257;
		int max=3;
		for(int i=1;i<=max;i++)
		{
			System.out.println("enter your pin");
			int enteredPin=sc.nextInt();
			if(enteredPin==pin)
			{
				System.out.println("login successfull");
				break;
			}
			else if(i==max)
			{
				System.out.println("account blocked ");
			}
			else
			{
				System.out.println("wrong pin");
			}
		}

	}

}
