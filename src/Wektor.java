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

    public Wektor(double... wektor) // konstuktor obiektu Wektor
    {
        this.wektor = wektor;
        this.
    }

    static Wektor wektor(double... wektorparametr) // deklaracja metody Wektor(), która zwraca tablicę w typie danych double
    {
        Wektor wektor = new Wektor(wektorparametr);
        return wektor; // zwraca parametry w obiekcie Wektor
    }


    public static void main(String[] args)
    {
        Wektor macierz1 = new Wektor(2,3,4,5,6);
        System.out.println(macierz1.wektor[0]);


        System.out.println(macierz1);
    }
}