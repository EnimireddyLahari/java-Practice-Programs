package com.oopConcept;

public class Employee {
	int eId;
	String eName;
	 static String deptName;
	static
	{
		deptName="java";
		System.out.println("Static block is executed");
	}
	{
		System.out.println("instance block is executed");
		System.out.println("employee registration started");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		//Employee emp2=new Employee();
		emp1.eId=100;
		emp1.eName="ram";
		System.out.println(emp1.eId+" "+emp1.eName+" "+deptName);
		System.out.println();
		Employee emp2=new Employee();
		emp2.eId=101;
		emp2.eName="seetha ";
		System.out.println(emp2.eId+" "+emp2.eName+" "+deptName);
		Employee emp3=emp2;
		
	}

}
