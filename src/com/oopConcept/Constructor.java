package com.oopConcept;

public class Constructor {
	int eId;
	String eName;
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}
	public Constructor()
	{
		System.out.println("Constructor");
	}
	public Constructor(int eid,String ename )
	{
		eId=eid;
		eName=ename;
	}
	public void display()
	{
		System.out.println("eid:"+eId);
		System.out.println("ename:"+eName);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(20,"ram");
		c1.display();
		c2.display();
		

	}

}
