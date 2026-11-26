package com.methods;

public class AccountBal {
	double bal=1000;
	public void welcome()
	
	{
		System.out.println("welcome to bank.......");
	}
	public double checkBal()
	{
		System.out.println("your balance is:");
		return bal;
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("deposit successfully");
	}
	public double withDraw(double amt)
	{
		bal=bal-amt;
		return bal;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBal ab=new AccountBal();
		ab.welcome();
		System.out.println(ab.checkBal());
		ab.deposit(1000);
		//ab.withDraw(100);
		System.out.println(ab.withDraw(100));
	}

}
