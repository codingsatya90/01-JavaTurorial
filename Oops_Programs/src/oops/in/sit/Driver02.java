package oops.in.sit;

public class Driver02 {

	public static void main(String[] args) {
		Driver02 d=new Driver02();
		Employee e=new Employee();
		e.empId=111;
		e.empSalary=83282.00;
		 
		d.print(e);
	
	}

	void print(Employee e) {
		System.out.println(e.empId+" \n"+e.empSalary);

	}
}

class Employee {
	int empId;
	double empSalary;
}
