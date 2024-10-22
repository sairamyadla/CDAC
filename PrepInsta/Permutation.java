public class Permutation {
    public static void main(String[] args) {
        int n=5,r=9,fact1,fact2;
        fact1=1;
        for(int i=n;i>1;i=i-1){
            fact1=fact1*i;
        }
        int num=n-r;
        fact2=1;
        for(int i=num;i>1;i=i-1){
            fact2=fact2*i;
        }
        int per = fact1/fact2;
        System.out.println(per+" ways");
    }
}
