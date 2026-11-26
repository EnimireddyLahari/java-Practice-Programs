package com.polymorphism;

public class MovieTicket {
	int tickets;
	boolean isPremium;
	double discount;
	static int price=200;
	int total=0;
	public void bookTicket(int tickets)
	{
		int total=tickets*price;
		System.out.println(total);
	}
	//boolean remium;
	public void bookTicket(int tickets,boolean isPremium)
	{
		if(isPremium)
		{
			//premium=true;
			total=tickets*350;
		    System.out.println(total);
		}
		else
		{
			//premium=false;
			int total=tickets*price;
			System.out.println(total);
		}
	}	
		public void bookTicket(int tickets, boolean isPremium, double discount)
		{
			if(isPremium)
			{
				//premium=true;
				total=tickets*350;
				System.out.println(total);
			}
			else
			{
				bookTicket(tickets);
			}
			double disct=0.0;
			if(total>1000)
			{
				disct=total*20/100;
				//double totalprice=total-disct;
			}
			double totalprice=total-disct;
			System.out.println(totalprice);
		}
		

}
