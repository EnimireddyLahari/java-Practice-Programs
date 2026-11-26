package ArraysPractice;
import java.util.Scanner;
import java.util.Random;
public class RPSApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"r","p","s"};
		Scanner sc=new Scanner(System.in );
		System.out.println("enter user choice 0 to 2:");
		int us=sc.nextInt();
		while(us<0 || us>=3)
		{
			System.out.println("please enter valid choice:");
			us=sc.nextInt();
		}
		String uc=arr[us];
		System.out.println("user choice:"+uc);
		Random rm=new Random();
		int compchoi=rm.nextInt(3);
		String computerChoice=arr[compchoi];
		System.out.println("computer choice:"+computerChoice);
		if(uc.equals("r") && computerChoice.equals("s") || uc.equals("s") && computerChoice.equals("p") || uc.equals("p") && computerChoice.equals("r"))
		{
			System.out.println("user win...");
		}
		else if(uc.equals(computerChoice))
		{
			System.out.println("tie.....");
		}
		else
		{
			System.out.println("computer win...");
		}
		
		

	}

}
