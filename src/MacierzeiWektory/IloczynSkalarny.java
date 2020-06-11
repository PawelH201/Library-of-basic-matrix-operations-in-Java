package MacierzeiWektory;

/**
 * Klasa służąca do obliczania iloczynu wektorowego na wartościach dwóch obiektów typu Wektor
 * @author Paweł Hulanicki
 */
public class IloczynSkalarny extends Wektor {
    /**
     * Metoda służąca do obliczenia iloczynu wektorowego dwóch Wektorów z zaokrągleniem do 9 miejsc po przecinku
     * @param pierwszy pierwszy wektor, który jest w postaci obiektu Wektor
     * @param drugi drugi wektor, który jest w postaci obiektu Wektor
     * @return Wektor z wartościami będącymi wynikiem działania
     * @see Wektor#wektor(double...)
     * @see Wektor#getWektor()
     * @throws IllegalArgumentException w przypadku różnych wymiarów wektorów
     */
    public static Wektor iloczynSkalarny(Wektor pierwszy, Wektor drugi) {


        double[] wektorpierwszy = pierwszy.getWektor();
        double[] wektordrugi = drugi.getWektor();
        int dlugosc1 = wektorpierwszy.length;
        int dlugosc2 = wektordrugi.length;


        if (dlugosc1 == dlugosc2) {
            double[] listawynik = new double[dlugosc1];
            for (int indeks = 0; indeks < dlugosc1; indeks++) {
                double pierwszawartosc;
                double drugawartosc;
                double wartoscwynik;
                pierwszawartosc = wektorpierwszy[indeks];
                drugawartosc = wektordrugi[indeks];
                wartoscwynik = pierwszawartosc * drugawartosc;
                listawynik[indeks] = wartoscwynik;
            }
            //pętla służąca do zaokrąglenia
            for (int i = 0; i < dlugosc1; i++)
            {
                double wartosc = listawynik[i];
                //zaokrąglenie do 9 miejsc po przecinku (ilość zer)
                listawynik[i]=Math.round(wartosc*1000000000.0)/1000000000.0;
            }
            Wektor rezultat = wektor(listawynik);
            return rezultat;
        }
        else {
            throw new IllegalArgumentException("Sprawdz czy wektory mają taką samą długość i mają odpowiednie dane!");
        }
    }

    /* Kod testowy
    public static void main(String args[]) {
        //utworzenie obiektow wektor
        Wektor pierwszy = new Wektor(2, 2, 4,5,4);
        Wektor drugi = new Wektor(1, 2, 3,4,3);
        System.out.println(iloczynSkalarny(pierwszy, drugi));
    }

     */
}