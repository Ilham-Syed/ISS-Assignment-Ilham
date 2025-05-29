package loopControl;

public class Main {
	public static void main(String[] args) {
        // Creating an array of Car objects
        Car[] cars = {
            new Car("Toyota", "Camry", 2020, 15000.5),
            new Car("Honda", "Jazz", 2019, 22000.0),
            new Car("Hyundai", "i20", 2021, 8000.0)
        };

        System.out.println("=== Car Information ===");

        // Loop control
        for (Car car : cars) {
            car.displayInfo();

            // Decision making with if-else
            if (car.needsService()) {
                System.out.println("-> This car needs servicing.\n");
            } else {
                System.out.println("-> This car is in good condition.\n");
            }
        }

        // Loop control: standard for-loop to find cars made before 2020
        System.out.println("=== Cars manufactured before 2020 ===");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year < 2020) {
                System.out.println(cars[i].brand + " " + cars[i].model);
            }
        }
    }
}
