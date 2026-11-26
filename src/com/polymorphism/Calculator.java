package com.polymorphism;

public class Calculator {
	int a;
	int b;
	public Calculator()
	{
		System.out.println("calculator open");
	}
	public Calculator(int a,int b)
	{
		System.out.println("2  parameter constructor");
		this.a=a;
		this.b=b;
		
	}
	public void add(int a,int b)
	{
		System.out.println("2 intger parameter method");
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println("3 intger parameter method");
		System.out.println(a+b+c);
	}
	public void add(int a,double b)
	{
		System.out.println("2  parameter method but it take differ type data " );
		System.out.println(a+b);
	}
}
