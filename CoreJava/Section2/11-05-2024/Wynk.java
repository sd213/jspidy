public class Wynk implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Wynk Playing the Music");
    }

    @Override
    public void pause() {
        System.out.println("Wynk Pausing the Music");
    }

    @Override
    public void stop() {
        System.out.println("Wynk Stopped Playing Music");
    }

    @Override
    public void prev() {
        System.out.println("Wynk playing Previous Music in Current Playlist");
    }

    @Override
    public void next() {
        System.out.println("Wynk playing Next Music in Current Playlist");
    }

    @Override
    public void shuffle() {
        System.out.println("Wynk shuffling the Music in playlist");
    }
}
