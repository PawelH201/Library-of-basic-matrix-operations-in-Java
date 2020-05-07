import java.util.ArrayList;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


public class Wektor
{
    public double[] wektor; //deklaracja prywatnej tablicy jednowymiarowej wektor

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
    }

    static Wektor wektor(double... wektorparametr) // deklaracja metody Wektor(), która zwraca tablicę w typie danych double
    {
        Wektor wektor = new Wektor(wektorparametr);
        return wektor; // zwraca parametry w obiekcie Wektor
    }

    @Override
    public String toString() {
        return "Wektor{" +
                "wektor=" + Arrays.toString(wektor) +
                '}';
    }

    public static void main(String[] args)
    {
       // Wektor wektor1 = new Wektor(2,3,4,5,6);
      //  System.out.println(wektor1.wektor);
        //System.out.println(wektor1.toString());
        //System.out.println(wektor1.getWektor());


        //System.out.println(wektor1);
    }
}