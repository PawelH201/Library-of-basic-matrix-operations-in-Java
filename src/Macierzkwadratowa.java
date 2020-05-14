public class Macierzkwadratowa extends Macierz
{
    static boolean isMacierzwKwadratowa(Macierz macierzparametr)
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

    public static void main(String args[])
    {
        Macierz macierz1 = macierz(new double[]{2,4,2}, new double[]{93,4,2}, new double[]{3,5,8});
        Macierz macierz2 = macierz(new double[]{2,4,2}, new double[]{93,4,2});

        System.out.println(isMacierzwKwadratowa(macierz1));
        System.out.println(isMacierzwKwadratowa(macierz2));
    }
}
