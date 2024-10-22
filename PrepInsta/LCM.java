public class LCM {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        int Gcd = gcd(a,b);
        int lcm = (a*b)/Gcd;
        System.out.println(lcm);
    }
}
