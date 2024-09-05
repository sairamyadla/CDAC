package Assignment1;

import java.util.Scanner;

public class BMI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height ");
        float h = sc.nextFloat();

        System.out.print("Enter weight ");
        float w = sc.nextFloat();

        float bmi = w / (h * h);

        if (bmi < 18.5) {
            System.out.println(bmi + " is underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println(bmi + " is Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println(bmi + " is Overweight");
        } 
    }
}
