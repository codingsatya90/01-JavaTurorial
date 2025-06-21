package oops.in.sit;

import java.util.Scanner;

public class Vote {
	private int age;

	Boolean vote(int age) {
		this.age = age;
		return true;

	}

	void display() {
		if (age >= 18) {
			System.out.println("Eligible for Vote");
		} else {
			System.out.println("Not Eligible for Vote");
		}

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Vote v=new Vote();
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		v.vote(age);
		v.display();
	}


	}

