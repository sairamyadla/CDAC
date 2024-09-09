package lab_4;

import java.util.Scanner;

class TollBoothRevenueManager {
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    public void setTollRates() {
        System.out.println("Enter toll rates for Car, Truck, and Motorcycle (in ₹): ");
        Scanner sc = new Scanner(System.in);
        carRate = sc.nextDouble(); 
        truckRate = sc.nextDouble(); 
        motorcycleRate = sc.nextDouble(); 
    }

    public void acceptRecord() {
        System.out.println("Enter the number of Cars, Trucks, and Motorcycles passing through the toll booth: ");
        Scanner sc = new Scanner(System.in);
        carCount = sc.nextInt(); 
        truckCount = sc.nextInt(); 
        motorcycleCount = sc.nextInt(); 
    }

    public double calculateRevenue() {
        return (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
    }

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
