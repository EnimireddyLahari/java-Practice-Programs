package com.oopConcept;

public class Student {
	int sid;
	String sname;
	float marks;
	static String institute="codegnan";
	public static void main(String []args)
	{
		
		Student s1=new Student();
		Student s2=new Student();
		s1.sid=1002;
		s1.sname="sam";
		System.out.println(s1);
		System.out.println(s1.sname);
		s1.sname="ram";
		System.out.println(s1.sname);
		System.out.println(s2.sname);
		System.out.println(institute);
		institute="naresh it";
		System.out.println(institute);
		
	}

}
