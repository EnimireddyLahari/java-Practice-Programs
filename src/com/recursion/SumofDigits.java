package com.recursion;

public class SumofDigits {
	public static int SumofDigits(int num,int sum)
	{
		if(num<=0) {
			
			return sum;
		}
		int rem=num%10;
		sum=sum+rem;
		//num=num/10;
		return SumofDigits(num/10,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumofDigits(123,0));

	}

}
