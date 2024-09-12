package Assignment;

import java.util.Scanner;

public class Employee {
	
	private static int totalemp = 0;
    private static double totalSalexp = 0.0;
    
	private int id;
	private String name;
	private double salary;
	{
	totalemp++;
	}
	public Employee() {
		Scanner sc = new Scanner(System.in);
		this.id = sc.nextInt();
		this.name = sc.nextLine();
		this.salary = sc.nextDouble();
		totalSalexp+=salary;
}

	public  int getId() {
		return id;
		
	}
	public  String getName() {
		return name;
		
	}
	public double getSalary() {
		return salary;
		
	}
	public static int getTotalemployee() {
		return totalemp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
