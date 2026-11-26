package practice;
import java.util.*;
public class ElectricityBillDic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your electricity bill:");
		int bill=sc.nextInt();
		if(bill>5000)
		{
			int disc=bill*10/100;
			int Amount=bill-disc;
			System.out.println(Amount);
			
		}
		else
		{
			System.out.println("you doesnt have any discount");
		}

	}

}
