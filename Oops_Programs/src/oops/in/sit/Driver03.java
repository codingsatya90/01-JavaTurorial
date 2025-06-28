package oops.in.sit;

class Product{
	String productId="GHT674";
	String productName="Pen";
	double productPrice=5.5;
}

public class Driver03 {
	
	public static void main(String[] args) {
		
		Driver03 d=new Driver03();
		
		Product p1=new Product();
//		p1.productId="GHT674";
//		p1.productName="Pen";
//		p1.productPrice=10.0;
		d.print(p1);
	}
    void print(Product p) {
    	System.out.println(p.productId+" "+p.productName+" "+p.productPrice);
    }
}
