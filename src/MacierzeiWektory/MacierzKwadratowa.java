package MacierzeiWektory;
/** Klasa służąca do sprawdzenia czy macierz jest kwadratowa
 * @author Mikołaj Pater
 */
public class MacierzKwadratowa extends Macierz
{
    /**
     * @param macierzparametr
     * @return zwraca wartość liczbową typu boolean
     */
    public static boolean isMacierzKwadratowa(Macierz macierzparametr)
    {
        boolean isKwadratowa;
        double[][] macierz = macierzparametr.getMacierz();
        if (macierz[0].length==macierz.length)
        {
            isKwadratowa = true;
            return isKwadratowa;
        }
        else
        {
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
