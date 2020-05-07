class iloczynwektorowy extends Wektor{
    boolean czymoznapoliczyciloczynwektorowy;
    Wektor wektorpierwszy;
    Wektor wektordrugi;
    Wektor wynik;
    static Wektor iloczynwektorowy(Wektor pierwszy, Wektor drugi) {
       double[] wektorpierwszy = pierwszy.getWektor();
       double[] wektordrugi = drugi.getWektor();
       Wektor wynik;

        if(wektordrugi.length == 3 && wektorpierwszy.length == 3){
            double a0 = wektorpierwszy[0];
            double a1 = wektorpierwszy[1];
            double a2 = wektorpierwszy[2];
            double b0 = wektordrugi[0];
            double b1 = wektordrugi[1];
            double b2 = wektordrugi[2];
            double w0;
            double w1;
            double w2;
            w0 = a1*b2 - a2*b1;
            w1 = a2*b0 - a0*b2;
            w2 = a0*b1 - a1*b0;
            wynik = new Wektor(w0,w1,w2);
            return wynik;
        }
        else {
            wynik = null;
            return wynik;
        }

       }



   public static void main(String args[]){
        Wektor pierwszy = new Wektor(1,2,4);
        Wektor drugi = new Wektor(1,2,3);
        System.out.println(iloczynwektorowy(pierwszy,drugi));
    }



}
