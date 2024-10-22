public class Decodingdigit {
    public static int decoding(char[] dig,int n){
        int cnt[] = new int[n+1];
        cnt[0]=1;
        cnt[1]=1;
        for(int k=2;k<=n;k++){
            cnt[k]=0;
            cnt[k]=cnt[k-1];
            if(dig[k-2]=='1'||(dig[k-2]=='2' && dig[k-1]<'7')){
                cnt[k]+=cnt[k-2];
            }
        }
        return cnt[n];
    }
    public static void main(String[] args) {
        String s = "1234321";
        char[] dig = s.toCharArray();
        System.out.println(decoding(dig, s.length()));
    }
}
