//na razie w trakcie budowy tego projektu będziemy dodawać proste komentarze, dokumentacja zostanie dopisana potem, kiedy będziemy mieć lepiej przygotowane kody źródłowe
import java.io.Serializable;

public class Macierze
{
    static Serializable macierz(double[]... macierz) // deklaracja metody macierz(), która zwraca tablicę tablic w typie danych double
    {
        for (int i = 0; i < macierz.length; i++) // pętla, która sprawdza każdą wpisaną tablicę
        {
            if (macierz[i].length != macierz[0].length) // warunek, który sprawdza czy rozmiar tablicy zgadza się z rozmiarem pierwszej tablicy (sprawdza czy wszystkie wiersze mają taką samą długość)
            {
                String blad = "Podano złe wymiary macierzy";
                return blad; // zwraca wiadomość o błędzie, a następnie zatrzymuje działanie metody
            }
        }
        return macierz; // zwraca macierz (tablicę tablic)
    }

    public static void main(String[] args) //funkcja main do testów
    {
        System.out.println(macierz(new double[]{3,4.8,3.3432}, new double[]{2,4.23,-2321.32,0.43}));
        System.out.println(macierz(new double[]{3,4.8,3.3432}, new double[]{2,4.23,-2321.32}));
    }
}