package loopingPractice;
import java.util.*;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int result=a*i;
			System.out.println(a + "*" + i + "="+result);
		}

	}

}
