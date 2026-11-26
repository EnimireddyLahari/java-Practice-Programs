package ArraysPractice;
import java.util.*;
public class MovingZerostoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,0,2,3,0};
		int j=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		//System.out.println(Arrays.toString(a));
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}

	}

}
