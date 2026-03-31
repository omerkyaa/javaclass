package amazon.week2.VehicleSystem;

public class Vehicle {

    protected String brand;
    protected int speed;
    protected boolean isStarted;

    public Vehicle(String brand, int speed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Unknown";
        } else {
            this.brand = brand;
        }

        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }

        this.isStarted = false;
    }

    public void start() {
        if (isStarted) {
            System.out.println(brand + " is already started.");
        } else {
            isStarted = true;
            System.out.println(brand + " started.");
        }
    }

    public void stop() {
        if (!isStarted) {
            System.out.println(brand + " is already stopped.");
        } else {
            isStarted = false;
            System.out.println(brand + " stopped.");
        }
    }

    public void move() {
        if (isStarted) {
            System.out.println(brand + " is moving at " + speed + " km/h.");
        } else {
            System.out.println(brand + " cannot move because it is not started.");
        }
    }
}