package lab_4;

import java.util.Scanner;

class Discount{
	float price;
	float percentage;
	double discount;
	double finalprice;
	
	public void acceptRecord() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Original Price: ");
		this.price = sc.nextFloat();
		System.out.print("Discount Percentage: ");
		this.percentage = sc.nextFloat();
	}

	public void DiscountAmountCalculation() {
		// TODO Auto-generated method stub
		discount = price * (percentage / 100);
		finalprice = price - discount;
		
	}

	public void printRecord() {
		// TODO Auto-generated method stub
		System.out.println("Discount Amount: "+discount);
		System.out.println("Final price: "+finalprice);
	}
	
}
public class DiscountAmount {
	public static void main(String args[]) {
		Discount calculation = new Discount();
		calculation.acceptRecord();
		calculation.DiscountAmountCalculation();
		calculation.printRecord();
		
	}

}
