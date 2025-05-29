package javaBasics;


/**
 * Main class to demonstrate usage of Car class
 */
public class Main {
	public static void main(String[] args) {
		// Creating Car objects (Objects from Class)
        Car car1 = new Car("Toyota", "Camry", 2020, 15000.5);
        Car car2 = new Car("Honda", "Jazz", 2019, 22000.0);

        // Display information for each car
        car1.displayInfo();
        System.out.println();
        car2.displayInfo();

        // Modify state
        car1.setMileage(16000.75);
        System.out.println("\nAfter updating mileage:");
        car1.displayInfo();

        // Static method usage
        System.out.println("\nTotal cars created: " + Car.getCarCount());
	}
}
