package Assignment6;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		int arr1[] = {4,5,8,9,3};
		int arr2[] = {1,3,5,7,4};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i=0,j=0,n=0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					i++;
					j++;
			}
			else if(arr1[i] > arr2[j]) {
				j++;
			}
			else {
				i++;
			}	
		}
	}

}
