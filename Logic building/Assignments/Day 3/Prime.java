class Prime{
	public static void main(String args[]){
	int count=0;
	for(int n=2;count<5;n++){
	int div=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
			div++;
			}
			}
			if(div==2){
			System.out.println(n);
			count++;
			}
			}
			}
			}