package corejavatraining;
import java.util.Scanner;
public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(a+"x"+i+"="+(a*i));
		}
		System.out.println( );
		System.out.println("Reverse order");
		for(int i=10;i>=1;i--)
		{
			
			System.out.println(a+"x"+i+"="+(a*i));
		}
		

	}

}
