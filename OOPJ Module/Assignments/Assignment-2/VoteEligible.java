package Assignment1;

import java.util.Scanner;

public class VoteEligible {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	if(year >= 18) {
		System.out.println("Eligible for Voting");
	}
	else
		System.out.println("Not Eligible for Voting");
	
	}
}
