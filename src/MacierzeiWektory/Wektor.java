package MacierzeiWektory;

import java.util.Arrays;

/**
 * Klasa służąca do utworzenia obiektów typu Wektor
 * @author Paweł Hulanicki
 */
public class Wektor
{
    public double[] wektor;

    /**
     * Metoda służąca odczytaniu wartości utworzonego obiektu Wektor
     * @return tablica typu double z wartościami Wektora
     */
    public double[] getWektor()
    {
        return wektor;
    }

    /**
     * Ustawia wartości istniejącego Wektora
     * @param wektor tablica double[]
     */
    public void setWektor(double... wektor)
    {
        this.wektor = wektor;
    }

    /**
     * Konstruktor klasy Wektor
     * @param wektor tablica double
     */
    public Wektor(double... wektor)
    {
        this.wektor = wektor;
    }

    /**
     * Metoda pozwalająca na odczytanie wartości wektora przy jego tworzeniu
     * @param wektorparametr tablica typu double
     * @return obiekt Wektor z wprowadzoną tablicą jako parametr
     */
    public static Wektor wektor(double... wektorparametr)
    {
        Wektor wektor = new Wektor(wektorparametr);
        return wektor;
    }

    //metoda toString dla klasy Wektor
    @Override
    public String toString() {
        return Arrays.toString(wektor);
    }

    /* Kod testowy
    public static void main(String[] args)
    {
        //utworzenie wektora
        Wektor wektor1 = new Wektor(2,3,4,5,6);
        //sprawdzenie dzialania metod funkcji wektor
        System.out.println(Arrays.toString(wektor1.wektor));
        System.out.println(wektor1.toString());
        System.out.println(Arrays.toString(wektor1.getWektor()));
        System.out.println(wektor1);

        Wektor wektor2 = wektor(3,2,43,2313);
        System.out.println(wektor2);
    }

     */
}