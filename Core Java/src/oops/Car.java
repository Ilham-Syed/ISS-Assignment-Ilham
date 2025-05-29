package oops;

public class Car extends Vehicle {
	protected String model;
    protected int year;

    /**
     * Constructor
     * @param brand
     * @param model
     * @param year
     */
    public Car(String brand, String model, int year) {
        super(brand);
        this.model = model;
        this.year = year;
    }

    // Overriding abstract method
    @Override
    public void start() {
        System.out.println(model + " is starting with a key...");
    }

    // Method to display Car information
    public void displayInfo() {
        System.out.println("Car Info: " + getBrand() + " " + model + ", " + year);
    }
}
