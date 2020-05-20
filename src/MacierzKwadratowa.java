public class MacierzKwadratowa extends Macierz
{
    static boolean isMacierzKwadratowa(Macierz macierzparametr)
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

        System.out.println(isMacierzKwadratowa(macierz1));
        System.out.println(isMacierzKwadratowa(macierz2));
    }
}
