import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindowMedian {

    public static double findMedian(int[] window) {
        Arrays.sort(window); 
        int n = window.length;

        if (n % 2 == 1) { 
            return window[n / 2];
        } else { 
            return (window[(n / 2) - 1] + window[n / 2]) / 2.0;
        }
    }

    public static void findSlidingWindowMedian(int[] arr, int k) {
        for (int i = 0; i <= arr.length - k; i++) {
            int[] window = Arrays.copyOfRange(arr, i, i + k);
            
            System.out.println("Window: " + Arrays.toString(window) + " -> Median: " + findMedian(window));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the window (k):");
        int k = sc.nextInt();

        findSlidingWindowMedian(arr, k);
    }
}
