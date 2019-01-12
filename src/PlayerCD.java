public class PlayerCD extends MusicPlayer {

    public PlayerCD(String status) {
        super(status);
    }

    public void play (){
        System.out.println("Gra odtwarzacz CD");
    }

    public void stop (){
        System.out.println("Odtwarzacz CD jest wyłaczony ");

    }
}
