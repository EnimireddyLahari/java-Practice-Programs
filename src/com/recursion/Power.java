package com.recursion;

public class Power {
	public static int power(int n,int pow,int res)
	{
				if(pow==0)
		{
			return res;
		}
		res=res*n;
		return power(n,pow-1,res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (power(2,3,1));

	}

}
