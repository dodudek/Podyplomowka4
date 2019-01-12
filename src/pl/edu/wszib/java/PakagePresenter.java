package pl.edu.wszib.java;

public class PakagePresenter {

    public PakagePresenter (){
        System.out.println("sobota");
    }

    public void showPakage (){
        System.out.println("To jest obiekt klasy " + this.getClass().getCanonicalName() + ", w pakiecie " + this.getClass().getPackage());
    }

    public static void main(String[] args) {
        PakagePresenter pakagePresenter = new PakagePresenter();
        pakagePresenter.showPakage();
    }
}
