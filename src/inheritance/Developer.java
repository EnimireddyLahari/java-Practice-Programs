package inheritance;

public class Developer extends Employee {
	public void writingCode()
	{
		System.out.println("start code writing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Developer dev1=new Developer();
		dev1.empId=102;
		dev1.empName="sam";
		dev1.sal=30000;
		dev1.empDetails();
		dev1.writingCode();
		emp1.empId=101;
		emp1.empName="ram";
		emp1.sal=40000;
		emp1.empDetails();
		System.out.println(emp1.getClass().getSimpleName());//it returns class name if only getClass we get path  
		
		
		

	}

}
