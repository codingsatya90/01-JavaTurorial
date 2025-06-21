package controlstatements.in.sit;

public class Test03 {

	public static void main(String[] args) {
		
	//	switch(true) {  //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are permitted

	//	case 1:System.out.println("Hi");
	//	break;
	//	case 2:System.out.println("Hello");
	//	break;
	//	default:System.out.println("Bye");
	//	}
	/*
	 * switch(2) { case 1:System.out.println("Hi"); break; case
	 * 2:System.out.println("Hello"); break; default:System.out.println("Bye");
	 * 
	 * }
	 */
		switch("abx") {
		case "abc":System.out.println("Hi");
			break;
		case "xyz":System.out.println("Hello");
			break;
		default:System.out.println("Bye");	
		
		}
	}
}
