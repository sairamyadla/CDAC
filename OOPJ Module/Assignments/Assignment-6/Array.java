package Assignment6;

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		int arr[] = new int[5];
		System.out.println("Printing default values:");
		for(int i=0; i < arr.length; ++i ) {
			System.out.print(" " + arr[i]+ " ");
		}
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("updated values of array");
		for(int i=0; i < arr.length; ++i ) {
			System.out.print(" " + arr[i]+ " ");
		}
		
	}

}
