package MacierzeiWektory;

/**Klasa służąca do wyliczenia wyznacznika macierzy
 * @author Mikołaj Pater
 */
public class Wyznacznik extends MacierzKwadratowa
{
    /**
     * Metoda służąca do wyliczenia wyznacznika dla danej macierzy z zaokrągleniem do 9 miejsc po przecinku
     * @param macierzparametr obiekt Macierz dla której jest wyliczony wyznacznik
     * @return zwraca wyznacznik w postaci double macierzy wporowadzonej jako parametr
     * @throws IllegalArgumentException pojawia się, jeżeli podana macierz nie jest kwadratowa
     * @see MacierzKwadratowa#isMacierzKwadratowa(Macierz)
     * @see Macierz#getMacierz()
     */
    public static double wyznacznikMacierzy(Macierz macierzparametr)
    {
        //warunek sprawdzający czy dana macierz jest kwadratowa
        if (isMacierzKwadratowa(macierzparametr))
        {
            //deklaracja kopii macierzy na podstawie parametru
            double[][] macierzkopia = macierzparametr.getMacierz();
            //deklaracja rozmiaru parametru (macierzy)
            int rozmiar = macierzparametr.getMacierz().length;
            //deklaracja pustej tablicy dwuwymiarowej o rozmiarze parametru
            double[][] macierz2 = new double[rozmiar][rozmiar];
            //deklaracja wyznacznika w wartości double
            double wyznacznik;
            //deklaracja wartości znaku do obliczeń
            double znak=1;

            //deklaracja pustej tablicy dwuwymiarowej o rozmiarze parametru
            double[][] macierz = new double[rozmiar][rozmiar];
            //tworzenie drugiej kopii wejściowej macierzy
            for (int n = 0; n < rozmiar; n++)
            {
                for (int m = 0; m < rozmiar; m++)
                {
                    macierz[n][m] = macierzkopia[n][m];
                }
            }

            //warunek wykonujący odpowiednie działanie dla macierzy o rozmiarze 1 i zwracający jego wynik
            if (rozmiar==1)
            {
                wyznacznik=macierz[0][0];
                return wyznacznik;
            }
            //warunek wykonujący odpowiednie działanie dla macierzy o rozmiarze 2 i zwracający jego wynik
            else if (rozmiar==2)
            {
                wyznacznik=macierz[0][0]*macierz[1][1]-macierz[0][1]*macierz[1][0];
                return wyznacznik;
            }
            //warunek wykonujący odpowiednie działania dla pozostałych rozmiarów macierzy
            else
            {
                //pętla, która wykonuje tyle iteracji ile wynosi rozmiar parametru
                for (int i=0; i < rozmiar; i++)
                {

                    //deklaracja pozycji wiersza, od którego będą wykonywane obliczenia w celu wyliczenia wyznacznika (domyślnie jest dla wartości po przekątnej)
                    int pozycja = i;
                    //deklaracja numeru wiersza do pomocy w obliczeniach
                    int row;
                    //pętla sprawdzająca dla jakiej pozycji w danej kolumnie nie ma wartości 0
                    for (int n=0; n < rozmiar; n++)
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
                        //warunek dodatkowy, który zwraca wyznacznik równy 0, jeżeli w danej kolumnie wszystkie wartości są 0 (czyli w zależności od wartości i, czy pozostałe wartości są zerowe)
                        else if (macierz[row][i]==0 && row==rozmiar-1)
                        {
                            wyznacznik=0;
                            return wyznacznik;
                        }
                    }
                    //warunek zamieniający wiersze jeżeli pozycja nie odpowiada wierszowi na przekątnej
                    if (pozycja!=i)
                    {
                        //tworzenie tymczasowej tablicy jednowymiarowej przechowująca dane dla wiersza z odpowiedniej iteracji, a następnie zamienia odpowiednie wiersze przy jej pomocy
                        double[] tmp = macierz[i];
                        macierz[i] = macierz[pozycja];
                        macierz[pozycja] = tmp;
                        //zamiana znaku dla ostatecznego wyniku
                        znak*=-1;
                    }

                    //pętla tworząca kopie macierzy
                    for (int n = 0; n < rozmiar; n++)
                    {
                        for (int m = 0; m < rozmiar; m++)
                        {
                            macierz2[n][m] = macierz[n][m];
                        }
                    }

                    //pętla dzieląca każdy element w danym wierszu przez wartość na przekątnej
                    for (int x=i; x<rozmiar; x++)
                    {
                        macierz[i][x]/=macierz2[i][i];
                    }
                    //pętla wykonjąca odpowiednie obliczenia
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
                    //pętla przywracająca pierwotną wartość w danym wierszu dla każdego elementu w nim
                    for (int x=i; x<rozmiar; x++)
                    {
                        macierz[i][x]*=macierz2[i][i];
                    }
                }
                //deklaracja zmiennej z wynikiem
                double results = 1;
                //pętla wyliczająca wyznacznik
                for (int i=0; i<rozmiar; i++)
                {
                    results*=macierz[i][i];
                }
                //zaokrąglenie do 9 miejsc po przecinku (ilość zer)
                wyznacznik=Math.round((results*znak) * 1000000000.0)/1000000000.0;
                //zwracanie wartości wyznacznika
                return wyznacznik;
            }
        }
        else
        {
            //wyrzucanie wyjątku jeżeli macierz nie jest kwadratowa
            throw new IllegalArgumentException("Podana macierz nie jest macierzą kwadratową");
        }
    }


    /*Kod testowy
    public static void main(String args[])
    {
        Macierz macierz1 = macierz(new double[]{2,4,2}, new double[]{93,4,3}, new double[]{3,5,8});
        Macierz macierz2 = macierz(new double[]{3,2,4,5}, new double[]{4,3,2,1}, new double[]{67,7,5,4}, new double[]{12,9,6,3});
        Macierz macierz3 = macierz(new double[]{0,2,3,4,5}, new double[]{0,4,6,4,1}, new double[]{0,76,5,3,0}, new double[]{32,7,5,8,11}, new double[]{0,91,332,7,5});
        Macierz macierz4 = macierz(new double[]{0,4,2,3}, new double[]{0,4,3,3}, new double[]{3,5,8,43}, new double[]{32,1,1,4});

        System.out.println(wyznacznikMacierzy(macierz1));
        System.out.println(wyznacznikMacierzy(macierz2));
        System.out.println(wyznacznikMacierzy(macierz3));
        System.out.println(wyznacznikMacierzy(macierz4));
    }

     */
}