package oops.in.sit;

public class FindMaxElement {

	public int findMaxElement(int[] arr) {
		
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		return max;
	
		
	}
	
	public static void main(String[] args) {
		int arr[]= {3,6,8,2,1,9,4};
		FindMaxElement ele=new FindMaxElement();
		ele.findMaxElement(arr);
		
		
	}
}
