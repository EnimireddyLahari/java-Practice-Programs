package corejavatraining;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Student id is:"+id);
		System.out.println("please enter Student name:");
		String name=sc.nextLine();
		System.out.println("Entered Name is:"+ name);
		System.out.println("please enter your age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Entered Age is:"+ age);
		System.out.println("Enter course name:");
		String course =sc.nextLine();
		System.out.println("Entered ciurse is:"+course);
		System.out.println("Enter Course fee:");
		float fee=sc.nextFloat();
		System.out.println("Entered fee is:"+fee);
		System.out.println("Enter City:");
		String city=sc.next();
		System.out.println("Entered city:"+city);
		

	}

}
