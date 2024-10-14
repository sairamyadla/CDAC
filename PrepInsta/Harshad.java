public class Harshad {
    public static void main(String[] args) {
        int n = 47;
        int res=0;
        while(n!=0){
            int last = n%10;
            res = res+last;
            n=n/10;
        }
        if(n%res==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Number");
        }
    }
}
