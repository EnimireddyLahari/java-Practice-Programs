package ArraysPractice;
import java.util.Scanner;
public class ColumWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		int arr[][]=new int[4][4];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int j=0;j<arr[0].length;j++)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i][j];
			}
			System.out.println("columns"+ (j+1)+" " + sum);
		}
		
		

	}

}
