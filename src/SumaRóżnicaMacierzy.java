//Klasa potomna klasy Macierz zawierająca metody sumaMacierzy, różnica Macierzy.
//ALERT ->>> Program jest w trakcie tworzenia(nie funkcjonuje jeszcze sprawnie)
public class SumaRóżnicaMacierzy extends Macierz {/*

    double[][] wynik=null;
    double[][] tablica1=getMacierz();
    double[][] tablica2=getMacierz();

    public void sumaMacierzy(Macierz macierz) { //metoda służąca dodawaniu macierzy

        if (tablica1.length == tablica2.length && tablica2[0].length == tablica1[0].length) { //czy macierze mają takie same wymiary? -> czy operacja dodawania jest możliwa?
            tablica2 = new double[tablica2.length][tablica2[0].length];
            for (int i = 0; i < tablica2.length; i++) {
                for (int j = 0; j < tablica2[0].length; j++) {
                    wynik[i][j] = (tablica2[i][j] + tablica1[i][j]);
                }
            }
        } else {
            throw new RuntimeException("Operacja dodawania nie jest możliwa dla macierzy o różnych wymiarach!!! ");
        }

    }

    public void różnicaMacierzy(Macierz macierz) {

        if (tablica1.length == tablica2.length && tablica2[0].length == tablica1[0].length) {//czy macierze mają takie same wymiary? -> czy operacja odejmowania jest możliwa
            tablica2 = new double[tablica2.length][tablica2[0].length];
            for (int i = 0; i < tablica2.length; i++) {
                for (int j = 0; j < tablica2[0].length; j++) {
                    wynik[i][j] = (tablica2[i][j] - tablica1[i][j]);
                }
            }
        } else {
            throw new RuntimeException("Operacja odejmowania nie jest możliwa dla macierzy o różnych wymiarach!!! ");
        }
    }

    public static void main(String[] args) { //program testowy
        Macierz macierz1 = new Macierz(new double[]{23,34.2,23.2}, new double[]{2,3,4});
        Macierz macierz2 = new Macierz(new double[]{23,34.2,23.2}, new double[]{2,34});
        System.out.println(macierz1.sumaMacierzy( macierz2)); //jak widać prace jeszcze trwają
    }*/
}