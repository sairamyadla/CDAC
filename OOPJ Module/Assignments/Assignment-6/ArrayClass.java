package Assignment6;

import java.util.Scanner;

public class ArrayClass {
	int arr[] = new int[5];
	private void acceptRecord() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	}
	
	private void displayRecord() {
		for(int i=0; i < arr.length; ++i ) {
			System.out.print(" " + arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		ArrayClass array = new ArrayClass();
		array.acceptRecord();
		array.displayRecord();
	}


}
