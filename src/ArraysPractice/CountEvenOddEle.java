package ArraysPractice;
import java.util.Scanner;
public class CountEvenOddEle {

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
		int count=0;
		int c1=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]%2==0)
				{
					count++;
				}
				else if(arr[i][j]%2!=0)
				{
					c1++;
				}
				else
				{
					System.out.println("not valid");
				}
			}
		}
		System.out.println("even count:"+count);
		System.out.println("odd count:"+c1);

		

	}

}
