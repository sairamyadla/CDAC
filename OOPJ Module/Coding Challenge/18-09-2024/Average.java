import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double sum =0;
        for(int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
        double average = sum/n;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>average){
                System.out.print("numbers greater than average are: ");
                System.out.println(arr[i]);
            }
        }
    }
}
