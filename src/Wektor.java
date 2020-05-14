import java.util.ArrayList;
import java.util.Arrays;
import java.lang.IllegalArgumentException;

/**
 * @author phulanic
 */

public class Wektor
{
    //deklaracja tablicy zmiennych typu double o nazwie wektor (nazwa klasy to Wektor - wielka litera)
    public double[] wektor;
// metoda get dla klasy Wektor
    public double[] getWektor()
    {
        return wektor;
    }
// setter dla klasy Wektor
    public void setWektor(double... wektor)
    {
        this.wektor = wektor;
    }
//konstruktor klasy
    public Wektor(double... wektor)
    {
        this.wektor = wektor;
    }
//deklaracja metody wektor, tworzy tablice ze zmiennymi double a nastepnie ja zwraca
    static Wektor wektor(double... wektorparametr)
    {
        Wektor wektor = new Wektor(wektorparametr);
        return wektor;
    }
//metoda toString dla klasy Wektor
    @Override
    public String toString() {
        return "Wektor{" +
                "wektor=" + Arrays.toString(wektor) +
                '}';
    }
//czesc testowa
    public static void main(String[] args)
    {
        //utworzenie wektora
        Wektor wektor1 = new Wektor(2,3,4,5,6);
        //sprawdzenie dzialania metod funkcji wektor
        System.out.println(wektor1.wektor);
        System.out.println(wektor1.toString());
        System.out.println(wektor1.getWektor());
        System.out.println(wektor1);
    }
}