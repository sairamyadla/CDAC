package lab_4;

import java.util.Scanner;

class TollBoothRevenueManager {
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    // Method to set toll rates for different vehicle types
    public void setTollRates() {
        System.out.println("Enter toll rates for Car, Truck, and Motorcycle (in ₹): ");
        Scanner sc = new Scanner(System.in);
        carRate = sc.nextDouble(); // Use instance variable
        truckRate = sc.nextDouble(); // Use instance variable
        motorcycleRate = sc.nextDouble(); // Use instance variable
    }

    // Method to accept the number of vehicles of each type
    public void acceptRecord() {
        System.out.println("Enter the number of Cars, Trucks, and Motorcycles passing through the toll booth: ");
        Scanner sc = new Scanner(System.in);
        carCount = sc.nextInt(); // Use instance variable
        truckCount = sc.nextInt(); // Use instance variable
        motorcycleCount = sc.nextInt(); // Use instance variable
    }

    // Method to calculate the total revenue
    public double calculateRevenue() {
        return (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
    }

    // Method to print the total number of vehicles and the total revenue
    public void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;
        double totalRevenue = calculateRevenue();
        System.out.println("Total Number of Vehicles: " + totalVehicles);
        System.out.printf("Total Revenue Collected: ₹%.2f\n", totalRevenue);
    }
}

public class TollBoothSystem {
    public static void main(String[] args) {
        TollBoothRevenueManager tollManager = new TollBoothRevenueManager();
        tollManager.setTollRates();
        tollManager.acceptRecord();
        tollManager.printRecord();
    }
}
