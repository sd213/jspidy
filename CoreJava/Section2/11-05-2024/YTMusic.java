public class YTMusic implements MediaPlayer{

    @Override
    public void play() {
        System.out.println("YTMusic Playing the Music");
    }

    @Override
    public void pause() {
        System.out.println("YTMusic Pausing the Music");
    }

    @Override
    public void stop() {
        System.out.println("YTMusic Stopped Playing Music");
    }

    @Override
    public void prev() {
        System.out.println("YTMusic playing Previous Music in Current Playlist");
    }

    @Override
    public void next() {
        System.out.println("YTMusic playing Next Music in Current Playlist");
    }

    @Override
    public void shuffle() {
        System.out.println("YTMusic shuffling the Music in playlist");
    }

}
