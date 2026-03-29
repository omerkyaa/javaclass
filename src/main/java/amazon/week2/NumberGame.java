package amazon.week2;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class NumberGame {

    int numberToGuess;


    static void main(String[] args) {

        NumberGame numberGame = new NumberGame();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        numberGame.numberToGuess = random.nextInt(10);

        int numberGuessed = 1000;
        int count = 0;


        while (numberGuessed != numberGame.numberToGuess) {

            System.out.println("Guess my number (0..10)");
            numberGuessed = scanner.nextInt();
            count++;

            if (numberGuessed == numberGame.numberToGuess ) {
                System.out.println("Herzlich Glünkwunsch");
                System.out.println("You tried " + count + " times");
            }




        }




    }





}
