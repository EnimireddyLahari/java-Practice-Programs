package ArraysPractice;
import java.util.Scanner;
public class SumofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		int arr[]=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println(sum);

	}

}
