package com.encapsulation;

public class BankAccount {
	private String name;
	private int accNo;
	private int bal;
	public BankAccount(String name,int accNo,int bal)
	{
		this.name=name;
		this.accNo=accNo;
		setBal(bal);
	}
	
	public String getName()
	{
		return name;
	}
	public int getAccNo()
	{
		return accNo;
	}
	
	public int getBal()
	{
		return bal;
	}
	public void setBal(int bal)
	{
		if(bal>0)
		{
			this.bal=bal;
	
		}
	}
	public void withDraw(int amnt)
	{
		if(bal>amnt)
		{
			bal=bal-amnt;
			setBal(bal);
			System.out.println("withdraw Succesfull"+bal);
		}
		else
		{
			System.out.println("withdraw unsuccessfull" );
		}
		
		}
	}

	


