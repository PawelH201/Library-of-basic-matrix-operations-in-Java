package MacierzeiWektory;
/**Klasa służąca do obliczania iloczynu dwóch macierzy
 * @author Paweł Hulanicki
 */
public class IloczynMacierzy extends Macierz {
    /** Metoda służąca obliczenia iloczynu macierzy
     * @param pierwszamacierz pierwsza Macierz
     * @param drugamacierz druga Macierz
     * @return zwraca obiekt typu macierz będązy iloczynem macierzy wprowadzonych jako parametr
     * @throws  IllegalArgumentException w przypadku gdy wymiary podanych macierzy uniemożliwiają przeprowadzenie działania
     * (macierz pierwsza o wymiarach mXn, macierz druga nXm gdzie n,m ->naturalne)
     * @see Macierz#macierz(double[]...)
     */
    public static Macierz iloczynMacierzy(Macierz pierwszamacierz, Macierz drugamacierz) {

        //wartości danych macierzy w formie tablic dwuwymiarowych
        double[][] wartoscipierwszejmacierzy = pierwszamacierz.getMacierz();
        double[][] wartoscidrugiejmacierzy = drugamacierz.getMacierz();

        //tablica, w ktorej będą pojawiały się wyniki o wymiarach określonych przez wielkość macierzy
        double[][] wynik = new double[wartoscipierwszejmacierzy.length][wartoscidrugiejmacierzy[0].length];

        //sprawdzenie warunku koniecznego iloczynu macierzy
        if (wartoscipierwszejmacierzy[0].length == wartoscidrugiejmacierzy.length
                && wartoscipierwszejmacierzy.length == wartoscidrugiejmacierzy[0].length) {
            //wywołanie każdego wiersza i kolumny macierzy wynik
            for (int wiersz = 0; wiersz < wartoscipierwszejmacierzy.length; wiersz++) {
                for (int kolumna = 0; kolumna < wartoscidrugiejmacierzy[0].length; kolumna++) {
                    //tymczasowa stała w której będzie pojawiać się wynik cząstkowy wartości macierzy
                    double rezultat = 0;
                    // wyliczenie każdego iloczynu dla danej wartości, następnie ich suma
                    for (int i = 0; i < wartoscipierwszejmacierzy[0].length; i++){
                        rezultat = rezultat + wartoscipierwszejmacierzy[wiersz][i] * wartoscidrugiejmacierzy[i][kolumna];
                    }
                    //zapisanie wyniku do odpowiedniego miejsca w tablicy
                    wynik[kolumna][wiersz] = rezultat;
                }
            }
            Macierz Wynik = new Macierz(wynik);
            return Wynik;
        }
        else {
            throw new IllegalArgumentException("Warunek konieczny mnożenia macierzy jest niespełniony! Spradź wymiary macierzy.");
        }
    }

    /*
    public static void main(String args[]){
        Macierz macierz1 = macierz(new double[]{13,22,34}, new double[]{41,26,33});
        Macierz macierz2 = macierz(new double[]{14,25}, new double[]{51,2}, new double[]{1,2});
        System.out.println(iloczynmacierzy(macierz1,macierz2));
    }

     */
}