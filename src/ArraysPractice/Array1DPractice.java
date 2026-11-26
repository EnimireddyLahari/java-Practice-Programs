package ArraysPractice;
import java.util.Scanner;
public class Array1DPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		//int num=sc.nextInt();
		
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=arr[i]+sum;
			avg=sum/5;
		}
		System.out.println(sum);
		System.out.println(avg);
		
		

	}

}
