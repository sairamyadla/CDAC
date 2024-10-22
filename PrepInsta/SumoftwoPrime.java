public class SumoftwoPrime {
    static int prime(int n){
        int c=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c=0;
                break;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int n=25;
        int x=0;
        for(int i=2;i<=n/2;i++){
            if(prime(i)==1){
                if(prime(n-i)==1){
                    System.out.println(n+"="+i+"+"+(n-i));
                    x=1;
                }

            }
            if(x==0){
                System.out.println("Cannot expressed");
            }
        }
    }
}
