package arrays.in.sit;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int arr[]= {15,8,9,2,11,4};
		
		//First method
//		int[] temp=new int[arr.length];
//		int cnt=0;
//		
//		for(int i=arr.length-1; i>=0;i--) {
//			temp[cnt]=arr[i];
//			cnt++;
//		}
		
		//Second method
//		int temp=0;
//		for(int i=0; i<arr.length;i++){
//			temp=arr[i];
//			arr[i]=arr[arr.length-1];
//			arr[arr.length-1]=temp;
//			 
//		}
//		for(int n:arr) {
//			System.out.print(n+",");
//		}
		
		//third Method
		int temp=0;
		
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for(int n:arr) {
			System.out.print(n+","); 
		}
	}
}
