package Assignment6;

import java.util.Scanner;

public class Array2 {
	int arr[] = new int[5];
	public void getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array E2lements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	public void setArray() {
		System.out.println("Array Elements are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	public static void main(String[] args) {
		Array2 array = new Array2();
		array.getArray();
		array.setArray();
		
		
		
	}

}
