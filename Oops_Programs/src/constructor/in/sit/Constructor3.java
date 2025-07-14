package constructor.in.sit;

public class Constructor3 {
	String name;
	Float price;
	public Constructor3(String name,float price) {
		
	this.name=name;
	this.price=price;
	System.out.println(this.name+" "+this.price);
		
	}
	public static void main(String[] args) {
		Constructor3 c3=new Constructor3("Shajal",12000.00f);
	}

}
