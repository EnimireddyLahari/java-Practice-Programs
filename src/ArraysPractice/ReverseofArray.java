package ArraysPractice;
import java.util.Scanner;
public class ReverseofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}

	}

}
