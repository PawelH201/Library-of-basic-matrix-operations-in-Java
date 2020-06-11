package MacierzeiWektory;

/**Klasa służąca do wyznacznienia macierzy odwrotnej
 * @author Mikołaj Pater
 */
public class MacierzOdwrotna extends Wyznacznik
{
    /**
     * Metoda służąca do tworzenia obiektu Macierz, który jest macierzą odwrotną dla podanej macierzy, z zaokrągleniem do 9 miejsc po przecinku
     * @param macierzparametr obiekt Macierz dla którego wyznaczymy macierz odwrotną
     * @return zwraca obiekt Macierz, który jest macierzą odwrotną parametru metody
     * @throws IllegalArgumentException pojawia się, jeżeli nie da się obliczyć macierzy odwrotnej
     * @see Macierz#macierz(double[]...)
     * @see Macierz#getMacierz()
     * @see Wyznacznik#wyznacznikMacierzy(Macierz)
     */
    public static Macierz macierzOdwrotna(Macierz macierzparametr)
    {
        //warunek sprawdzający czy można wyliczyć macierz odwrotną dla danej macierzy (sprawdza czy jego wyznacznik jest zerowy)
        if (wyznacznikMacierzy(macierzparametr)==0)
        {
            throw new IllegalArgumentException("Z podanej macierzy nie można wyznaczyć macierzy odwrotnej!");
        }
        else
        {
            //deklaracja kopii macierzy na podstawie parametru
            double[][] macierzkopia = macierzparametr.getMacierz();
            //deklaracja rozmiaru parametru (macierzy)
            int rozmiar = macierzparametr.getMacierz().length;

            //deklaracja pustej tablicy dwuwymiarowej o rozmiarze parametru oraz skopiowanie do niej macierzy wejściowej
            double[][] macierz = new double[rozmiar][rozmiar];
            for (int n = 0; n < rozmiar; n++)
            {
                for (int m = 0; m < rozmiar; m++)
                {
                    macierz[n][m] = macierzkopia[n][m];
                }
            }

            //deklaracja macierzy jednostkowej
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

            //deklaracja pustej tablicy dwuwymiarowej o rozmiarze macierzy wejściowej
            double[][] macierz2 = new double[rozmiar][rozmiar];

            //pętla, która wykonuje tyle iteracji ile wynosi rozmiar parametru
            for (int i = 0; i < rozmiar; i++)
            {
                //deklaracja pozycji wiersza, od którego będą wykonywane obliczenia w celu wyliczenia macierzy odwrotnej (domyślnie jest dla wartości po przekątnej)
                int pozycja = i;
                //deklaracja numeru wiersza do pomocy w obliczeniach
                int row;
                //pętla sprawdzająca dla jakiej pozycji w danej kolumnie nie ma wartości 0
                for (int n=0; n<rozmiar; n++)
                {
                    //przypisanie odpowiedniej wartości dla numeru wiersza w zależności od iteracji
                    row = i + n;
                    //warunek zabezpieczający przed wyjściem poza rozmiar tablicy
                    if (row>=rozmiar)
                    {
                        break;
                    }
                    //warunek szukający pozycji w danej kolumnie dla którego można wykonywać obliczenia (jest niezerowy)
                    if (macierz[row][i]!=0)
                    {
                        pozycja = row;
                        break;
                    }
                    //warunek dodatkowy, który zwraca wyjątek, jeżeli w danej kolumnie wszystkie wartości są 0 (czyli w zależności od wartości i, czy pozostałe wartości są zerowe)
                    else if (macierz[row][i]==0 && row==rozmiar-1)
                    {
                        throw new IllegalArgumentException("Z podanej macierzy nie można wyznaczyć macierzy odwrotnej!");
                    }
                }
                //warunek zamieniający wiersze jeżeli pozycja nie odpowiada wierszowi na przekątnej
                if (pozycja!=i)
                {
                    //tworzenie tymczasowej tablicy jednowymiarowej przechowująca dane dla wiersza z macierzy podstawowej z odpowiedniej iteracji, a następnie zamienia odpowiednie wiersze przy jej pomocy
                    double[] tmp1 = macierz[i];
                    macierz[i] = macierz[pozycja];
                    macierz[pozycja] = tmp1;

                    //tworzenie tymczasowej tablicy jednowymiarowej przechowująca dane dla wiersza z macierzy jednostkowej z odpowiedniej iteracji, a następnie zamienia odpowiednie wiersze przy jej pomocy
                    double[] tmp2 = macierzjednostkowa[i];
                    macierzjednostkowa[i] = macierzjednostkowa[pozycja];
                    macierzjednostkowa[pozycja] = tmp2;
                }

                //pętla tworząca kopie macierzy
                for (int n = 0; n < rozmiar; n++)
                {
                    for (int m = 0; m < rozmiar; m++)
                    {
                        macierz2[n][m] = macierz[n][m];
                    }
                }

                //pętla dzieląca każdy element w danym wierszu w macierzy podstawowej przez wartość na przekątnej
                for (int x = i; x < rozmiar; x++)
                {
                    macierz[i][x] /= macierz2[i][i];
                }
                //pętla dzieląca każdy element w danym wierszu w macierzy jednostkowej przez wartość na przekątnej
                for (int x = 0; x < rozmiar; x++)
                {
                    macierzjednostkowa[i][x] /= macierz2[i][i];
                }
                //pętla wykonjąca odpowiednie obliczenia równolegle dla macierzy podstawowej i jednostkowej
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

            //pętla służąca do zaokrąglenia wyników w macierzy odwrotnej
            for (int n = 0; n < rozmiar; n++)
            {
                for (int m = 0; m < rozmiar; m++)
                {
                    double wartosc = macierzjednostkowa[n][m];
                    //zaokrąglenie do 9 miejsc po przecinku (ilość zer)
                    macierzjednostkowa[n][m]=Math.round(wartosc*1000000000.0)/1000000000.0;
                }
            }
            //przypisanie macierzy odwrotnej do obiektu Macierz i zwrócenie tego wyniku
            Macierz macierzodwrotna = macierz(macierzjednostkowa);
            return macierzodwrotna;
        }
    }

    /*Kod testowy
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