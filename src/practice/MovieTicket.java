package practice;
import java.util.*;

public class MovieTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie rate:");
		int rating=sc.nextInt();
		if(rating>18)
		{
			System.out.println("They can watch movie");
		}
		else
		{
			System.out.println("wont prefer to saw this movie");
		}
		
		

	}

}
