package Assignment6;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 6, 7, 8, 4};
		int n=8;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		int expectedsum =(n *(n +1))/2;
		int totalsum = expectedsum - sum;
		System.out.println("The missing number is: "+totalsum);
		

	}

}
