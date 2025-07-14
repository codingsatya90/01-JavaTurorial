package inheritence.in.sit;

class User1{
	void m1() {
		System.out.println("Parent class:: m1() method called");
	}
}
public class Employee extends User1{
	void m2() {
		System.out.println("Child class:: m2() method called");
	}
	public static void main(String[] args) {
		
		//creating object for child class
		Employee emp=new Employee();
		
		//calling parent class method
		emp.m1();
		
		//calling child class method
		emp.m2();
		
	}

}
