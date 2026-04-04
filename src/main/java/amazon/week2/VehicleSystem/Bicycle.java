package amazon.week2.VehicleSystem;

public class Bicycle extends Vehicle {

    private boolean hasBell;

    public Bicycle(String brand, int speed, boolean hasBell) {
        super(brand, speed);
        this.hasBell = hasBell;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void move() {
        if (isStarted()) {
            System.out.println(getBrand() + " bicycle is moving at " + getSpeed() + " km/h.");
        } else {
            System.out.println(getBrand() + " bicycle is not started.");
        }
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring ring");
        } else {
            System.out.println("No bell");
        }
    }

    public void showBicycleInfo() {
        System.out.println("Bicycle brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Has bell: " + hasBell);
    }
}
