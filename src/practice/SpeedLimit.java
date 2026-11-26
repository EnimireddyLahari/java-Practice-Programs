package practice;
import java.util.*;
public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the speed:");
		int speed=sc.nextInt();
		if(speed>80)
		{
			System.out.println("Overspeeding Fine");
		}
		else
		{
			System.out.println("Drive safely");
		}

	}

}
