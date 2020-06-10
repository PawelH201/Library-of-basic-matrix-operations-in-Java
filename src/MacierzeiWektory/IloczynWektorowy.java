package MacierzeiWektory;

public class IloczynWektorowy extends Wektor {
    //deklaracja metody iloczynwektorowy, obliczająca iloczyn dla wektorów w R3
    public static Wektor iloczynwektorowy(Wektor pierwszy, Wektor drugi) {
        //wyciągniecie tablic z obiektow Wektor
        double[] wektorpierwszy = pierwszy.getWektor();
        double[] wektordrugi = drugi.getWektor();

        //wektor w ktorym bedzie pojawial sie wynik
        Wektor wynik;

        //warunek sprawdzajacy czy wymiary wektorow sie zgadzaja
        if(wektordrugi.length == 3 && wektorpierwszy.length == 3){
            // przypisanie kolejnych wartosci dla zmiennych w celu poprawienia czytelnosci kodu
            double a0 = wektorpierwszy[0];
            double a1 = wektorpierwszy[1];
            double a2 = wektorpierwszy[2];
            double b0 = wektordrugi[0];
            double b1 = wektordrugi[1];
            double b2 = wektordrugi[2];

            //deklaracja zmiennych bedacych czescia wyniku
            double w0;
            double w1;
            double w2;

            //obliczenie wartosci wyniku
            w0 = a1*b2 - a2*b1;
            w1 = a2*b0 - a0*b2;
            w2 = a0*b1 - a1*b0;

            //zapis trzech zmiennych typu double do obiektu typu wektor, zwrocenie wyniku
            wynik = new Wektor(w0,w1,w2);
            return wynik;
        }
        //przypadek gdy wymiar podanych wektorow jest niepoprawny
        else {
            throw new IllegalArgumentException("Sprawdz czy wektory mają długość 3 i mają odpowiednie dane!");
        }
    }

    //czesc testowa programu
    /*
    public static void main(String args[]){
        //utworzenie obiektow wektor
        Wektor pierwszy = new Wektor(1,2,4);
        Wektor drugi = new Wektor(1,2,3);
        Wektor niepoprawny = new Wektor(1,2,3,4);
        //sprawdzenie poprawnosci dzialania
        System.out.println(iloczynwektorowy(pierwszy,drugi));
        //sprawdzenie poprawnosci wywapywania wyjatkow
        System.out.println(iloczynwektorowy(pierwszy,niepoprawny));
    }

     */
}