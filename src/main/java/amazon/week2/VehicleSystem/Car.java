package amazon.week2.VehicleSystem;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);

        if (numberOfDoors < 1) {
            this.numberOfDoors = 4;
        } else {
            this.numberOfDoors = numberOfDoors;
        }
    }

    @Override
    public void move() {
        if (isStarted) {
            System.out.println("Car " + brand + " is driving on the road at " + speed + " km/h.");
        } else {
            System.out.println("Car " + brand + " cannot move because it is not started.");
        }
    }

    public void openTrunk() {
        System.out.println("Car " + brand + " trunk is open.");
    }

    public void showCarInfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Number of doors: " + numberOfDoors);
    }
}