package oops;

public abstract class Vehicle {
	private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Encapsulation: getter & setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Abstract method which indicates the starting of the car
    public abstract void start();
}
