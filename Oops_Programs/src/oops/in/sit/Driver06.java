package oops.in.sit;

class College{
	int id;
	String name;
}

public class Driver06 {
	
	
	
	public static void main(String[] args) {
		
		Driver06 d=new Driver06();
		
		College c=d.m1();
		System.out.println(c.id+" "+c.name);
		
	}
	College m1() {
		College c=new College();
		c.id=101;
		c.name="RD college ";
		return c;
	}

}
