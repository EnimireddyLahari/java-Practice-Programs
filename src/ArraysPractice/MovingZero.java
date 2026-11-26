package ArraysPractice;
import java.util.* ;
public class MovingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,0,2,3,0};
		int j=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=0)
			{
				a[j]=a[i];
				j--;
			}
			
			
		}
		while(j>=0)
		{
			a[j]=0;
			j--;
			
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
