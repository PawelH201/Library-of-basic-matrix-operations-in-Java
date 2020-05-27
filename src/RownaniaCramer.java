import java.util.Arrays;

public class RownaniaCramer extends Wyznacznik {


    static double[] RownaniaCramer(Macierz macierz) {


        int wierszeMacierz = macierz.getMacierz().length;
        int kolumnyMacierz = macierz.getMacierz()[0].length;

        double[][] wartoscimacierzy = macierz.getMacierz();
        double[] wyrazywolne = new double[wierszeMacierz];
        double[][] macierzpodstawowa = new double[wierszeMacierz][wierszeMacierz];
        double[] wynik = new double[wierszeMacierz];
        double[][] macierzZDopelnieniem = new double[wierszeMacierz][wierszeMacierz];

        if(kolumnyMacierz == wierszeMacierz) {
            for (int i = 0; i > wierszeMacierz; i++) {
                wynik[i] = 0;
            }
            return wynik;
        }
            else if(kolumnyMacierz - wierszeMacierz == 1) {
                for(int i = 0; i<wierszeMacierz;i++){
                    wyrazywolne[i] = wartoscimacierzy[i][kolumnyMacierz-1];
                    for(int j = 0; j<kolumnyMacierz-1;j++){
                        macierzpodstawowa[i][j] = wartoscimacierzy[i][j];
                    }
                }
                Macierz MacierzPodstawowa = new Macierz(macierzpodstawowa);
                for(int niewiadoma = 0; niewiadoma < wierszeMacierz;niewiadoma++){
                    for (int wiersze = 0; wiersze < wierszeMacierz;wiersze++){
                        for(int kolumny = 0; kolumny < kolumnyMacierz-1;kolumny++)
                            macierzZDopelnieniem[wiersze][kolumny] = macierzpodstawowa[wiersze][kolumny];
                    }
                    for(int a = 0; a<wierszeMacierz; a++){
                        macierzZDopelnieniem[a][niewiadoma] = wyrazywolne[a];

                    }
                    Macierz MacierzZDopelnieniem = new Macierz(macierzZDopelnieniem);
                    wynik[niewiadoma] = wyznacznikMacierzy(MacierzZDopelnieniem)/wyznacznikMacierzy(MacierzPodstawowa);

                }
                return wynik;
            }
            else {
            throw new IllegalArgumentException("Podana macierz nie ma jednoznacznego rozwiązania! Sprawdź wymiary macierzy");
        }

            }


    public static void main(String args[]){
        Macierz macierz1 = macierz(new double[]{0,0,3,3}, new double[]{0,3,0,3}, new double[]{3,0,0,3});
        System.out.println(Arrays.toString(RownaniaCramer(macierz1)));

    }


            }
