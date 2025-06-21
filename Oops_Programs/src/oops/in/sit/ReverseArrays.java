package oops.in.sit;

public class ReverseArrays {
	
	int[] reverseArray(int ar[]) {
		
		for(int i=ar.length-1 ;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		return ar; 
		
		
	}

	public static void main(String[] args) {
		
		ReverseArrays ra=new ReverseArrays();
		int arr[]= {2,6,8,3,7,1,9,3,4};
		ra.reverseArray(arr);
		
	}

}
