package com.oopConcept;

public class Mobile {
	
	static String brand="samsung";
	static
	{
		System.out.println("Mobile store opened");
	}
	{
		System.out.println("Mobile object Created");
	}
	String model;
	int price;
	String colour;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mb1=new Mobile();
		Mobile mb2=new Mobile();
		mb1.model="Galaxy A55";
		mb1.price=35000;
		mb1.colour="Black";
		mb2.model="Galaxy S24";
		mb2.price=75000;
		mb2.colour="Blue";
		System.out.println();
		System.out.println(brand);
		System.out.println();
		System.out.println("Mobile 1");
		System.out.println("Model:"+mb1.model);
		System.out.println("price:"+mb1.brand);
		System.out.println("colour:"+mb1.colour);
		System.out.println();
		System.out.println("Mobile 2");
		System.out.println("Model:"+mb2.model);
		System.out.println("price:"+mb2.brand);
		System.out.println("colour:"+mb2.colour);
		
		
		

	}

}
