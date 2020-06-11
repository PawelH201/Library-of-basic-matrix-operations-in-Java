package MacierzeiWektory;

import java.util.Arrays;

/**Klasa służąca do konstruowania obiektów typu Wektor
 * @author Paweł Hulanicki
 */

public class Wektor
{
    //deklaracja tablicy zmiennych typu double o nazwie wektor (nazwa klasy to Wektor - wielka litera)
    public double[] wektor;

    /**
     * Metoda zwracająca wartości z obiektu "Wektor"
     * @return wartość wektora w postaci tablicy jednowymiarowej typu double[]
     */
    public double[] getWektor()
    {
        return wektor;
    }

    /**
     *Metoda ustawiająca wartość wektora na podaną tablicę jednoowymiarową
     * @param wektor tablica typu double
     */
    public void setWektor(double... wektor)
    {
        this.wektor = wektor;
    }

    /**
     * Konstruktor klasy Wektor
     * @param wektor tablica typu double
     */
    public Wektor(double... wektor)
    {
        this.wektor = wektor;
    }

    /**
     * Metoda służąca odczytaniu wartości wektora
     * @param wektorparametr tablica typu double
     * @return wartość wektora w postaci tablicy jednowymiorowej
     * @see Wektor#wektor(double...)
     */
    public static Wektor wektor(double... wektorparametr)
    {
        Wektor wektor = new Wektor(wektorparametr);
        return wektor;
    }

    @Override
    public String toString() {
        return Arrays.toString(wektor);
    }

    /*
    //czesc testowa
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