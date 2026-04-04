package amazon.week2.VehicleSystem;

public class Haupt {

    public static void main(String[] args) {

        Car car = new Car("BMW", 220, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", 100, true);
        Bicycle bicycle = new Bicycle("Bianchi", 25, true);

        System.out.println("Vehicle System");

        car.start();
        car.move();
        car.openTrunk();
        car.stop();

        System.out.println();

        motorcycle.start();
        motorcycle.move();
        motorcycle.doWheelie();
        motorcycle.stop();

        System.out.println();

        bicycle.start();
        bicycle.move();
        bicycle.ringBell();
        bicycle.stop();

        System.out.println();
        car.showCarInfo();

        System.out.println();
        motorcycle.showMotorcycleInfo();

        System.out.println();
        bicycle.showBicycleInfo();
    }
}
