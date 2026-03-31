package amazon.week2.VehicleSystem;

public class Motorcycle extends Vehicle {

    private boolean hasHelmet;

    public Motorcycle(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void move() {
        if (isStarted) {
            System.out.println("Motorcycle " + brand + " is riding fast at " + speed + " km/h.");
        } else {
            System.out.println("Motorcycle " + brand + " cannot move because it is not started.");
        }
    }

    public void doWheelie() {
        if (isStarted) {
            System.out.println("Motorcycle " + brand + " is doing a wheelie!");
        } else {
            System.out.println("Motorcycle must be started first.");
        }
    }

    public void showMotorcycleInfo() {
        System.out.println("Motorcycle brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Helmet available: " + hasHelmet);
    }
}