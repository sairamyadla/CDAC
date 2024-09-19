class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void getVehicleDetails() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
        super(make, year); 
        this.model = model;
    }

    public void getCarDetails() {
        getVehicleDetails(); 
        System.out.println("Model: " + model);
    }

    public String getModel() {
        return model;
    }
}

public class Program {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, "Corolla");
        myCar.getCarDetails();
    }
}
