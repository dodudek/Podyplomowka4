import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Game {
    public static void main(String[] args) {

        Random random = new Random();

        int w = 3;
        int [] tab = new int[w];
        int licznik =0;

        int tabWin [] = {7,7,7};

        do {
            System.out.print("Wylosowane przez Ciebie cyfry to: ");

            for(int i=0; i<tab.length; i++){
                tab[i]=random.nextInt(10);

            }
            System.out.println(java.util.Arrays.toString(tab));


            System.out.println("Wygrywasz gdy wylosujesz: ");
            System.out.println(java.util.Arrays.toString(tabWin));

            if (Arrays.equals(tabWin,tab)){
                System.out.println("wygrałeś!!!");
                System.out.println("Próbowałeś: " + licznik);
            }else{
                System.out.println("Spróbuj jeszcze raz :) ");
                licznik ++;
            }

                }while (!Arrays.equals(tabWin,tab) );}


    }



