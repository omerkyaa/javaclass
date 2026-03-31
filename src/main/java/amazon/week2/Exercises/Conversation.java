package amazon.week2.Exercises;

import java.util.Scanner;

public class Conversation {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean personWantsToEnd = false;

        while (!personWantsToEnd) {
            System.out.println("Do you want to continue?  (yes/no)");
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                personWantsToEnd = true;
            }

        }

        System.out.println("Thanks for talking to us");



    }





}
