package ArraysPractice;

public class Sumof2DElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{10,20},
				{30,40},
				{50,60},
				{70,80}
		};
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+arr[i][j];
			}
			System.out.println("row:"+(i+1)+"  sum:"+sum);
		}

	}

}
