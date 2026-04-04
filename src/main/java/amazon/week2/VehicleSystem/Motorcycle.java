package amazon.week2.VehicleSystem;

public class Motorcycle extends Vehicle {

    private boolean hasHelmet;

    public Motorcycle(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void move() {
        if (isStarted()) {
            System.out.println(getBrand() + " motorcycle is moving at " + getSpeed() + " km/h.");
        } else {
            System.out.println(getBrand() + " motorcycle is not started.");
        }
    }

    public void doWheelie() {
        if (isStarted()) {
            System.out.println(getBrand() + " is doing wheelie.");
        } else {
            System.out.println("Start the motorcycle first.");
        }
    }

    public void showMotorcycleInfo() {
        System.out.println("Motorcycle brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Has helmet: " + hasHelmet);
    }
}
