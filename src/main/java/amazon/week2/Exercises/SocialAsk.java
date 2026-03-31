package amazon.week2.Exercises;

import java.util.Scanner;

public class SocialAsk {


    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SocialAsk Program");
        System.out.println("Now coming first question. Are you ready? (yes/no)");

        String answer = scanner.nextLine();

        if (answer.equals("no")) {
            System.out.println("Okey, good bye");
        } else {
            System.out.println("How many hours do you spend on Instagram");
            double instaTime = scanner.nextDouble();

            System.out.println("How many hours on Tiktok");
            double tiktokTime = scanner.nextDouble();

            double totalTime = instaTime + tiktokTime;

            if (totalTime < 3 ){
                System.out.println("not bad");
            } else{
                System.out.println("You must go to outside");
            }



        }







    }



}
