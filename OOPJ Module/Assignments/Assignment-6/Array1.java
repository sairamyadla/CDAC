package Assignment6;

import java.util.Scanner;

	public class Array1 {
		int arr[] = new int[5];
		private void acceptRecord() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array elements: ");
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
			Array1 array = new Array1();
			array.acceptRecord();
			array.displayRecord();
		}
}
