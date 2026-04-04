package amazon.week3.sorting;

import java.util.Scanner;
import java.util.Random;

public class RollADice {

    String userChoice = "";
    private int dice1 = 1;
    private int dice2 = 1;

    public void printMenu() {
        System.out.println("\nPlease choose:");
        System.out.println("a) Roll one dice");
        System.out.println("b) Roll two dices");
        System.out.println("c) End the program");
        System.out.print("Your choice: ");
    }

    public int getDice1() {
        return dice1;
    }

    public void setDice1() {
        Random random = new Random();
        this.dice1 = 1 + random.nextInt(6);
    }

    public int getDice2() {
        return dice2;
    }

    public void setDice2() {
        Random random = new Random();
        this.dice2 = 1 + random.nextInt(6);
    }

    public static void main(String[] args) {

        RollADice rollADice = new RollADice();
        Scanner scanner = new Scanner(System.in);

        while (!rollADice.userChoice.equals("c")) {

            rollADice.printMenu();
            rollADice.userChoice = scanner.nextLine();

            if (rollADice.userChoice.equals("a")) {

                rollADice.setDice1();
                System.out.println("You rolled: " + rollADice.getDice1());

            } else if (rollADice.userChoice.equals("b")) {

                rollADice.setDice1();
                rollADice.setDice2();

                System.out.println("You rolled: " + rollADice.getDice1() + " and " + rollADice.getDice2());
                System.out.println("Total: " + (rollADice.getDice1() + rollADice.getDice2()));

            } else if (rollADice.userChoice.equals("c")) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();
    }
}