package MacierzeiWektory;

/** Klasa służąca do sprawdzenia czy macierz jest kwadratowa
 * @author Mikołaj Pater
 */
public class MacierzKwadratowa extends Macierz
{
    /**
     * Metoda służąca do sprawdzenia czy dana macierz jest kwadratowa
     * @param macierzparametr obiekt Macierz dla którego sprawdzamy czy jest w postaci macierzy kwadratowej
     * @return zwraca wartość boolean, true jeśli jest kwadratowa, false jeśli nie jest kwadratowa
     * @see Macierz#getMacierz()
     * @see Macierz#macierz(double[]...)
     */
    public static boolean isMacierzKwadratowa(Macierz macierzparametr)
    {
        //deklaracja boolean
        boolean isKwadratowa;
        //wyciągnięcie wartości macierz
        double[][] macierz = macierzparametr.getMacierz();
        //warunek sprawdzający czy podana macierz jest kwadratowa
        if (macierz[0].length==macierz.length)
        {
            //przypisanie wartości true dla boolean isKwadratowa i zwrócenie jej
            isKwadratowa = true;
            return isKwadratowa;
        }
        else
        {
            //przypisanie wartości false dla boolean isKwadratowa i zwrócenie jej
            isKwadratowa = false;
            return isKwadratowa;
        }
    }

    /* Kod testowy
    public static void main(String args[])
    {
        Macierz macierz1 = macierz(new double[]{2,4,2}, new double[]{93,4,2}, new double[]{3,5,8});
        Macierz macierz2 = macierz(new double[]{2,4,2}, new double[]{93,4,2});

        System.out.println(isMacierzKwadratowa(macierz1));
        System.out.println(isMacierzKwadratowa(macierz2));
    }

     */
}
