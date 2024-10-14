public class Abudant {
    public static void main(String[] args) {
        int n=10,sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum>n){
            System.out.println("Abudant number");
            System.out.println("Abudance is: "+(sum-n));
        }else{
            System.out.println("Not Abudant number");
        }

    }
}
