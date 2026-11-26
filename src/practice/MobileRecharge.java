package practice;
import java.util.*;
public class MobileRecharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your recharge :");
		int amount=sc.nextInt();
		if(amount>299)
		{
			System.out.println("You get Extra 2GB");
		}
		else
		{
			System.out.println("no offer to you");
		}

	}

}
