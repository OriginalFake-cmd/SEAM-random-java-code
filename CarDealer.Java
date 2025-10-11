
public class Main {
    private String make;
    private String model;
    private int year;
    private String vin;
    private double price;
    private boolean isSold;

    public Car(String make, String model, int year, String vin, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.price = price;
        this.isSold = false;
    }

}
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private List<Car> inventory;

    public Dealership(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public void addCar(Car car) {
        inventory.add(car);
        System.out.println(car.getModel() + " added to inventory.");
    }

    public void displayInventory() {
        System.out.println("\n--- " + name + " Inventory ---");
        for (Car car : inventory) {
            if (!car.isSold()) {
                System.out.println(car.toString());
            }
        }
    }

   
}
public class Main {
    public static void main(String[] args) {
        Dealership myDealership = new Dealership("Awesome Autos");

        Car car1 = new Car("Honda", "Civic", 2023, "VIN123", 25000.00);
        Car car2 = new Car("Toyota", "Camry", 2024, "VIN456", 30000.00);

        myDealership.addCar(car1);
        myDealership.addCar(car2);

        myDealership.displayInventory();
    }
}
