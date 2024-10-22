public class NoofDigits {
    public static void main(String[] args) {
        int c=0;
        int n=7893456;
        while(n!=0){
            n/=10;
            c++;
        }
        System.out.println(c);
    }
}
