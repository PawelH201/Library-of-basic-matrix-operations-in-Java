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
     */
    public static double[] ukladRownan(Macierz macierz) {

        int wierszeMacierz = macierz.getMacierz().length;
        int kolumnyMacierz = macierz.getMacierz()[0].length;

        double[][] wartoscimacierzy = macierz.getMacierz();
        double[] wyrazywolne = new double[wierszeMacierz];
        double[][] macierzpodstawowa = new double[wierszeMacierz][wierszeMacierz];
        double[] wynik = new double[wierszeMacierz];
        double[][] macierzZDopelnieniem = new double[wierszeMacierz][wierszeMacierz];

        if(kolumnyMacierz - wierszeMacierz == 1) {
            for(int i = 0; i < wierszeMacierz; i++){
                wyrazywolne[i] = wartoscimacierzy[i][kolumnyMacierz - 1];
                for(int j = 0; j<kolumnyMacierz-1;j++){
                    macierzpodstawowa[i][j] = wartoscimacierzy[i][j];
                }
            }
            Macierz MacierzPodstawowa = new Macierz(macierzpodstawowa);
            for(int niewiadoma = 0; niewiadoma < wierszeMacierz; niewiadoma++){
                for (int wiersze = 0; wiersze < wierszeMacierz; wiersze++){
                    for(int kolumny = 0; kolumny < kolumnyMacierz-1; kolumny++)
                        macierzZDopelnieniem[wiersze][kolumny] = macierzpodstawowa[wiersze][kolumny];
                }
                for(int a = 0; a < wierszeMacierz; a++){
                    macierzZDopelnieniem[a][niewiadoma] = wyrazywolne[a];
                }
                Macierz MacierzZDopelnieniem = new Macierz(macierzZDopelnieniem);
                if (wyznacznikMacierzy(MacierzPodstawowa) == 0)
                {
                    throw new ArithmeticException("Podana macierz podstawowa ma wyznacznik zerowy, nie można określić oznaczonego rozwiązania tego układu równań");
                }
                wynik[niewiadoma] = wyznacznikMacierzy(MacierzZDopelnieniem) / wyznacznikMacierzy(MacierzPodstawowa);
            }
            for (int i = 0; i < wynik.length; i++)
            {
                double tmp = wynik[i];
                wynik[i] = Math.round((tmp) * 1000000000.0)/1000000000.0; //zaokrąglenie do 6 miejsc po przecinku (ilość zer)
            }
            return wynik;
        }
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