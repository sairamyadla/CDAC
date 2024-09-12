package Assignment6;

public class MinMaxArray {

	public static void main(String[] args) {
		int arr[] = {4,2,5,7,1}; 
		int min = arr[0];
		int max = arr[0];
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]<min) min = arr[i];
			if(arr[i]>max) max = arr[i];
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
