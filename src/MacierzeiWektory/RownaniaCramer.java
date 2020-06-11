package MacierzeiWektory;
/**Klasa służąca rozwiązywaniu równań liniowych za pomocą metody Cramera
 * @author Paweł Hulanicki
 */
public class RownaniaCramer extends Wyznacznik {
    /**Metoda służąca rozwiązywaniu układów liniowych z zaokrągleniem do 6 miejsc po przecinku
     * @param macierz obiekt Macierz będący macierzą dopełnioną (o wymiarach nxn+1, n - naturalne, większe od 1)
     * @return zwraca rozwiązanie układu równań wprowadzonego jako parametr
     * @throws IllegalArgumentException wyjątek zwracany w przypadku gdy układ nie ma rozwiązań, lub wymiary macierzy nie są poprawne
     * @throws ArithmeticException gdy choć jeden wyznacznik wykorzystywany przy rozwiązaniu jest równy 0
     * @see Wyznacznik#wyznacznikMacierzy(Macierz)
     * @see  Macierz#macierz(double[]...)
     * @see Macierz#getMacierz()
     */
    public static double[] ukladRownan(Macierz macierz) {
        //wymiary macierzy

        int wierszeMacierz = macierz.getMacierz().length;
        int kolumnyMacierz = macierz.getMacierz()[0].length;
        //tablice będące: wartościami macierzy, wyrazami wolnymi (ostatnia kolumna)
        double[][] wartoscimacierzy = macierz.getMacierz();
        double[] wyrazywolne = new double[wierszeMacierz];
        //macierz, do której zostaną wpisane wartości Macierzy bez wyrazów wolnych
        double[][] macierzpodstawowa = new double[wierszeMacierz][wierszeMacierz];
        //tablica, w której pojawi się wynik działania
        double[] wynik = new double[wierszeMacierz];
        //druga zmienna macierzy bez wyrazów wolnych
        double[][] macierzZDopelnieniem = new double[wierszeMacierz][wierszeMacierz];
        //sprawdzenie warunku czy macierz jest macierzą dopełnioną

        if(kolumnyMacierz - wierszeMacierz == 1) {
            //przypisanie wartości do macierzypodstawowej
            for(int i = 0; i < wierszeMacierz; i++){
                wyrazywolne[i] = wartoscimacierzy[i][kolumnyMacierz - 1];
                for(int j = 0; j<kolumnyMacierz-1;j++){
                    macierzpodstawowa[i][j] = wartoscimacierzy[i][j];
                }
            }

            Macierz MacierzPodstawowa = new Macierz(macierzpodstawowa);
            //pętla rozpatrywana dla każdej niewiadomej/wiersza macierzy
            for(int niewiadoma = 0; niewiadoma < wierszeMacierz; niewiadoma++){
                //pętla tworząca macierz z dopełnieniem, na razie w formie niezmienionej macierzy bez wyrazów wolnych
                for (int wiersze = 0; wiersze < wierszeMacierz; wiersze++){
                    for(int kolumny = 0; kolumny < kolumnyMacierz-1; kolumny++)
                        macierzZDopelnieniem[wiersze][kolumny] = macierzpodstawowa[wiersze][kolumny];
                }
                //zastąpienie odpowiedniej kolumny wyrazami wolnymi
                for(int a = 0; a < wierszeMacierz; a++){
                    macierzZDopelnieniem[a][niewiadoma] = wyrazywolne[a];
                }

                Macierz MacierzZDopelnieniem = new Macierz(macierzZDopelnieniem);
                //wyjątek jeśli wyznacznik macierzy jest równy 0
                if (wyznacznikMacierzy(MacierzPodstawowa) == 0)
                {
                    throw new ArithmeticException("Podana macierz podstawowa ma wyznacznik zerowy, nie można określić oznaczonego rozwiązania tego układu równań");
                }
                //obliczenie wartości niewiadomej
                wynik[niewiadoma] = wyznacznikMacierzy(MacierzZDopelnieniem) / wyznacznikMacierzy(MacierzPodstawowa);
            }
            //zaokrąglenie i wstawienie wyniku do tablicy
            for (int i = 0; i < wynik.length; i++)
            {
                double tmp = wynik[i];
                wynik[i] = Math.round((tmp) * 1000000000.0)/1000000000.0; //zaokrąglenie do 6 miejsc po przecinku (ilość zer)
            }
            return wynik;
        }
        //wyjątek w przypadku braku rozwiązania przy niezerowych wyznacznikach, jak np złe wymiary macierzy
        else {
            throw new IllegalArgumentException("Podana macierz nie ma jednoznacznego rozwiązania! Sprawdź wymiary macierzy");
        }
    }

    /*Kod testowy
    public static void main(String[] args){
        Macierz macierz1 = macierz(new double[]{0,2,0,88}, new double[]{0,3,1,5}, new double[]{3,0,0,3});
        System.out.println(Arrays.toString(ukladRownan(macierz1)));
    }

     */
}