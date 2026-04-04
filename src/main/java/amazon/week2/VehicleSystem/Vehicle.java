package amazon.week2.VehicleSystem;

public class Vehicle {

    private String brand;
    private int speed;
    private boolean started;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.started = false;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStarted() {
        return started;
    }

    public void start() {
        started = true;
        System.out.println(brand + " started.");
    }

    public void stop() {
        started = false;
        System.out.println(brand + " stopped.");
    }

    public void move() {
        if (started) {
            System.out.println(brand + " is moving.");
        } else {
            System.out.println(brand + " is not started.");
        }
    }
}
