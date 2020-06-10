package MacierzeiWektory;

public class MacierzOdwrotna extends Wyznacznik
{
    public static Macierz macierzOdwrotna(Macierz macierzparametr)
    {
        if (wyznacznikMacierzy(macierzparametr)==0)
        {
            throw new IllegalArgumentException("Z podanej macierzy nie można wyznaczyć macierzy odwrotnej!");
        }
        else
        {
            double[][] macierzkopia = macierzparametr.getMacierz();
            int rozmiar = macierzparametr.getMacierz().length;

            double[][] macierz = new double[rozmiar][rozmiar];
            for (int n = 0; n < rozmiar; n++)
            {
                for (int m = 0; m < rozmiar; m++)
                {
                    macierz[n][m] = macierzkopia[n][m];
                }
            }

            double[][] macierzjednostkowa = new double[rozmiar][rozmiar];
            for (int n = 0; n < rozmiar; n++)
            {
                for (int m = 0; m < rozmiar; m++)
                {
                    if (m==n)
                    {
                        macierzjednostkowa[n][m]=1;
                    }
                    else
                    {
                        macierzjednostkowa[n][m]=0;
                    }
                }
            }

            double[][] macierz2 = new double[rozmiar][rozmiar];

            for (int i = 0; i < rozmiar; i++)
            {
                int pozycja = i;
                int row;
                for (int n=0; n<rozmiar; n++)
                {
                    row = i + n;
                    if (row>=rozmiar)
                    {
                        break;
                    }
                    if (macierz[row][i]!=0)
                    {
                        pozycja = row;
                        break;
                    }
                    else if (macierz[row][i]==0)
                    {
                        if (row==rozmiar-1)
                        {
                            throw new IllegalArgumentException("Z podanej macierzy nie można wyznaczyć macierzy odwrotnej!");
                        }
                    }
                }
                if (pozycja!=i)
                {
                    double[] tmp1 = macierz[i];
                    macierz[i] = macierz[pozycja];
                    macierz[pozycja] = tmp1;

                    double[] tmp2 = macierzjednostkowa[i];
                    macierzjednostkowa[i] = macierzjednostkowa[pozycja];
                    macierzjednostkowa[pozycja] = tmp2;
                }


                for (int n = 0; n < rozmiar; n++)
                {
                    for (int m = 0; m < rozmiar; m++)
                    {
                        macierz2[n][m] = macierz[n][m];
                    }
                }

                for (int x = i; x < rozmiar; x++)
                {
                    macierz[i][x] /= macierz2[i][i];
                }
                for (int x = 0; x < rozmiar; x++)
                {
                    macierzjednostkowa[i][x] /= macierz2[i][i];
                }
                for (int x=0; x<rozmiar; x++)
                {
                    if (x!=i)
                    {
                        for (int y = i; y < rozmiar; y++)
                        {
                            macierz[x][y]-=(macierz2[x][i]*macierz[i][y]);
                        }
                        for (int y = 0; y < rozmiar; y++)
                        {
                            macierzjednostkowa[x][y]-=(macierz2[x][i]*macierzjednostkowa[i][y]);
                        }
                    }
                }
            }

            for (int n = 0; n < rozmiar; n++)
            {
                for (int m = 0; m < rozmiar; m++)
                {
                    double wartosc = macierzjednostkowa[n][m];
                    macierzjednostkowa[n][m]=Math.round(wartosc*1000000.0)/1000000.0;
                }
            }

            Macierz macierzodwrotna = macierz(macierzjednostkowa);
            return macierzodwrotna;
        }
    }

    /*
    public static void main(String args[])
    {
        Macierz macierz1 = macierz(new double[]{2,4,2}, new double[]{93,4,3}, new double[]{3,5,8});
        //Macierz macierz2 = macierz(new double[]{3,2,4,5}, new double[]{4,3,2,1}, new double[]{67,7,5,4}, new double[]{12,9,6,3});
        Macierz macierz3 = macierz(new double[]{0,2,3,4,5}, new double[]{0,4,6,4,1}, new double[]{0,76,5,3,0}, new double[]{32,7,5,8,11}, new double[]{0,91,332,7,5});
        Macierz macierz4 = macierz(new double[]{0,4,2}, new double[]{0,4,3}, new double[]{3,5,8});

        System.out.println(macierzOdwrotna(macierz1));
        //System.out.println(macierzOdwrotna(macierz2));
        System.out.println(macierzOdwrotna(macierz3));
        System.out.println(macierzOdwrotna(macierz4));
    }

     */
}