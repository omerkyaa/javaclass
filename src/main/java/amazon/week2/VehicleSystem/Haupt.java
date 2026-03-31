package amazon.week2.VehicleSystem;

public class Haupt {

    public static void main(String[] args) {

        Vehicle car = new Car("BMW", 220, 4);
        Vehicle motorcycle = new Motorcycle("Yamaha", 100, true);
        Vehicle bicycle = new Bicycle("Bianchi", 25, true);

        System.out.println("Vehicle System");

        car.start();
        car.move();
        car.stop();

        System.out.println();

        motorcycle.start();
        motorcycle.move();
        motorcycle.stop();

        System.out.println();

        bicycle.start();
        bicycle.move();
        bicycle.stop();

        System.out.println();
        System.out.println("UNIQUE FEATURES");

        Car c1 = new Car("Audi", 240, 4);
        c1.openTrunk();
        c1.showCarInfo();

        System.out.println();

        Motorcycle m1 = new Motorcycle("Honda", 110, true);
        m1.doWheelie();
        m1.showMotorcycleInfo();

        System.out.println();

        Bicycle b1 = new Bicycle("Trek", 20, true);
        b1.ringBell();
        b1.showBicycleInfo();
    }
}