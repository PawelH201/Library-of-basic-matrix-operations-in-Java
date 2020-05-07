//na razie w trakcie budowy tego projektu będziemy dodawać proste komentarze, dokumentacja zostanie dopisana potem, kiedy będziemy mieć lepiej przygotowane kody źródłowe
import java.util.Arrays;
import java.lang.IllegalArgumentException;


public class Macierz
{
    private double[][] macierz; //deklaracja prywatnej tablicy dwuwymiarowej macierz

    public double[][] getMacierz() // zwraca dwuwymiarową tablicę macierz
    {
        return macierz;
    }

    public void setMacierz(double[][] macierz) // ustawia wartość tablicy dwuwymiarowej macierz
    {
        this.macierz = macierz;
    }

    public Macierz(double[]... macierz) // konstrkutkor obiektu Macierz
    {
        this.macierz = macierz;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (double[] n : macierz)
        {
            result.append(Arrays.toString(n));
        }
        return result.toString();
    }

    static Macierz macierz(double[]... macierzparametr) // deklaracja metody macierz(), która zwraca tablicę tablic w typie danych double
    {
        for (int i = 0; i < macierzparametr.length; i++) // pętla, która sprawdza każdą wpisaną tablicę
        {
            if (macierzparametr[i].length != macierzparametr[0].length) // warunek, który sprawdza czy rozmiar tablicy zgadza się z rozmiarem pierwszej tablicy (sprawdza czy wszystkie wiersze mają taką samą długość)
            {
                throw new IllegalArgumentException("Podano złe parametry macierzy"); // wyrzuca wyjątek dla złych parametrów macierzy
            }
        }
        Macierz macierz = new Macierz(macierzparametr);
        return macierz; // zwraca parametry macierzy w obiekcie Macierz
    }


    public static void main(String[] args)
    {
        Macierz macierz1 = new Macierz(new double[]{23,34.2,23.2}, new double[]{2,3,4});
        Macierz macierz2 = new Macierz(new double[]{23,34.2,23.2}, new double[]{2,34});

        //System.out.println(macierz(new double[]{3,4.8,3.3432}, new double[]{2,4.23,-2321.32,0.43})); // wyrzuca wyjątek
        System.out.println(macierz(new double[]{3,4.8,3.3432}, new double[]{2,4.23,-2321.32}));

        System.out.println(macierz1);
        //System.out.println(macierz2); // wyrzuca wyjątek
    }
}