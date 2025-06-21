package arrays.in.sit;

import java.util.Arrays;

public class MultiDimensionArray02 {
	public static void main(String[] args) {

		int arr[][] = new int[2][2];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[1][0] = 300;
		arr[1][1] = 400;
		for(int n[]:arr) {
			System.out.println(Arrays.toString(n));
		}
	}
}
