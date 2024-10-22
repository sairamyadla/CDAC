public class Replace0to1 {
    static int reverse(int temp){
        int ans=0;
        while(temp>0){
            int rem = temp%10;
            ans = ans*10+rem;
            temp=temp/10;
        }
        return ans;
    }
    static int Convert0to1(int num){
        if(num==0){
            return 1;
        }else{
            int temp=0;
            while(num>0){
                int digit=num%10;
                if(digit==0){
                    digit=1;
                }
                temp=temp*10+digit;
                num=num/10;
            }
            return reverse(temp);
        }
    }
    public static void main(String[] args) {
        int num = 501020;
        System.out.println(Convert0to1(num));
    }
}
