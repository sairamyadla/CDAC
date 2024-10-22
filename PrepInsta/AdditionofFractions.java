public class AdditionofFractions {
    public static void main(String[] args) {
        int a=1,b=3,c=3,d=9;
        int x,y,gcd=0;
        x = (a*d)+(b*c);
        y = b*d;
        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        System.out.println(x/gcd +"/"+y/gcd);
    } 
}
