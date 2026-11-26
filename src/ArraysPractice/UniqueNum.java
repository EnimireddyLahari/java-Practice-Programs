package ArraysPractice;
import java.util.Scanner;
public class UniqueNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter array elements:");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					count++;
					
				}
			}
			if(count==0)
			{
				System.out.println(arr[i]);
			}
			
		}
		

	}

}
