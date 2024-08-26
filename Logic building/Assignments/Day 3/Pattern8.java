class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i= 1; i<=n; i++) {
            for(int j=n; j>=n-i+1;j--) {
                System.out.print(j);
                if(j>n-i+1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}