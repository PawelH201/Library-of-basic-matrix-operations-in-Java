import java.util.ArrayList;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


public class Wektor
{
    private double[] wektor; //deklaracja prywatnej tablicy jednowymiarowej wektor

    public double[] getWektor() // zwraca tablicę wektor
    {
        return wektor;
    }

    public void setWektor(double... wektor) // ustawia wartość tablicy wektor
    {
        this.wektor = wektor;
    }

    public Wektor(double... wektor) // konstrkutkor obiektu Wektor
    {
        this.wektor = wektor;
    }

    static Wektor wektor(double... wektorparametr) // deklaracja metody macierz(), która zwraca tablicę tablic w typie danych double
    {
        Wektor wektor = new Wektor(wektorparametr);
        return wektor; // zwraca parametry macierzy w obiekcie Macierz
    }


    public static void main(String[] args)
    {
        Wektor macierz1 = new Wektor(2,3,4,5,6);

        //System.out.println(macierz(new double[]{3,4.8,3.3432}, new double[]{2,4.23,-2321.32,0.43})); // wyrzuca wyjątek

        System.out.println(macierz1);
        //System.out.println(macierz2); // wyrzuca wyjątek
    }
}