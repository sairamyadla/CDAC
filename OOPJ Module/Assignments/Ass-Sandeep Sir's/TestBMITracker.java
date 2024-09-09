package lab_4;

import java.util.Scanner;

class BMITracker{
	float weight;
	float height;
	String res;
	double bmi;
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight: ");
		this.weight = sc.nextFloat();
		System.out.print("Enter Height: ");
		this.height = sc.nextFloat();
	}
	public void BMIClasiification() {
		bmi	= weight / (height * height);
		if (bmi < 18.5) {
			res = "underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
        	res = "normalweight";
        } else if (bmi >= 25 && bmi <= 29.9) {
        	res = "overweight";
        } 
          else if (bmi >= 30) {
        	  res = "Obese";
        } 
	}
	public void printRecord() {
		System.out.println("BMI: "+bmi);
		System.out.println("Classification: "+res);
		
	}
	
	
}
public class TestBMITracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMITracker calculation = new BMITracker();
		calculation.acceptRecord();
		calculation.BMIClasiification();
		calculation.printRecord();
	}

}
