package com.methods;
import java.util.*;
public class RPS {
	static int comScore;
	static int userScore;
	static int tieCount;
	public static void startGame()
	{
	
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		String arr[]= {"r","s","p"};
		System.out.println("enter user input:");
		int usi=sc.nextInt();
		if(usi<0 || usi>2)
		{
			System.out.println("invalid choice");
			return;
		}
		String usc=arr[usi];
		System.out.println("user input:"+usc);
		//computer input
		int cmi=rd.nextInt(3);
		String cmc=arr[cmi];
		System.out.println("computer choice:"+cmc);
		//game logic
		if(usc.equals(cmc))
		{
			System.out.println("game is tie");
			tieCount++;
		}
		else if(usc.equals("r") && cmc.equals("s") || usc.equals("s") && cmc.equals("p") || usc.equals("p") && cmc.equals("r"))
		{
			System.out.println("user win");
			userScore++;
		}
		else
		{
			System.out.println("computer win");
			comScore++;
		}
	}
	public void score()
	{
		System.out.println("computer score:"+comScore);
		System.out.println("user score:"+userScore);
		System.out.println("tie count: "+tieCount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RPS rps=new RPS ();
		Scanner sc=new Scanner(System.in);
		System.out.println("1 game started\n 2 check score \n 3 exit");
		boolean start=true;
		while(true)
		{
			System.out.println("enter choice");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				startGame();
				break;
			case 2:
				rps.score();
				break;
			case 3:
				System.out.println(".....come again and paly....");
				start=false;
				return;
			default:
				System.out.println("invaliod choice");
			}
		}
		
	}

}
