package ArraysPractice;
import java.util.Scanner;
public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		int arr[][]=new int[3][3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				}
				
			}
		}
		System.out.println(sum);
			

	}

}
