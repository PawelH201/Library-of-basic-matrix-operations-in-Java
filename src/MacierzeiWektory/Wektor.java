package MacierzeiWektory;
/**Klasa służąca do tworzenia jednowymiarowej tablicy typu double
 * @author Paweł Hulanicki
 */

import java.util.Arrays;

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

    /**
     * @param wektorparametr
     * @return zwraca parametry wektor w obiekcie Wektor
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

    /*Kod testowy
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