public class MainPlayer {

    public static void main(String[] args) {

//        Player [] players = {new PlayerCD(), new PlayerMp3()};

        MusicPlayer musicPlayer = new PlayerCD("on");
        MusicPlayer musicPlayer1 = new PlayerMp3("of");

        musicPlayer.nextSong();

        musicPlayer1.play();
        musicPlayer.stop();

        Song song = new Song("Billy Joel", "Vienna", "The Stranger");

        Song [] songs = new Song[5];

    }
}
