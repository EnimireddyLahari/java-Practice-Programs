package com.recursion;

public class Prime {
	//boolean
	public static String prime(int n,int i)
	{
		if(n<=1)
		{
			return "not prime";
			//return false
		}
		if(i==n)
		{
			return "prime";
			//return true
		}
		if(n%i==0)
		{
			return "not prime";
			//return false
		}
		
		return prime(n,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(5,2));
		//if(prime(5,2))
		//{
		//sysout("it is prime");
		//}
		//else
		//{
		//Sysout("not a prime");
		//}

	}

}
