package inheritance;

public class Employee {
	int empId;
	String empName;
	double sal;

	/*
	 * public int getempId() { return empId; } public void setempId(int empId) {
	 * this.empId = empId; } public String getempName() { return empName; } public
	 * void setempName(String empName) { this.empName = empName; } public double
	 * getsal() { return sal; } public void setsal(double sal) { if(sal>1000) {
	 * this.sal = sal; } else {
	 * System.out.println("invalid salary! plz enter valid salary"); }
	 * 
	 * }
	 */
	public void empDetails()
	{
		System.out.println("employee id:"+empId);
		System.out.println("employee name:"+empName);
		System.out.println("employee salary:"+sal);
		
	}
	

}
