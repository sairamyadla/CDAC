package assignment3;

import java.util.Scanner;

class  LoanAmortizationCalculator{
	double principal;
    double annualInterestRate;
    int loanTerm;
    double monthlyPayment;
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("principal: ");
		this.principal = sc.nextDouble();
		System.out.print("annualIntrestRate: ");
		this.annualInterestRate = sc.nextDouble();
		System.out.print("loanTerm: ");
		this.loanTerm = sc.nextInt();
	}
	public void calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;

		monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate , numberOfMonths)) / Math.pow(1 + monthlyInterestRate ,numberOfMonths) - 1;
		
		
	}
	public void dislayRecord() {
		double totalpayment = monthlyPayment*loanTerm*12;
		System.out.println("Monthly Payment: " + monthlyPayment);
		System.out.println("Total payment: "+ totalpayment);
		
	}
    
    
}
public class LoanAmortization {

	public static void main(String[] args) {
		LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();
        calculator.acceptRecord();
        calculator.calculateMonthlyPayment();
        calculator.dislayRecord();
	}

}
