package constructor.in.sit;

public class Employee {

	String name;
	float salary;
	Employee(String name,float salary){
		this.name=name;
		this.salary=salary;
		System.out.println(this.name+" "+this.salary);
	}
	Employee(String name){
		this.name=name;
		System.out.println(this.name+" "+this.salary);
	}
	public static void main(String[] args) {
		Employee emp1=new Employee("Rahul",15000.00f);
		Employee emp2=new Employee("Ramu",20000.89f);
		
		Employee emp3=new Employee("Ashok");
	}
}
