package oops.in.sit;

public class SumOFTwoNumber {
     
	//instance method
      int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public static void main(String[] args) {
		SumOFTwoNumber s = new SumOFTwoNumber();//obj creation
		 
		int x = s.add(10, 20); //calling the method
		System.out.println(x); //printing the output

	}

}
