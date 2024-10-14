import java.util.Scanner;

public class StrongNumber {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    static boolean strong(int n){
        int digit,sum=0;
        int temp=n;

        while(temp!=0){
            digit=temp%10;

            sum=sum+fact(digit);
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(strong(n)){
            System.out.println(n+" is strong");
        }else{
            System.out.println(n+ " is not strong");
        }
    }
}
