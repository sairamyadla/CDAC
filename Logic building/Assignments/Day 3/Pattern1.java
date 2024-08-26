class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i= 1; i<=n*2; i++) {
            for(int j=1; j<=num;j++) {
                System.out.print(num);
                if(j<num) {
                    System.out.print("*");
                }
            }
            if(i < n){
                num++;
            }else if(i > n){
                num--;
            }
            System.out.println();
        }
    }
}