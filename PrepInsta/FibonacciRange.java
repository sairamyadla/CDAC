import java.util.Scanner;

public class FibonacciRange {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.print("Fibonacci numbers in the range " + start + " to " + end + ": ");

        int i = 0;
        int fibNum = fib(i);
        while (fibNum <= end) {
            if (fibNum >= start) {
                System.out.print(fibNum + " ");
            }
            i++;
            fibNum = fib(i);
        }
    }
}
