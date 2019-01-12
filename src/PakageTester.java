import pl.edu.wszib.java.PakagePresenter;
import static java.lang.Math.*;

public class PakageTester {

    public static void main(String[] args) {
        System.out.println("Pakiet: " + PakagePresenter.class.getPackage());

        PakagePresenter javaPakagePresenter = new PakagePresenter();
        pl.edu.wszib.podyplomowe.PakagePresenter podyplomowePakagePreseter = new pl.edu.wszib.podyplomowe.PakagePresenter();

        javaPakagePresenter.showPakage();
        podyplomowePakagePreseter.showPakage();

        System.out.println(E);

    }
}
