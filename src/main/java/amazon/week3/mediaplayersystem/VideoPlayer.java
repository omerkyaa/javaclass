package amazon.week3.mediaplayersystem;

class VideoPlayer implements Controls {

    int volume = 50;

    public void play() {
        System.out.println("Video is playing...");
    }

    public void pause() {
        System.out.println("Video paused.");
    }

    public void stop() {
        System.out.println("Video stopped.");
    }

    public int next() {
        System.out.println("Next video.");
        return 0;
    }

    public void previous() {
        System.out.println("Previous video.");
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