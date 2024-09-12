package Assignment6;

public class DuplicatesArray {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3, 4, 5, 5};
        int n = arr.length;
        int j = 0;
        
        int temp[] = new int[n];
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        
        temp[j++] = arr[n - 1];
        
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
