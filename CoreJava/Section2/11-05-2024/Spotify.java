public class Spotify implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Spotify Playing the Music");
    }

    @Override
    public void pause() {
        System.out.println("Spotify Pausing the Music");
    }

    @Override
    public void stop() {
        System.out.println("Spotify Stopped Playing Music");
    }

    @Override
    public void prev() {
        System.out.println("Spotify playing Previous Music in Current Playlist");
    }

    @Override
    public void next() {
        System.out.println("Spotify playing Next Music in Current Playlist");
    }

    @Override
    public void shuffle() {
        System.out.println("Spotify shuffling the Music in playlist");
    }
}
