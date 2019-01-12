public class PlayerMp3 extends MusicPlayer {

    public PlayerMp3(String status) {
        super(status);
    }


    public void play (){
        System.out.println("Gra odtwarzacz MP3");
    }

    public void stop (){
        System.out.println("Odtwarzacz MP3 jest wyłaczony ");

    }
}
