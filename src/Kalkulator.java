import MacierzeiWektory.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Kalkulator
{
    public static void main(String[] args) throws IOException {
        System.out.println("Kalkulator v1.0");
        System.out.println("Wciśnij enter, aby uruchomić program...");
        try
        {
            System.in.read();
        }
        catch (Exception ignored)
        {}

        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1 - Suma wektorów");
            System.out.println("2 - Różnica wektorów");
            System.out.println("3 - Iloczyn skalarny");
            System.out.println("4 - Iloczyn wektorowy");
            System.out.println("5 - Suma macierzy");
            System.out.println("6 - Różnica macierzy");
            System.out.println("7 - Macierz transponowana");
            System.out.println("8 - Iloczyn macierzy");
            System.out.println("9 - Wyznacznik macierzy");
            System.out.println("10 - Macierz odwrotna");
            System.out.println("11 - Układ liniowy za pomocą Cramera");
            System.out.println("12 - O autorach");
            System.out.println("13 - Zamknij program");
            System.out.println("Wybierz na czym chcesz wykonywać operacje: ");

            int indeks = scanner.nextInt();

            if (indeks == 1)
            {
                System.out.println("Wybrano operację sumowania wektorów \n");
                Wektor wektor1;
                Wektor wektor2;

                System.out.println("Podaj rozmiar 1. wektora");
                int wektorrozmiar1 = scanner.nextInt();
                double[] parametrwektor1 = new double[wektorrozmiar1];

                for (int i = 0; i < wektorrozmiar1; i++)
                {
                    System.out.print("Podaj " + (i+1) + ". wartość: ");
                    double wartoscwektor1 = scanner.nextDouble();
                    parametrwektor1[i] = wartoscwektor1;
                }
                wektor1 = Wektor.wektor(parametrwektor1);

                System.out.println("Ten wektor wygląda następująco: \n" + wektor1 + "\n");

                System.out.println("Podaj rozmiar 2. wektora");
                int wektorrozmiar2 = scanner.nextInt();
                double[] parametrwektor2 = new double[wektorrozmiar2];

                for (int i = 0; i < wektorrozmiar2; i++)
                {
                    System.out.print("Podaj " + (i+1) + ". wartość: ");
                    double wartoscwektor2 = scanner.nextDouble();
                    parametrwektor2[i] = wartoscwektor2;
                }
                wektor2 = Wektor.wektor(parametrwektor2);

                System.out.println("Ten wektor wygląda następująco: \n" + wektor2 + "\n");

                try
                {
                    Wektor suma = SumaiRoznicaWektorow.sumaWektorow(wektor1, wektor2);
                    System.out.println("Suma tych wektorów wygląda następująco: \n" + suma);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano nierówne wielkości wektorów! Sprawdź czy wpisane wektory mają tyle samo wartości.");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}
            }
            else if (indeks == 2)
            {
                System.out.println("Wybrano operację odejmowania wektorów \n");
                Wektor wektor1;
                Wektor wektor2;

                System.out.println("Podaj rozmiar 1. wektora");
                int wektorrozmiar1 = scanner.nextInt();
                double[] parametrwektor1 = new double[wektorrozmiar1];

                for (int i = 0; i < wektorrozmiar1; i++)
                {
                    System.out.print("Podaj " + (i+1) + ". wartość: ");
                    double wartoscwektor1 = scanner.nextDouble();
                    parametrwektor1[i] = wartoscwektor1;
                }
                wektor1 = Wektor.wektor(parametrwektor1);

                System.out.println("Ten wektor wygląda następująco: \n" + wektor1 + "\n");

                System.out.println("Podaj rozmiar 2. wektora");
                int wektorrozmiar2 = scanner.nextInt();
                double[] parametrwektor2 = new double[wektorrozmiar2];

                for (int i = 0; i < wektorrozmiar2; i++)
                {
                    System.out.print("Podaj " + (i+1) + ". wartość: ");
                    double wartoscwektor2 = scanner.nextDouble();
                    parametrwektor2[i] = wartoscwektor2;
                }
                wektor2 = Wektor.wektor(parametrwektor2);

                System.out.println("Ten wektor wygląda następująco: \n" + wektor2 + "\n");

                try
                {
                    Wektor roznica = SumaiRoznicaWektorow.roznicaWektorow(wektor1, wektor2);
                    System.out.println("Różnica tych wektorów wygląda następująco: \n" + roznica);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano nierówne wielkości wektorów! Sprawdź czy wpisane wektory mają tyle samo wartości.");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}
            }
            //iloczyn skalarny
            else if (indeks == 3)
            {
                System.out.println("Wybrano operację iloczynu skalarnego wektorów dla trzech wymiarów.");
                Wektor wektor1;
                Wektor wektor2;

                System.out.println("Podaj rozmiar 1. wektora");
                int wektorrozmiar1 = scanner.nextInt();
                double[] parametrwektor1 = new double[wektorrozmiar1];

                for (int i = 0; i < wektorrozmiar1; i++)
                {
                    System.out.print("Podaj " + (i+1) + ". wartość: ");
                    double wartoscwektor1 = scanner.nextDouble();
                    parametrwektor1[i] = wartoscwektor1;
                }
                wektor1 = Wektor.wektor(parametrwektor1);

                System.out.println("Ten wektor wygląda następująco: \n" + wektor1 + "\n");

                System.out.println("Podaj rozmiar 2. wektora");
                int wektorrozmiar2 = scanner.nextInt();
                double[] parametrwektor2 = new double[wektorrozmiar2];

                for (int i = 0; i < wektorrozmiar2; i++)
                {
                    System.out.print("Podaj " + (i+1) + ". wartość: ");
                    double wartoscwektor2 = scanner.nextDouble();
                    parametrwektor2[i] = wartoscwektor2;
                }
                wektor2 = Wektor.wektor(parametrwektor2);

                System.out.println("Ten wektor wygląda następująco: \n" + wektor2 + "\n");

                try
                {
                    Wektor iloczyn = IloczynSkalarny.iloczynSkalarny(wektor1, wektor2);
                    System.out.println("Iloczyn skalarny tych wektorów wygląda następująco: \n" + iloczyn);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano nierówne wielkości wektorów! Spradź czy wpisane wektory maja tyle samo wartości.");
                }
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}
            }
            //iloczyn wektorowy
            else if (indeks == 4)
            {
                System.out.println("Wybrano operację iloczynu wektorowego wektorów");
                Wektor wektor1;
                Wektor wektor2;

                System.out.println("Podaj rozmiar 1. wektora");
                int wektorrozmiar1 = scanner.nextInt();
                double[] parametrwektor1 = new double[wektorrozmiar1];

                for (int i = 0; i < wektorrozmiar1; i++)
                {
                    System.out.print("Podaj " + (i+1) + ". wartość: ");
                    double wartoscwektor1 = scanner.nextDouble();
                    parametrwektor1[i] = wartoscwektor1;
                }
                wektor1 = Wektor.wektor(parametrwektor1);

                System.out.println("Ten wektor wygląda następująco: \n" + wektor1 + "\n");

                System.out.println("Podaj rozmiar 2. wektora");
                int wektorrozmiar2 = scanner.nextInt();
                double[] parametrwektor2 = new double[wektorrozmiar2];

                for (int i = 0; i < wektorrozmiar2; i++)
                {
                    System.out.print("Podaj " + (i+1) + ". wartość: ");
                    double wartoscwektor2 = scanner.nextDouble();
                    parametrwektor2[i] = wartoscwektor2;
                }
                wektor2 = Wektor.wektor(parametrwektor2);

                System.out.println("Ten wektor wygląda następująco: \n" + wektor2 + "\n");

                try
                {
                    Wektor iloczyn = IloczynWektorowy.iloczynwektorowy(wektor1, wektor2);
                    System.out.println("Iloczyn wektorowy tych wektorów wygląda następująco: \n" + iloczyn);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano nierówne wielkości wektorów! Sprawdź czy podane wektory mają po tyle samo wartości.");
                }

                System.out.println("Wciśnij enter, aby wrocić do menu...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}

            }
            //dodawanie macierzy
            else if (indeks == 5)
            {
                System.out.println("Wybrano operację sumowania macierzy \n");

                Macierz macierz1;
                Macierz macierz2;

                System.out.println("Podaj liczbę wierszy pierwszej macierzy");
                int wiersze1 = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn pierwszej macierzy");
                int kolumny1 = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze1 + "X" + kolumny1);

                double[][] parametr1 = new double[wiersze1][kolumny1];

                for (int i = 0; i < wiersze1; i++)
                {
                    for (int n = 0; n < kolumny1; n++)
                    {
                        System.out.print("Podaj wartość dla " + (i+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc1 = scanner.nextDouble();
                        parametr1[i][n] = wartosc1;
                    }
                }
                try
                {
                    macierz1 = Macierz.macierz(parametr1);
                    System.out.println("Macierz 1. wygląda następująco: ");
                    for (int i = 0; i < wiersze1; i++)
                    {
                        System.out.println(Arrays.toString(macierz1.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                System.out.println("Podaj liczbę wierszy drugiej macierzy");
                int wiersze2 = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn drugiej macierzy");
                int kolumny2 = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze2 + "X" + kolumny2);

                double[][] parametr2 = new double[wiersze2][kolumny2];

                for (int i = 0; i < wiersze2; i++)
                {
                    for (int n = 0; n < kolumny2; n++)
                    {
                        System.out.print("Podaj wartość dla " + (n+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc2 = scanner.nextDouble();
                        parametr2[i][n] = wartosc2;
                    }
                }
                try
                {
                    macierz2 = Macierz.macierz(parametr2);
                    System.out.println("Macierz 2. wygląda następująco: ");
                    for (int i = 0; i < wiersze1; i++)
                    {
                        System.out.println(Arrays.toString(macierz2.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                try
                {
                    macierz1 = Macierz.macierz(parametr1);
                    macierz2 = Macierz.macierz(parametr2);

                    Macierz suma = SumaiRoznicaMacierzy.sumaMacierzy(macierz1, macierz2);
                    System.out.println("\nSuma tych macierzy wygląda następująco: ");
                    for (int i = 0; i < wiersze1; i++)
                    {
                        System.out.println(Arrays.toString(suma.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}
            }
            else if (indeks == 6)
            {
                System.out.println("Wybrano operację odejmowania macierzy \n");

                Macierz macierz1;
                Macierz macierz2;

                System.out.println("Podaj liczbę wierszy pierwszej macierzy");
                int wiersze1 = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn pierwszej macierzy");
                int kolumny1 = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze1 + "X" + kolumny1);

                double[][] parametr1 = new double[wiersze1][kolumny1];

                for (int i = 0; i < wiersze1; i++)
                {
                    for (int n = 0; n < kolumny1; n++)
                    {
                        System.out.print("Podaj wartość dla " + (i+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc1 = scanner.nextDouble();
                        parametr1[i][n] = wartosc1;
                    }
                }
                try
                {
                    macierz1 = Macierz.macierz(parametr1);
                    System.out.println("Macierz 1. wygląda następująco: ");
                    for (int i = 0; i < wiersze1; i++)
                    {
                        System.out.println(Arrays.toString(macierz1.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                System.out.println("Podaj liczbę wierszy drugiej macierzy");
                int wiersze2 = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn drugiej macierzy");
                int kolumny2 = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze2 + "X" + kolumny2);

                double[][] parametr2 = new double[wiersze2][kolumny2];

                for (int i = 0; i < wiersze2; i++)
                {
                    for (int n = 0; n < kolumny2; n++)
                    {
                        System.out.print("Podaj wartość dla " + (n+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc2 = scanner.nextDouble();
                        parametr2[i][n] = wartosc2;
                    }
                }
                try
                {
                    macierz2 = Macierz.macierz(parametr2);
                    System.out.println("Macierz 2. wygląda następująco: ");
                    for (int i = 0; i < wiersze1; i++)
                    {
                        System.out.println(Arrays.toString(macierz2.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                try
                {
                    macierz1 = Macierz.macierz(parametr1);
                    macierz2 = Macierz.macierz(parametr2);

                    Macierz roznica = SumaiRoznicaMacierzy.roznicaMacierzy(macierz1, macierz2);
                    System.out.println("\nRóżnica tych macierzy wygląda następująco: ");
                    for (int i = 0; i < wiersze1; i++)
                    {
                        System.out.println(Arrays.toString(roznica.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}
            }
            //macierz transponowana
            else if (indeks == 7)
            {
                System.out.println("Wybrano operację macierz transponowana");

                Macierz macierz1;

                System.out.println("Podaj liczbę wierszy macierzy");
                int wiersze = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn macierzy");
                int kolumny = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze + "X" + kolumny);

                double[][] parametr1 = new double[wiersze][kolumny];

                for (int i = 0; i < wiersze; i++)
                {
                    for (int n = 0; n < kolumny; n++)
                    {
                        System.out.print("Podaj wartość dla " + (i+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc1 = scanner.nextDouble();
                        parametr1[i][n] = wartosc1;
                    }
                }
                try
                {
                    macierz1 = Macierz.macierz(parametr1);
                    System.out.println("Macierz 1. wygląda następująco: ");
                    for (int i = 0; i < wiersze; i++)
                    {
                        System.out.println(Arrays.toString(macierz1.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }


                try
                {
                    macierz1 = Macierz.macierz(parametr1);

                    Macierz transponowana = MacierzTransponowana.macierzTransponowana(macierz1);
                    System.out.println("\nTranspozycja podanej macierzy wygląda następująco: ");
                    for (int i = 0; i < kolumny; i++)
                    {
                        System.out.println(Arrays.toString(transponowana.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}

            }
            //iloczyn macierzy
            else if (indeks == 8)
            {
                System.out.println("Wybrano operację iloczynu macierzy");

                Macierz macierz1;
                Macierz macierz2;

                System.out.println("Podaj liczbę wierszy pierwszej macierzy");
                int wiersze1 = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn pierwszej macierzy");
                int kolumny1 = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze1 + "X" + kolumny1);

                double[][] parametr1 = new double[wiersze1][kolumny1];

                for (int i = 0; i < wiersze1; i++)
                {
                    for (int n = 0; n < kolumny1; n++)
                    {
                        System.out.print("Podaj wartość dla " + (i+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc1 = scanner.nextDouble();
                        parametr1[i][n] = wartosc1;
                    }
                }
                try
                {
                    macierz1 = Macierz.macierz(parametr1);
                    System.out.println("Macierz 1. wygląda następująco: ");
                    for (int i = 0; i < wiersze1; i++)
                    {
                        System.out.println(Arrays.toString(macierz1.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                System.out.println("Podaj liczbę wierszy drugiej macierzy");
                int wiersze2 = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn drugiej macierzy");
                int kolumny2 = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze2 + "X" + kolumny2);

                double[][] parametr2 = new double[wiersze2][kolumny2];

                for (int i = 0; i < wiersze2; i++)
                {
                    for (int n = 0; n < kolumny2; n++)
                    {
                        System.out.print("Podaj wartość dla " + (n+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc2 = scanner.nextDouble();
                        parametr2[i][n] = wartosc2;
                    }
                }
                try
                {
                    macierz2 = Macierz.macierz(parametr2);
                    System.out.println("Macierz 2. wygląda następująco: ");
                    for (int i = 0; i < wiersze2; i++)
                    {
                        System.out.println(Arrays.toString(macierz2.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                try
                {
                    macierz1 = Macierz.macierz(parametr1);
                    macierz2 = Macierz.macierz(parametr2);

                    Macierz iloczyn = IloczynMacierzy.iloczynMacierzy(macierz1, macierz2);
                    System.out.println("\nIloczyn tych macierzy wygląda następująco: ");
                    for (int i = 0; i < kolumny2; i++)
                    {
                        System.out.println(Arrays.toString(iloczyn.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe rozmiary macierzy!");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}

            }
            else if (indeks == 9)
            {
                System.out.println("Wybrano operację liczenia wyznacznika macierzy \n");

                System.out.println("Podaj liczbę wierszy pierwszej macierzy");
                int wiersze = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn pierwszej macierzy");
                int kolumny = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze + "X" + kolumny);

                double[][] parametr = new double[wiersze][kolumny];
                Macierz macierz;

                for (int i = 0; i < wiersze; i++)
                {
                    for (int n = 0; n < kolumny; n++)
                    {
                        System.out.print("Podaj wartość dla " + (i+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc = scanner.nextDouble();
                        parametr[i][n] = wartosc;
                    }
                }
                try
                {
                    macierz = Macierz.macierz(parametr);

                    System.out.println("Macierz wygląda następująco: ");
                    for (int i = 0; i < wiersze; i++)
                    {
                        System.out.println(Arrays.toString(macierz.getMacierz()[i]));
                    }

                    double wyznacznik = Wyznacznik.wyznacznikMacierzy(macierz);
                    System.out.println("\nJej wyznacznik wynosi: " + wyznacznik);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe wymiary macierzy - nie jest kwadratowa!");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}
            }
            else if (indeks == 10)
            {
                System.out.println("Wybrano operację liczenia macierzy odwrotnej \n");

                System.out.println("Podaj liczbę wierszy pierwszej macierzy");
                int wiersze = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn pierwszej macierzy");
                int kolumny = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze + "X" + kolumny);

                double[][] parametr = new double[wiersze][kolumny];
                Macierz macierz;

                for (int i = 0; i < wiersze; i++)
                {
                    for (int n = 0; n < kolumny; n++)
                    {
                        System.out.print("Podaj wartość dla " + (i+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc = scanner.nextDouble();
                        parametr[i][n] = wartosc;
                    }
                }
                try
                {
                    macierz = Macierz.macierz(parametr);

                    System.out.println("Macierz wygląda następująco: ");
                    for (int i = 0; i < wiersze; i++)
                    {
                        System.out.println(Arrays.toString(macierz.getMacierz()[i]));
                    }

                    Macierz macierzodwrotna = MacierzOdwrotna.macierzOdwrotna(macierz);
                    System.out.println("Macierz odwrotna wygląda następująco: ");
                    for (int i = 0; i < wiersze; i++)
                    {
                        System.out.println(Arrays.toString(macierzodwrotna.getMacierz()[i]));
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe wymiary macierzy - nie jest kwadratowa!");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}
            }
            else if (indeks == 11)
            {
                System.out.println("Wybrano operację liczenia układu liniowego za pomocą metody Cramera  \n");

                System.out.println("Podaj takie rozmiary, żeby macierz była takiej postaci: N X N+1 - ma to być macierz rozszerzona o wyrazy wolne");
                System.out.println("Podaj liczbę wierszy pierwszej macierzy");
                int wiersze = scanner.nextInt();
                System.out.println("Podaj liczbę kolumn pierwszej macierzy");
                int kolumny = scanner.nextInt();
                System.out.println("Macierz ma następujące rozmiary: " + wiersze + "X" + kolumny);

                double[][] parametr = new double[wiersze][kolumny];
                Macierz macierz;
                double[] wyrazywolne;

                for (int i = 0; i < wiersze; i++)
                {
                    for (int n = 0; n < kolumny; n++)
                    {
                        System.out.print("Podaj wartość dla " + (i+1) + ". wiersza, " + (n+1) + ". kolumny: ");
                        double wartosc = scanner.nextDouble();
                        parametr[i][n] = wartosc;
                    }
                }
                try
                {
                    macierz = Macierz.macierz(parametr);

                    System.out.println("Macierz wygląda następująco: ");
                    for (int i = 0; i < wiersze; i++)
                    {
                        System.out.println(Arrays.toString(macierz.getMacierz()[i]));
                    }

                    wyrazywolne = RownaniaCramer.ukladRownan(macierz);
                    System.out.println("Rozwiązanie tego układu równań wygląda następująco: ");
                    for (int i =0; i < wyrazywolne.length; i++)
                    {
                        System.out.println("X" + (i+1) + " = " + wyrazywolne[i]);
                    }
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano złe wymiary macierzy!");
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Podana macierz podstawowa ma wyznacznik 0 - nie jest to układ oznaczony!");
                }

                System.out.println("Wciśnij enter, aby kontynuować...");
                try
                {
                    System.in.read();
                }
                catch (Exception ignored)
                {}
            }
            else if (indeks == 12)
            {
                System.out.println("Program stworzony jako projekt na przedmiot: Podstawy Programowania 2 (PRM2T) \nAutorzy: Mikołaj Pater, Paweł Hulanicki, Jowita Walczuk");
            }
            else if (indeks == 13)
            {
                System.out.println("Zamknięto program");
                System.exit(0);
            }
            else
            {
                System.out.println("Podano zły indeks!");
            }
        }
    }
}
