package oops;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car("Toyota", "Camry", 2022);
        ElectricCar myTesla = new ElectricCar("Tesla", "Model S", 2023, 100);

        // Polymorphism: same method behaves differently
        Vehicle v1 = myCar;
        Vehicle v2 = myTesla;

        System.out.println("=== Car ===");
        v1.start();
        myCar.displayInfo();

        System.out.println("\n=== Electric Car ===");
        v2.start();  // overridden method
        myTesla.displayInfo();
        myTesla.autoPilot();
        myTesla.parkAssist();
	}
}
