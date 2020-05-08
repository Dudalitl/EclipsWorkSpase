package replTest;


//Create an Employee class that will be fully encapsulated and will have:
//variables as FullName, ssn and salary
//constructor to initialize instance variables
//getters to have an access to instance variables
//
//Create a set collection that will store # objects of Employee type
//and using Iterator print the value of each variable


public class EmployeeRepl192 {
	
	private String fullName;
	private int ssn;
	private double salary;
	
	EmployeeRepl192(String fullName, int ssn, double salary){
		this.fullName=fullName;
		this.ssn=ssn;
		this.salary=salary;
	}
	
	public String getName() {
		return fullName;
	}
//	public void setName(String newName) {
//		fullName=newName;
//	}
	public int getSsn() {
		return ssn;
	}
//	public void setSsn(int newSsn) {
//		ssn=newSsn;
//	}
	public double getSalary() {
		return salary;
	}
//	public void setSalary(double newSalary) {
//		salary=newSalary;
//	}
	
	
	
	

}
