package loopControl;

public class Car {
	String brand;
    String model;
    int year;
    double mileage;

    /**
     * Constructor
     * @param brand
     * @param model
     * @param year
     * @param mileage
     */
    Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    //Method to display car info
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model +
                ", Year: " + year + ", Mileage: " + mileage);
    }

    
    boolean needsService() {
        // Decision making: if mileage is above 20000
        return mileage > 20000;
    }
}



