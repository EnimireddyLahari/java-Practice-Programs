package com.recursion;

public class NaturalSum {
	public static int addNum(int i,int n,int sum)//i stating 
	{
		if(i>n)
		{
			return sum;
		}
		sum=sum+i;
		return addNum(i+1,n,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addNum(1,5,0));
		//int res=addNum(1,5,0);
		//Sysout(res);
		//1 is num
//0 zero is sum value initially
	}

}
