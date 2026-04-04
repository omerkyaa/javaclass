package amazon.week2.VehicleSystem;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        if (isStarted()) {
            System.out.println(getBrand() + " car is moving at " + getSpeed() + " km/h.");
        } else {
            System.out.println(getBrand() + " car is not started.");
        }
    }

    public void openTrunk() {
        System.out.println(getBrand() + " trunk opened.");
    }

    public void showCarInfo() {
        System.out.println("Car brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Doors: " + numberOfDoors);
    }
}
