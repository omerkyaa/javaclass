package amazon.week3.mediaplayersystem;

import java.util.Scanner;

public class MediaPlayer {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Controls player = null;

        System.out.println("Choose a media player:");
        System.out.println("1 - Music Player");
        System.out.println("2 - Video Player");
        System.out.println("3 - Podcast Player");
        System.out.print("Your choice: ");

        System.out.println(" ");

        int playerChoice = scanner.nextInt();

        if (playerChoice == 1) {
            player = new MusicPlayer();
        } else if (playerChoice == 2) {
            player = new VideoPlayer();
        } else if (playerChoice == 3) {
            player = new PodcastPlayer();
        } else {
            System.out.println("Invalid player choice.");
            scanner.close();
            return;
        }

    }
}