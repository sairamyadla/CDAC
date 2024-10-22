import java.util.Scanner;

public class NoofDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a number between 1 and 12.");
        } else {
            switch (month) {
                case 1: 
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("No. of days is 31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("No. of days is 30");
                    break;
                case 2:
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println("No. of days is 29 (Leap Year)");
                    } else {
                        System.out.println("No. of days is 28");
                    }
                    break;
            }
        }
    }
}
