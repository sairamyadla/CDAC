package Assignment1;

import java.util.Scanner;

public class Leap {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			int res;
			
			
		    res = ((year % 4 == 0 && year%100!=0) || (year%400 ==0)) ? 1 : 2 ;	
		    
		    switch(res) {
		    case 1: System.out.println(year + " is a leap year");
		    		break;
		    case 2: System.out.println(year + " is not a leap year");
    				break;
		    
		    }
		    
	  }
}




