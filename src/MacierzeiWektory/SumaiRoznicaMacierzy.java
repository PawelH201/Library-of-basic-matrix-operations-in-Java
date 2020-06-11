package MacierzeiWektory;
/**Klasa służąca dodawaniu/odejomwaniu do siebie macierzy
 * @author Jowita Walczuk
 */
//Klasa potomna klasy Macierz zawierająca metody sumaMacierzy, różnica Macierzy.
public class SumaiRoznicaMacierzy extends Macierz {
    /**
     *
     * @param macierz
     * @param macierz2
     * @return zwracana jest macierz będąca sumą macierzy podanych jako parametry
     * @throws IllegalArgumentException wyjątek zwracany w przypadku, gdy wymiary macierzy nie są poprawne
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
            throw new IllegalArgumentException("Operacja dodawania nie jest możliwa dla macierzy o różnych wymiarach!!! ");
        }
        Macierz Wynik = new Macierz(wynik);
        return Wynik;
    }
    /**
     * @param macierz
     * @param macierz2
     * @return zwracana jest macierz będąca różnicą macierzy podanych jako parametry
     * @throws IllegalArgumentException wyjątek zwracany w przypadku, gdy wymiary macierzy nie są poprawne
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
        Macierz Suma=new Macierz(wynik);
        return Suma;
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