package lab_4;

import java.util.Scanner;

class CompoundInterestCalculator {
    double principal;
    double annualInterestRate;
    int years;
    int nc;
    double futureValue;
    double totalInterest;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" principal ");
        this.principal = sc.nextDouble();
        System.out.print("annual interest rate  ");
        this.annualInterestRate = sc.nextDouble();
        System.out.print(" years: ");
        this.years = sc.nextInt();
        System.out.print("number of compounded per year: ");
        this.nc = sc.nextInt();
    }

    public void calculateFutureValue() {
        double cp = annualInterestRate / nc / 100;
        futureValue = principal * Math.pow(1 + cp, nc * years);
        totalInterest = futureValue - principal;
    }

    public void displayRecord() {
        System.out.println("Future Value: "+ futureValue);
        System.out.println("Total Interest Earned: "+ totalInterest);
    }
}

public class CompoundInterest {
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();
        calculator.calculateFutureValue();
        calculator.displayRecord();
    }
}
