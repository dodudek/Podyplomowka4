package pl.edu.wszib.podyplomowe;

public class PakagePresenter {

    public PakagePresenter (){
        System.out.println("sobota");
    }

    public void showPakage (){
        System.out.println("To jest obiekt klasy " + this.getClass().getCanonicalName() + ", w pakiecie " + this.getClass().getPackage());
    }
}
