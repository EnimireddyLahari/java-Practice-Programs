package patterns;

public class Patterns16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=2;j<=i;j++)
			{
				for(int k=4;k>=i;k--)	
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
