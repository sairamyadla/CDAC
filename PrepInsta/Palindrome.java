import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0,rem,temp;
        temp=num;
        while(temp!=0){
            rem = temp%10;
            rev=rev*10+rem;
            temp /=10;
        }
        if(num==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
