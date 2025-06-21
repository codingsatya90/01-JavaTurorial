package arrays.in.sit;

import java.util.Arrays;

public class ArraySortinng01 {

	public static void main(String[] args) {
		
		int arr[]= {15,3,5,8,2,9,7};
		int temp=0;
		
		
		//Ascendinng Order
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
	System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
}
