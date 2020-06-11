package MacierzeiWektory;

/**Klasa służąca dodawaniu/odejmowaniu wektorów
 * @author Jowita Walczuk
 */
public class SumaiRoznicaWektorow extends Wektor {
    /**
     * Metoda służąca do dodawania do siebie wektorów z zaokrągleniem do 9 miejsc po przecinku
     * @param wektor1 pierwszy wektor, który jest w postaci obiektu Wektor
     * @param wektor2 drugi wektor, który jest w postaci obiektu Wektor
     * @return zwraca sumę wektorów jako obiekt Wektor wprowadzonych jako parametr
     * @throws IllegalArgumentException w przypadku, gdy wymiary wektorów nie są równe
     * @see Wektor#getWektor()
     * @see Wektor#wektor(double...)
     */
    public static Wektor sumaWektorow(Wektor wektor1, Wektor wektor2) {
        double[] tablica1 = wektor1.getWektor();
        double[] tablica2 = wektor2.getWektor();
        double[] wynik = new double[tablica1.length];

        if (tablica1.length == tablica2.length) { //czy wektory mają takie same wymiary? -> czy operacja dodawania jest możliwa?
            for (int i = 0; i < tablica1.length; i++) {                                        //iterowanie po kolumnach
                wynik[i] = (tablica2[i] + tablica1[i]);
            }
        } else {
            throw new IllegalArgumentException("Operacja dodawania nie jest możliwa dla różnych długości wektorów! ");
        }
        //pętla służąca do zaokrąglenia
        for (int i = 0; i < wynik.length; i++)
        {
            double wartosc = wynik[i];
            //zaokrąglenie do 9 miejsc po przecinku (ilość zer)
            wynik[i]=Math.round(wartosc*1000000000.0)/1000000000.0;
        }
        Wektor Wynik = wektor(wynik);
        return Wynik;
    }
    /**
     * Metoda służąca do odejmowania do siebie wektorów z zaokrągleniem do 9 miejsc po przecinku
     * @param wektor1 pierwszy wektor, który jest w postaci obiektu Wektor
     * @param wektor2 drugi wektor, który jest w postaci obiektu Wektor
     * @return zwraca różnicę wektorów jako obiekt Wektor wprowadzonych jako parametr
     * @throws IllegalArgumentException w przypadku, gdy wymiary wektorów nie są równe
     * @see Wektor#getWektor()
     * @see Wektor#wektor(double...)
     */
    public static Wektor roznicaWektorow(Wektor wektor1, Wektor wektor2){
        double[] tablica1=wektor1.getWektor();
        double[] tablica2=wektor2.getWektor();
        double[] wynik = new double[tablica1.length];

        if (tablica1.length == tablica2.length) { //czy wektory mają takie same wymiary? -> czy operacja dodawania jest możliwa?
            for (int i = 0; i < tablica1.length; i++) {                                        //iterowanie po kolumnach
                wynik[i]=(tablica1[i] - tablica2[i]);
            }
        }
        else {
            throw new IllegalArgumentException("Operacja odejmowania nie jest możliwa dla różnych długości wektorów!");
        }
        Wektor Wynik = new Wektor(wynik);
        return Wynik;
    }

    /* Kod testu
    public static void main(String[] args) {
        //utworzenie wektora
        Wektor wektor1 = new Wektor(2, 3, 4, 5, 6);
        Wektor wektor2 = new Wektor(-2, 0, 4, -15, 1000);
        //test sprawności programu
        System.out.println("Suma wektorów:  " + sumaWektorow(wektor1, wektor2));
        System.out.println("Różnica wektorów:  " + roznicaWektorow(wektor1, wektor2));
        //test sprawności wyjątków
        Wektor wektor3 = new Wektor(2, 3, 4, 5, 6);
        Wektor wektor4 = new Wektor(-2, 0, 4);
        System.out.println("Suma wektorów:  " + sumaWektorow(wektor3, wektor4));
        System.out.println("Różnica wektorów:  " + roznicaWektorow(wektor3, wektor4));
    }

     */
}