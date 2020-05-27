package MacierzeiWektory;

public class MacierzTransponowana extends Macierz // deklaracja klasy Macierztransponowana, która dziedziczy po klasie Macierz
{
    static Macierz macierzTransponowana(Macierz macierzparametr) // deklaracja metody macierzTransponowana (parametr obiekt Macierz)
    {
        double[][] macierztymczasowa = new double[macierzparametr.getMacierz()[0].length][macierzparametr.getMacierz().length]; // deklaracja tymczasowej tablicy dwuwymiarowej o rozmiarach macierzy transponowanej
        for (int i = 0; i < macierzparametr.getMacierz().length; i++) // pętla która sprawdza ilość wierszy w obiekcie Macierz
        {
            for (int n = 0; n < macierzparametr.getMacierz()[i].length; n++) // pętla która sprawdza ilość kolumn w obiekcie Macierz
            {
                macierztymczasowa[n][i] = macierzparametr.getMacierz()[i][n]; // zamiana macierzy na macierz transponowaną
            }
        }
        Macierz macierzTransponowana = new Macierz(macierztymczasowa);
        return macierzTransponowana; // zwraca macierz transponowaną jako obiekt Macierz
    }

    /*
    public static void main(String[] args) // funkcja testowa
    {
        Macierz macierz = macierz(new double[]{123,3,2}, new double[]{9,3,222});
        //Macierz macierz1 = macierz(new double[]{123,3,2,3}, new double[]{9,3,222}); // wyrzuca wyjątki

        System.out.println(macierz);

        System.out.println(macierzTransponowana(macierz));

        //System.out.println(macierz1);

        //System.out.println(macierzTransponowana(macierz1));
    }

     */
}