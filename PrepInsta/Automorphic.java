public class Automorphic {
    static boolean isAutomorphic(int n) {
        int sq = n * n; 
        while (n != 0) {
            if (n % 10 != sq % 10) {
                return false;
            }
            n /= 10;
            sq /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 25; 
        if (isAutomorphic(n)) {
            System.out.println(n + " is Automorphic");
        } else {
            System.out.println(n + " is not Automorphic");
        }
    }
}
