public class iloczynskalarny extends Wektor {
    boolean czymoznapoliczyciloczynwektorowy;
    Wektor wektorpierwszy;
    Wektor wektordrugi;
    Wektor wynik;

    static Wektor iloczynskalarny(Wektor pierwszy, Wektor drugi) {

        //wyciągniecie tablic z obiektow Wektor
        double[] wektorpierwszy = pierwszy.getWektor();
        double[] wektordrugi = drugi.getWektor();
        int dlugosc1 = wektorpierwszy.length;
        int dlugosc2 = wektordrugi.length;

        //wektor w ktorym bedzie pojawial sie wynik
        Wektor wynik;
        if (dlugosc1 == dlugosc2) {
        }
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
        Wektor rezultat = new Wektor(listawynik);
        return rezultat;


    }


    public static void main(String args[]) {
        //utworzenie obiektow wektor
        Wektor pierwszy = new Wektor(1.2, 2, 4,5,4);
        Wektor drugi = new Wektor(1, 2, 3,4,3);
        System.out.println(iloczynskalarny(pierwszy, drugi));
    }
}