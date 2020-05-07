//na razie w trakcie budowy tego projektu będziemy dodawać proste komentarze, dokumentacja zostanie dopisana potem, kiedy będziemy mieć lepiej przygotowane kody źródłowe
import java.util.Arrays;
import java.lang.IllegalArgumentException;


public class Wektor
{
    private double[] wektor; //deklaracja prywatnej tablicy dwuwymiarowej macierz

    public double[] getWektor() // zwraca dwuwymiarową tablicę macierz
    {
        return wektor;
    }

    public void setWektor(double[] wektor) // ustawia wartość tablicy dwuwymiarowej macierz
    {
        this.wektor = wektor;
    }

    public Wektor(double[] wektor) // konstrkutkor obiektu Macierz
    {
        this.wektor = wektor;
    }

    static Wektor wektor(double[] wektorparametr) // deklaracja metody macierz(), która zwraca tablicę tablic w typie danych double
    {
        Wektor wektor = new Wektor(wektorparametr);
        return wektor; // zwraca parametry macierzy w obiekcie Macierz
    }


    public static void main(String[] args)
    {
        Wektor macierz1 = new Wektor(new double[]{23,34.2,23.2});

        //System.out.println(macierz(new double[]{3,4.8,3.3432}, new double[]{2,4.23,-2321.32,0.43})); // wyrzuca wyjątek

        System.out.println(macierz1);
        //System.out.println(macierz2); // wyrzuca wyjątek
    }
}