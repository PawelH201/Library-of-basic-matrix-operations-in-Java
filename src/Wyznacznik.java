import java.lang.IllegalArgumentException;

public class Wyznacznik extends Macierzkwadratowa
{
    static double wyznacznikMacierzy(Macierz macierzparametr)
    {
        if (isMacierzwKwadratowa(macierzparametr))
        {
            double[][] macierz = macierzparametr.getMacierz();
            double[][] macierz2 = macierzparametr.getMacierz();
            double[][] macierztymczasowa = new double[macierzparametr.getMacierz()[0].length][macierzparametr.getMacierz().length];
            double wyznacznik = 0;
            int rozmiar = macierzparametr.getMacierz().length;
            int row = 0;
            int pozycja = 0;

            if (rozmiar==1)
            {
                wyznacznik=macierz[0][0];
            }
            else if (rozmiar==2)
            {
                wyznacznik=macierz[0][0]*macierz[1][1]-macierz[0][1]*macierz[1][0];
            }
            else
            {
                for (int i=0; i<rozmiar; i++)
                {
                    for (int n=0; n<rozmiar; n++)
                    {
                        row = i + n;
                        if (macierz[i][row]!=0)
                        {
                            pozycja = row;
                            break;
                        }
                        else if (macierz[i][n]==0)
                        {
                            if (n==rozmiar-1)
                            {
                                wyznacznik=0;
                                return wyznacznik;
                            }
                            else
                            {
                                continue;
                            }
                        }
                        else if (macierz[i][n]!=0)
                        {
                            pozycja = n;
                            break;
                        }
                    }
                    if (pozycja!=i)
                    {
                        macierz[i]=macierzparametr.getMacierz()[pozycja];
                        macierz[pozycja]=macierzparametr.getMacierz()[i];
                    }
                    macierztymczasowa[i] = macierz[i];
                    macierz2 = macierz;
                    for (int x=pozycja; x<rozmiar; x++)
                    {
                        macierz[pozycja][x]=macierz2[pozycja][x]/macierz[pozycja][i];
                        if (pozycja!=rozmiar-1)
                        {
                            for (int y=i; y<rozmiar-1; y++)
                            {
                                macierz[x+1][y]=macierz[x+1][y]-macierz[x+1][y]*macierz[pozycja][i];
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            }
            return wyznacznik;
        }
        else
        {
            throw new IllegalArgumentException("Podana macierz nie jest macierzą kwadratową");
        }
    }
}
