import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);
    }

    private static void checkPrime(int n) {
        int c=0;
        if(n<2){
            System.out.println("prime number");
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c>2){
            System.out.println("Not prime number");
        }else{
            System.out.println("Prime number");
        }
    }
}
