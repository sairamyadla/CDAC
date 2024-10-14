public class Power {
    public static void main(String[] args) {
        double base = 1.5;
        int exp = 2;
        double res = 1.0;

        while(exp!=0){
            res*=base;
            exp--;
        }
        System.out.println(res);
    }
}
