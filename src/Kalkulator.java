import MacierzeiWektory.*;

import javax.crypto.Mac;
import java.io.IOException;
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
                System.out.println("Wybrano operację sumowania wektorów");
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

                System.out.println("Ten wektor wygląda nastęująco: \n" + wektor1 + "\n");

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

                System.out.println("Ten wektor wygląda nastęująco: \n" + wektor2 + "\n");

                try
                {
                    Wektor suma = SumaiRoznicaWektorow.sumaWektorow(wektor1, wektor2);
                    System.out.println("Suma tych wektorów wygląda następująco: \n" + suma);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano nierówne wielkości wektorów!");
                }
            }
            else if (indeks == 2)
            {
                System.out.println("Wybrano operację odejmowania wektorów");
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

                System.out.println("Ten wektor wygląda nastęująco: \n" + wektor1 + "\n");

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

                System.out.println("Ten wektor wygląda nastęująco: \n" + wektor2 + "\n");

                try
                {
                    Wektor roznica = SumaiRoznicaWektorow.roznicaWektorow(wektor1, wektor2);
                    System.out.println("Różnica tych wektorów wygląda następująco: \n" + roznica);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Podano nierówne wielkości wektorów!");
                }
            }
            else if (indeks == 3)
            {

            }
            else if (indeks == 4)
            {

            }
            else if (indeks == 5)
            {

            }
            else if (indeks == 6)
            {

            }
            else if (indeks == 7)
            {

            }
            else if (indeks == 8)
            {

            }
            else if (indeks == 9)
            {

            }
            else if (indeks == 10)
            {

            }
            else if (indeks == 11)
            {

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