package arrays.in.sit;

public class PairsDemo01 {
	public static void main(String[] args) {
		
		int arr[]= {3,5,1,6,2,7,9};
		int sum=8;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
				
					System.out.println(arr[i]+ "+" + arr[j]+"="+sum);
				}
				
			}
			
		}
		
	}

}
