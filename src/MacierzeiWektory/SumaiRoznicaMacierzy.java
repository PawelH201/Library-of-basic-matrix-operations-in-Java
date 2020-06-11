package MacierzeiWektory;

/**Klasa służąca dodawaniu/odejomwaniu do siebie macierzy
 * @author Jowita Walczuk
 */
public class SumaiRoznicaMacierzy extends Macierz {
    /**
     * Metoda służąca do dodawania do siebie macierzy z zaokrągleniem do 9 miejsc po przecinku
     * @param macierz macierz 1., która jest w postaci obiektu Macierz
     * @param macierz2 macierz 2., która jest w postaci obiektu Macierz
     * @return zwracany jest obiekt Macierz będąca sumą macierzy podanych jako parametry
     * @throws IllegalArgumentException wyjątek zwracany w przypadku, gdy wymiary macierzy nie są poprawne
     * @see Macierz#getMacierz()
     * @see Macierz#macierz(double[]...)
     */
    public static Macierz sumaMacierzy(Macierz macierz, Macierz macierz2) { //metoda służąca dodawaniu macierzy

        double[][] tablica1 = macierz.getMacierz();
        double[][] tablica2 = macierz2.getMacierz();
        double[][] wynik = new double[tablica2.length][tablica2[0].length];

        if (tablica1.length == tablica2.length && tablica2[0].length == tablica1[0].length) { //czy macierze mają takie same wymiary? -> czy operacja dodawania jest możliwa?
            for (int i = 0; i < tablica1.length; i++) {                                        //iterowanie po wierszach i kolumnach macierzy
                for (int j = 0; j < tablica1[0].length; j++) {
                        wynik[i][j]=(tablica2[i][j] + tablica1[i][j]);
                    }
                }
            }
        else {
            throw new IllegalArgumentException("Operacja dodawania nie jest możliwa dla macierzy o różnych wymiarach! ");
        }
        //pętla służąca do zaokrąglenia wyników w macierzy odwrotnej
        for (int n = 0; n < wynik.length; n++)
        {
            for (int m = 0; m < wynik.length; m++)
            {
                double wartosc = wynik[n][m];
                //zaokrąglenie do 9 miejsc po przecinku (ilość zer)
                wynik[n][m]=Math.round(wartosc*1000000000.0)/1000000000.0;
            }
        }
        Macierz Wynik = macierz(wynik);
        return Wynik;
    }
    /**
     * Metoda służąca do dodawania do siebie macierzy z zaokrągleniem do 9 miejsc po przecinku
     * @param macierz macierz 1., która jest w postaci obiektu Macierz
     * @param macierz2 macierz 2., która jest w postaci obiektu Macierz
     * @return zwracany jest obiekt Macierz będąca różnicą macierzy podanych jako parametry
     * @throws IllegalArgumentException wyjątek zwracany w przypadku, gdy wymiary macierzy nie są poprawne
     * @see Macierz#getMacierz()
     * @see Macierz#macierz(double[]...)
     */
    public static Macierz roznicaMacierzy(Macierz macierz, Macierz macierz2) { //metoda służąca odejmowaniu macierzy
        double[][] tablica1=macierz.getMacierz();
        double[][] tablica2=macierz2.getMacierz();
        double[][] wynik=new double[tablica1.length][tablica2[0].length];
        if (tablica1.length == tablica2.length && tablica2[0].length == tablica1[0].length) {//czy macierze mają takie same wymiary? -> czy operacja odejmowania jest możliwa
            for (int i = 0; i < tablica2.length; i++) {                                      //iterowanie po wierszach i kolumnach macierzy
                for (int j = 0; j < tablica2[0].length; j++) {
                    wynik[i][j] = (tablica1[i][j] - tablica2[i][j]);
                }
            }
        }
        else {
            throw new IllegalArgumentException("Operacja odejmowania nie jest możliwa dla macierzy o różnych wymiarach!!! ");
        }
        //pętla służąca do zaokrąglenia wyników w macierzy odwrotnej
        for (int n = 0; n < wynik.length; n++)
        {
            for (int m = 0; m < wynik.length; m++)
            {
                double wartosc = wynik[n][m];
                //zaokrąglenie do 9 miejsc po przecinku (ilość zer)
                wynik[n][m]=Math.round(wartosc*1000000000.0)/1000000000.0;
            }
        }
        Macierz roznica = new Macierz(wynik);
        return roznica;
    }

    /*Kod testowy
    public static void main(String[] args) {
        Macierz macierz1 = new Macierz(new double[]{1,10.2,100}, new double[]{2.02,20.02,200.02});
        Macierz macierz2 = new Macierz(new double[]{3,30,300}, new double[]{4,40,400});
        System.out.println(macierz1);
        System.out.println(macierz2);
        System.out.println("Suma macierzy:  " + sumaMacierzy(macierz1,macierz2));
        System.out.println("Różnica macierzy:  " + roznicaMacierzy(macierz1,macierz2));
    }
     */
}