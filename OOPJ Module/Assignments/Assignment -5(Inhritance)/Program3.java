class Vehicle {
    public void startEngine() {
    System.out.println("Vehicle engine started.");
    }
    public void stopEngine() {
    System.out.println("Vehicle engine stopped.");
    }
   }
   class Car extends Vehicle {
    @Override
    public void startEngine() {
    System.out.println("Car engine is starting with key ignition.");
    }
    @Override
    public void stopEngine() {
    System.out.println("Car engine is stopping.");
    }
   }
   class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
    System.out.println("Motorcycle engine is starting with a kickstart.");
    }
    @Override
    public void stopEngine() {
    System.out.println("Motorcycle engine is stopping.");
    }
   }
   public class Program3 {
    public static void main(String[] args) {
    Vehicle myCar = new Car();
    myCar.startEngine();
    myCar.stopEngine();
    Vehicle myBike = new Motorcycle();
    myBike.startEngine();
    myBike.stopEngine();
    }
}   