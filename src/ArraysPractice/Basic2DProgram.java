package ArraysPractice;

public class Basic2DProgram {

	public static void main(String[] args) {
		//int arr[][]=new int[3][2];
		/*arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		System.out.println(arr[0][0]+" ");
		System.out.println(arr[0][1]+" ");*/
		/*int[][] arr= {
				{10,20,30},
				{40,50,60},
		};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
			System.out.println( );
		}*/
		int marks[][]= {
				{80,75,60},
				{85,90,95},
				{70,80,75}
		};
		
		for(int i=0;i<marks.length;i++)
		{
			int total=0;
			for(int j=0;j<marks[i].length;j++)
			{ 
				total=total+marks[i][j];
				
			}
			System.out.println( "student:"+(i+1)+ "  total:" + total);
		}
		
		

	}

}
