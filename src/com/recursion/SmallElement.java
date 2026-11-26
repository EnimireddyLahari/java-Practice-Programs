package com.recursion;

public class SmallElement {
	int min=0;
	int index=0;
	public static int min(int A[],int i)
	{
		if(i==A.length-1)
		{
			return A[i];
		}
		int minele=min(A,i+1);
		if(A[i]<minele)
		{
			return A[i];
		}
		
		return minele;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {23,45,21,56,8};
		int result=min(A,0);
		System.out.println(result);
		

	}

}
