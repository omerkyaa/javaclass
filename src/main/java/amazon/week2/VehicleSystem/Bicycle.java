package amazon.week2.VehicleSystem;

public class Bicycle extends Vehicle {

    private boolean hasBell;

    public Bicycle(String brand, int speed, boolean hasBell) {
        super(brand, speed);
        this.hasBell = hasBell;
    }

    @Override
    public void start() {
        if (isStarted) {
            System.out.println("Bicycle " + brand + " is already ready to ride.");
        } else {
            isStarted = true;
            System.out.println("Bicycle " + brand + " is ready to ride.");
        }
    }

    @Override
    public void move() {
        if (isStarted) {
            System.out.println("Bicycle " + brand + " is pedaling at " + speed + " km/h.");
        } else {
            System.out.println("Bicycle " + brand + " cannot move because it is not ready.");
        }
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Bicycle bell: Ring ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    public void showBicycleInfo() {
        System.out.println("Bicycle brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Has bell: " + hasBell);
    }
}