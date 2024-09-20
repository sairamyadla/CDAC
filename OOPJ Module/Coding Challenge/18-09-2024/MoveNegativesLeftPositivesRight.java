import java.util.Scanner;

public class MoveNegativesLeftPositivesRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

    int[] arr = new int[n];
        System.out.println("Enter the elements of the array (both positive and negative):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

          rearrangeArray(arr);

     System.out.println("Rearranged array:");
           for (int num : arr) {
       System.out.print(num + " ");
        }
    }

    public static void rearrangeArray(int[] arr) {
          int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
        if (arr[left] < 0) {
                  left++;
            }
              else if (arr[right] >= 0) {
                right--;
            }
             else {
                 int temp = arr[left];
                arr[left] = arr[right];
                 arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
