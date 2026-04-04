package amazon.week3.mediaplayersystem;

class PodcastPlayer implements Controls {

    int volume = 50;

    public void play() {
        System.out.println("Podcast is playing...");
    }

    public void pause() {
        System.out.println("Podcast paused.");
    }

    public void stop() {
        System.out.println("Podcast stopped.");
    }

    public int next() {
        System.out.println("Next episode.");
        return 0;
    }

    public void previous() {
        System.out.println("Previous episode.");
    }

    public void volumeUp() {
        volume += 10;
        System.out.println("Volume: " + volume);
    }

    public void volumeDown() {
        volume -= 10;
        System.out.println("Volume: " + volume);
    }
}