package ArraysPractice;
import java.util.Scanner;
public class MergingOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String arr[]=new String[5];
		String arr1[]=new String[2];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
			
			
		}
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextLine();
		}
		String arr2[]=new String[arr.length+arr1.length];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=arr[i]+arr1[i];
		}
		System.out.println(arr2);

	}

}
