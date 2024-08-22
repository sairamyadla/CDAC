import java.util.Scanner;
class Discount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed total purchase amount
        double total = 600;

        // Input whether the user has a membership card
        System.out.print("Do you have a membership card? (y/n): ");
        String membership = scanner.next().toLowerCase();

        double discount = 0.0;

        // Determine the discount based on the total purchase amount
        if (total >= 1000) {
            discount = 20.0;
        } else if (total >= 500) {
            discount = 10.0;
        } else {
            discount = 5.0;
        }

        // Check if the user has a membership card and increase the discount if applicable
        if (membership.equals("y")) {
            discount += 5.0;
        } else if (!membership.equals("n")) {
            System.out.println("Error: Invalid input for membership card.");
            return; // Exit the program if input is invalid
        }

        // Calculate the discount amount and final amount
        double discountAmount = (discount / 100) * total;
        double finalAmount = total - discountAmount;

        // Output the results
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Amount to Pay: Rs. " + finalAmount);

        scanner.close();
    }
}
