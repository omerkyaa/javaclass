package amazon.week3.exceptions;

import java.util.Scanner;

public class ChoiceNumber {


    static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("Give me a number: ");
            number = sc.nextInt();

            System.out.println("Your number: " + number);

        } catch (Exception e) {
            System.out.println("Error. Please give me only number");
        }
        finally {
            System.out.println("Program continue ...");
        }



    }



}
