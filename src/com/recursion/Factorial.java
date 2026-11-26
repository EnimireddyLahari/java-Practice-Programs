package com.recursion;

public class Factorial {
	public static int fact(int num,int res)
	{
		if(num==0)
		{
			return res;
		}
		res=num*res;
		return fact(num-1,res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5,1));

	}

}
