package oops.in.sit;

public class Driver04 {
	
	void print(Docter d1) {
		System.out.println(d1.dName+" "+d1.dAge);
	}
	public static void main(String[] args) {
		Driver04 d4=new Driver04();
		
		Docter d=new Docter();
		d.dName="Dr.Satya";
		d.dAge=24;
		
		d4.print(d);
	}

}
class Docter{
	String dName;
	int dAge;
}
