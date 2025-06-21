package string.in.sit;

import java.util.Arrays;

public class SplitMethodDemo01 {
public static void main(String[] args) {
	
	String s1="hi@Hello@How@ are@you";
	String arr[]=s1.split("@");
	System.out.println(Arrays.toString(arr));
}
}
