package amazon.week3.mediaplayersystem;

public class MusicPlayer implements Controls {

        int volume = 50;
        int songNumber= 0;
        String[] songs ={"505 by Arctic Monkeys","I wish you a merry Christmas"};
        Genre[] genres ={Genre.HARD_ROCK, Genre.JAZZ};
        int currentSong = 0;

        public void play() {
            System.out.println("Music is playing...");
        }

        public void pause() {
            System.out.println("Music paused.");
        }

        public void stop() {
            System.out.println("Music stopped.");
        }

        public int next() {
            if (currentSong < songs.length -1){
                currentSong++;
            }
            System.out.println("Now playing " + songs[currentSong]);
            return currentSong;
        }

        public void previous() {
            System.out.println("Previous song.");
        }

        public void volumeUp() {
            if (volume < 100) {
                volume += 10;
                System.out.println("Volume: " + volume);
            } else {
                System.out.println("Max volume reached!");
            }
        }

        public void volumeDown() {
            if (volume > 0) {
                volume -= 10;
                System.out.println("Volume: " + volume);
            } else {
                System.out.println("Volume is already 0!");
            }
        }

}
