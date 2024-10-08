import java.util.Arrays;
import java.util.Scanner;

public class KlargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K value: ");
        int k = sc.nextInt();
        
       
        Arrays.sort(arr);
        System.out.println("The " + k + " largest elements are:");
        for (int i = arr.length - 1; i >= arr.length-k; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
