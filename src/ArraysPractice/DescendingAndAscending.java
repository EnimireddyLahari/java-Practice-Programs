package ArraysPractice;
import java.util.*;
public class DescendingAndAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		/*for(int i:arr)
		{
			System.out.println(i);
		}*/
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		

	}

}
