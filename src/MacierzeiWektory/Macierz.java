package MacierzeiWektory;

import java.util.Arrays;
/**
 * Klasa służąca do tworzenia obiektu Macierz.
 * @author Mikołaj Pater
 */
public class Macierz
{
    //deklaracja prywatnej tablicy dwuwymiarowej macierz
    private double[][] macierz;

    /**
     * Metoda służąca do zwrócenia z obiektu tablicy dwuwymiarowej z jej wartościami
     * @return tablica dwuwywamiarowa z wartościami macierzy
     */
    public double[][] getMacierz()
    {
        return macierz;
    }

    /**
     * Metoda służąca do przypisania wartości w postaci tablicy dwuwymiarowej dla macierzy
     * @param macierz tablica dwuwymiarowa z wartościami macierzy
     */
    public void setMacierz(double[][] macierz)
    {
        this.macierz = macierz;
    }

    /**
     * Konstruktor obiektu Macierz
     * @param macierz lista tablic z wartościami dla Macierzy (tablica dwuwymiarowa)
     * @throws IllegalArgumentException pojawia się w przypadku podania nierównych tablic jako parametry
     */
    public Macierz(double[]... macierz)
    {
        // pętla, która sprawdza każdą wpisaną tablicę
        for (int i = 0; i < macierz.length; i++)
        {
            // warunek, który sprawdza czy rozmiar tablicy zgadza się z rozmiarem pierwszej tablicy (sprawdza czy wszystkie wiersze mają taką samą długość)
            if (macierz[i].length != macierz[0].length)
            {
                // wyrzuca wyjątek dla złych parametrów macierzy
                throw new IllegalArgumentException("Podano złe parametry macierzy");
            }
        }
        this.macierz = macierz;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (double[] n : macierz) {
            result.append(Arrays.toString(n));
        }
        return result.toString();
    }

    /**
     * Metoda służąca do tworzenia obiektu Macierz za pomocą listy tablic oraz sprawdzenia czy są tej samej wielkości
     * @param macierzparametr lista tablic, z której będzie tworzony obiekt Macierz (tablica dwuwymiarowa)
     * @return zwraca parametry w obiekcie Macierz
     * @throws IllegalArgumentException pojawia się w przypadku wprowadzenia nierównych tablic jako parametry
     * @see Macierz#Macierz(double[]...)
     */
    public static Macierz macierz(double[]... macierzparametr)
    {
        // pętla, która sprawdza każdą wpisaną tablicę
        for (int i = 0; i < macierzparametr.length; i++)
        {
            // warunek, który sprawdza czy rozmiar tablicy zgadza się z rozmiarem pierwszej tablicy (sprawdza czy wszystkie wiersze mają taką samą długość)
            if (macierzparametr[i].length != macierzparametr[0].length)
            {
                // wyrzuca wyjątek dla złych parametrów macierzy
                throw new IllegalArgumentException("Podano złe parametry macierzy");
            }
        }
        Macierz macierz = new Macierz(macierzparametr);
        return macierz;
    }

    /* Kod testowy
    public static void main(String[] args)
    {
        Macierz macierz1 = new Macierz(new double[]{23,34.2,23.2}, new double[]{2,3,4});
        Macierz macierz2 = new Macierz(new double[]{23,34.2,23.2}, new double[]{2,34});

        //System.out.println(macierz(new double[]{3,4.8,3.3432}, new double[]{2,4.23,-2321.32,0.43})); // wyrzuca wyjątek
        System.out.println(macierz(new double[]{3,4.8,3.3432}, new double[]{2,4.23,-2321.32}));
        System.out.println(macierz1);
        //System.out.println(macierz2); // wyrzuca wyjątek

    }

     */
}