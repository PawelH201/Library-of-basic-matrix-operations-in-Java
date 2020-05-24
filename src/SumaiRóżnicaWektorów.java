public class SumaiRóżnicaWektorów extends Wektor {

    public static Wektor sumawektorów(Wektor wektor1, Wektor wektor2){
        double[] tablica1=wektor1.getWektor();
        double[] tablica2=wektor2.getWektor();
        double[] wynik = new double[tablica1.length];

        if (tablica1.length == tablica2.length) { //czy wektory mają takie same wymiary? -> czy operacja dodawania jest możliwa?
        for (int i = 0; i < tablica1.length; i++) {                                        //iterowanie po kolumnach
                wynik[i]=(tablica2[i] + tablica1[i]);
            }
        }

        else {
        throw new RuntimeException("Operacja dodawania nie jest możliwa dla różnych długości wektorów! ");
        }
        Wektor Wynik = new Wektor(wynik);
        return Wynik;
    }

    public static Wektor różnicawektorów(Wektor wektor1, Wektor wektor2){
        double[] tablica1=wektor1.getWektor();
        double[] tablica2=wektor2.getWektor();
        double[] wynik = new double[tablica1.length];

        if (tablica1.length == tablica2.length) { //czy wektory mają takie same wymiary? -> czy operacja dodawania jest możliwa?
            for (int i = 0; i < tablica1.length; i++) {                                        //iterowanie po kolumnach
                wynik[i]=(tablica1[i] - tablica2[i]);
            }
        }

        else {
            throw new RuntimeException("Operacja odejmowania nie jest możliwa dla różnych długości wektorów!");
        }
        Wektor Wynik = new Wektor(wynik);
        return Wynik;
    }

    public static void main(String[] args) {
        //utworzenie wektora
        Wektor wektor1 = new Wektor(2, 3, 4, 5, 6);
        Wektor wektor2 = new Wektor(-2, 0, 4, -15, 1000);
        //test sprawności programu
        System.out.println("Suma wektorów:  " + sumawektorów(wektor1, wektor2));
        System.out.println("Różnica wektorów:  " + różnicawektorów(wektor1, wektor2));
        //test sprawności wyjątków
        Wektor wektor3 = new Wektor(2, 3, 4, 5, 6);
        Wektor wektor4 = new Wektor(-2, 0, 4);
        System.out.println("Suma wektorów:  " + sumawektorów(wektor3, wektor4));
        System.out.println("Różnica wektorów:  " + różnicawektorów(wektor3, wektor4));
    }
}