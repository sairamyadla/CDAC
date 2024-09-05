package Assignment1;

import java.util.Scanner;

public class Season {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		
		case 12:
        case 1:
        case 2:
        		System.out.println("It is Winter");
        		break;
        case 3:
        case 4:
        case 5:
	        	System.out.println("It is Spring");
	    		break;
        case 6:
        case 7:
        case 8:
	        	System.out.println("It is Summer");
	    		break;
        case 9:
        case 10:
        case 11:
	        	System.out.println("It is Autumn");
	    		break;
		}
		
	}

}
