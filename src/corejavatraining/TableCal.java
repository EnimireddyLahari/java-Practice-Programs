package corejavatraining;
import java.util.Scanner;
public class TableCal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=1;
		int a=sc.nextInt();
		while(i<=10)
		{
			System.out.println(a+"x"+i+"="+(a*i));
			i++;
		}
	}

}
