package MacierzeiWektory;

/** Klasa służąca do wyznaczenia macierzy transponowanej
 * @author Mikołaj Pater
 */
public class MacierzTransponowana extends Macierz
{
    /**
     * Metoda służąca do tworzenia obiektu Macierz, który jest macierzą transponowaną dla podanej macierzy
     * @param macierzparametr obiekt Macierz dla którego wyznaczymy macierz transponowaną
     * @return zwraca obiekt Macierz, który jest macierzą transponowaną parametru metody
     * @see Macierz#macierz(double[]...)
     * @see Macierz#getMacierz()
     */
    public static Macierz macierzTransponowana(Macierz macierzparametr)
    {
        // deklaracja tymczasowej tablicy dwuwymiarowej o rozmiarach macierzy transponowanej
        double[][] macierztymczasowa = new double[macierzparametr.getMacierz()[0].length][macierzparametr.getMacierz().length];
        // pętla która sprawdza ilość wierszy w obiekcie Macierz
        for (int i = 0; i < macierzparametr.getMacierz().length; i++)
        {
            // pętla która sprawdza ilość kolumn w obiekcie Macierz
            for (int n = 0; n < macierzparametr.getMacierz()[i].length; n++)
            {
                // zamiana macierzy na macierz transponowaną
                macierztymczasowa[n][i] = macierzparametr.getMacierz()[i][n];
            }
        }
        Macierz macierzTransponowana = macierz(macierztymczasowa);
        // zwraca macierz transponowaną jako obiekt Macierz
        return macierzTransponowana;
    }

    /*Kod testowy
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