import java.lang.IllegalArgumentException;

public class Wyznacznik extends MacierzKwadratowa
{
    static double wyznacznikMacierzy(Macierz macierzparametr)
    {
        if (isMacierzKwadratowa(macierzparametr))
        {
            double[][] macierzkopia = macierzparametr.getMacierz();

            double[][] macierz2;
            double wyznacznik;
            int rozmiar = macierzparametr.getMacierz().length;
            double[][] macierz = new double[rozmiar][rozmiar];
            double znak=1;
            for (int n = 0; n < rozmiar; n++)
            {
                for (int m = 0; m < rozmiar; m++)
                {
                    macierz[n][m] = macierzkopia[n][m];
                }
            }

            if (rozmiar==1)
            {
                wyznacznik=macierz[0][0];
                return wyznacznik;
            }
            else if (rozmiar==2)
            {
                wyznacznik=macierz[0][0]*macierz[1][1]-macierz[0][1]*macierz[1][0];
                return wyznacznik;
            }
            else
            {
                for (int i=0; i<rozmiar; i++)
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
                                wyznacznik=0;
                                return wyznacznik;
                            }
                        }
                    }
                    if (pozycja!=i)
                    {
                        double[] tmp = macierz[i];
                        macierz[i] = macierz[pozycja];
                        macierz[pozycja] = tmp;
                        znak*=-1;
                    }

                    macierz2 = new double[rozmiar][rozmiar];
                    for (int n = 0; n < rozmiar; n++)
                    {
                        for (int m = 0; m < rozmiar; m++)
                        {
                            macierz2[n][m] = macierz[n][m];
                        }
                    }

                    for (int x=i; x<rozmiar; x++)
                    {
                        macierz[i][x]/=macierz2[i][i];
                    }
                    for (int x=i; x<rozmiar; x++)
                    {
                        if (x+1<rozmiar)
                        {
                            for (int y=i; y<rozmiar; y++)
                            {
                                macierz[x+1][y]-=(macierz2[x+1][i]*macierz[i][y]);
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                    for (int x=i; x<rozmiar; x++)
                    {
                        macierz[i][x]*=macierz2[i][i];
                    }
                }
                double results = 1;
                for (int i=0; i<rozmiar; i++)
                {
                    results*=macierz[i][i];
                }
                wyznacznik=Math.round((results*znak) * 1000000)/1000000; //zaokrąglenie do 6 miejsc po przecinku (ilość zer)
                return wyznacznik;
            }
        }
        else
        {
            throw new IllegalArgumentException("Podana macierz nie jest macierzą kwadratową");
        }
    }
    public static void main(String args[])
    {
        Macierz macierz1 = macierz(new double[]{2,4,2}, new double[]{93,4,3}, new double[]{3,5,8});
        Macierz macierz2 = macierz(new double[]{3,2,4,5}, new double[]{4,3,2,1}, new double[]{67,7,5,4}, new double[]{12,9,6,3});
        Macierz macierz3 = macierz(new double[]{0,2,3,4,5}, new double[]{0,4,6,4,1}, new double[]{0,76,5,3,0}, new double[]{32,7,5,8,11}, new double[]{0,91,332,7,5});
        Macierz macierz4 = macierz(new double[]{0,4,2}, new double[]{0,4,3}, new double[]{3,5,8});

        System.out.println(wyznacznikMacierzy(macierz1));
        System.out.println(wyznacznikMacierzy(macierz2));
        System.out.println(wyznacznikMacierzy(macierz3));
        System.out.println(wyznacznikMacierzy(macierz4));
    }
}