package ArraysPractice;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {35,30,21,34,37,3};
		int max=arr[0];
		int smax=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax && arr[i]<max)
			{
				smax=arr[i];
			}
		}
		System.out.println(smax);
 
	}

}
