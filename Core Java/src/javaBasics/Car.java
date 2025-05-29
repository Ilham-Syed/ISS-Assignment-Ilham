package javaBasics;

/**
 * Represents a Car with basic properties and behaviors.
 */
public class Car {
	
	//Instance Variables
	private String brand;
    private final String model; // 'final' means it can't be changed after assignment
    private int year;
    private double mileage;
    
    //static variable
    private static int carCount=0;
    
    /**
     * Constructor to initialize Car Object
     * @param brand
     * @param model
     * @param year
     * @param mileage
     */
    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        carCount++; // Increment car count when a new Car is created
    }
    
    //getter method for brand
    public String getBrand() {
    	return brand;
    }
    
    //setter method for brand
    public void setBrand(String brand) {
    	this.brand=brand;
    }
    
    //getter for model (final: no setter to avoid modification)
    public String getModel() {
        return model;
    }

    //getter for year
    public int getYear() {
        return year;
    }

    //setter for year
    public void setYear(int year) {
        this.year = year;
    }

    //getter for mileage
    public double getMileage() {
        return mileage;
    }
    
    //setter for mileage
    public void setMileage(double mileage) {
    	this.mileage=mileage;
    }
	
    // Method to Display car info
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
    }

    // Static method to get number of car objects created
    public static int getCarCount() {
        return carCount;
    }
	
}
