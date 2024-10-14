public class PerfectSquare {
    static boolean isPerfect(int n){
        if(n>=0){
            int sq = (int)Math.sqrt(n);
            return ((sq*sq)==n);
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 84;
        if(isPerfect(n)){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not a perfect Square");
        }
    }
}
