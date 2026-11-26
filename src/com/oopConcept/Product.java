package com.oopConcept;

public class Product {
	int pid;
	String name;
	double price;
	public Product()
	{
		this(102,"Mobile",1000);
		System.out.println("default constructor");
	}
	public Product(int pid,String name,double price)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
		
	}
	public void display()
	{
		System.out.println(pid+" "+name+" "+price);
	}
	public Product(Product p)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method st
		/*
		 * Product p1=new Product(101,"realme",40000); Product p2=new Product(p1);
		 * p1.display(); p2.display();
		 */
		Product p1=new Product();
		Product p2=new Product(101,"realme",30000);
		p1.display();
		p2.display();

	}

}
