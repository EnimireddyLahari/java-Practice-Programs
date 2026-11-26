package practice;
import java.util.*;
public class FoodDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your amount:");
		int amount=sc.nextInt();
		System.out.println("are you a premium number:");
		boolean premium=sc.nextBoolean();
		if(amount>=500)
		{
			if(premium==true)
			{
				System.out.println("Free delivery is available");
			}
			else
			{
				int money=amount+50;
				System.out.println("Free delivery is not available");
				System.out.println("you have to pay:"+money);
			}
			
		}
		else
		{
			int money=amount+50;
			System.out.println("Free delivery is not available");
			System.out.println("you have to pay:"+money);

		}

	}

}
