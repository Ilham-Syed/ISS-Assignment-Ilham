package oops;

public class ElectricCar extends Car implements VehicleFeature{
	private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding start()
    @Override
    public void start() {
        System.out.println(model + " is starting silently (electric start)...");
    }

    @Override
    public void autoPilot() {
        System.out.println(model + " has AutoPilot feature.");
    }

    @Override
    public void parkAssist() {
        System.out.println(model + " has Park Assist feature.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Electric Car Info: " + getBrand() + " " + model + ", " + year +
                           " | Battery: " + batteryCapacity + " kWh");
    }
}
