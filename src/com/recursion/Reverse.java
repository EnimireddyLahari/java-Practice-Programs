package com.recursion;

public class Reverse {
	public static int reverse(int n,int rev)
	{
		if(n==0)
		{
			return rev;
		}
		int rem=n%10;
		rev=rev*10+rem;
		return reverse(n/10,rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1234,0));

	}

}
