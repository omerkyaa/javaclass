package amazon.week3.zoo.exercises;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("Choose an animal:");
            System.out.println("1 - Lion");
            System.out.println("2 - Parrot");
            System.out.println("3 - Elephant");
            System.out.println("0 - Exit");

            int choice = sc.nextInt();

            Animal animal = null;

            if (choice == 1) {
                animal = new Lion();
            } else if (choice == 2) {
                animal = new Parrot();
            } else if (choice == 3) {
                animal = new Elephant();
            } else if (choice == 0) {
                running = false;
                System.out.println("Program ended.");
            } else {
                System.out.println("Invalid choice");
            }

            // If a valid choice
            if (animal != null) {
                animal.makeSound();
                animal.eat();
                animal.sleep();
            }
        }

        sc.close();
    }
}