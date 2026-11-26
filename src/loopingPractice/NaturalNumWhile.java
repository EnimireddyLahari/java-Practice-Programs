package loopingPractice;
import java.util.*;
import java.math.*;

public class NaturalNumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int result=0;
		int i=1;
		while(i<=num)	
		{
			result=num*(num+1)/2;
			i++;
		}
		System.out.println(result);
		

	}

}
