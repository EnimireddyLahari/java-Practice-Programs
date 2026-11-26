package ArraysPractice;
import java.util.Scanner;
public class SmallestOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println(min);

	}

}
