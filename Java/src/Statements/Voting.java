package Statements;

import java.util.Scanner;

// Example 1: Checking Age for Voting Eligibility
public class Voting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		
		if (age>18) {
			System.out.println("You are eligible for voting.");
		} else {
           System.out.println("You are not eligible for voting.");
		}
	}
}
