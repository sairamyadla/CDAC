package Assignment1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int yr = sc.nextInt();
		if((yr % 4 == 0 && yr%100!=0) || (yr%400 ==0)) {
			System.out.println(yr + " is a leap year");
		}
			else {
				System.out.println(yr + " is not a leap year");
			}
		}
	}


