public class GCD {
    public static int Gcd(int a,int b){
        if(b==0){
            return a;
        }
        return Gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int res = Gcd(a, b);
        System.out.println(res);
    }
}
