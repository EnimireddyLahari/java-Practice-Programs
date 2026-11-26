package ArraysPractice;
import java.util.Scanner;
public class LargestNumInRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		int arr[][]=new int[3][3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			int max=arr[i][0];
			for(int j=0;j<arr[i].length;j++)
			{
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
			}
			System.out.println("row"+(i+1)+ " :" +max);
		}
		

	}

}
