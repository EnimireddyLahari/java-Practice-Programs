package com.encapsulation;

public class BnakAccountMain {
	static BankAccount acc[]=new BankAccount[5];
	static int index=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1=new BankAccount("ram",1234,-100);
		BankAccount ba2=new BankAccount("sam",12345,10000);
		acc[index++]=ba1;
		acc[index++]=ba2;
		for(int i=0;i<index;i++)
		{
			System.out.println(acc[i].getName());
			System.out.println(acc[i].getAccNo());
			System.out.println(acc[i].getBal());
		}

	}

}
