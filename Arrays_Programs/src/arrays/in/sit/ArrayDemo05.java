 package arrays.in.sit;

import java.util.Arrays;

public class ArrayDemo05 {

	public static void main(String[] args) {
		int arr[]= {15,8,9,2,11,3};
		
		
		System.out.println("Array before sorting:");
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Sorting
		
		Arrays.sort(arr);
		
		System.out.println("Array afetr sorting:");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
