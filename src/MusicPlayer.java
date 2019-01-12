abstract class MusicPlayer implements Player {

    String status;

    public MusicPlayer(String status) {
        this.status = status;
    }


    @Override
    public void play() {
        System.out.println("Puszczono odtwarzanie");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymano odtwarzanie");
    }

    @Override
    public void nextSong() {
        System.out.println("Odtwarzanie następnej piosenki");

    }

    @Override
    public void previousSong() {
        System.out.println("Odtwarzanie poprzedniej piosenki");

    }
}
