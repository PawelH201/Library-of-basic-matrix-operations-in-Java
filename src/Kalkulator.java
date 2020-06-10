import MacierzeiWektory.*;
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
                while (true)
                {
                    System.out.println("1 - Wprowadź pierwszy wektor");
                    System.out.println("2 - Wprowadź drugi wektor");
                    System.out.println("3 - Wykonaj operację na tych wektorach");
                    System.out.println("4 - Powrót do menu");

                    int indeks1 = scanner.nextInt();

                    if (indeks1 == 1)
                    {
                        System.out.println("Podaj rozmiar 1. wektora");
                        int wektorrozmiar1 = scanner.nextInt();
                        double[] parametrwektor1 = new double[wektorrozmiar1];

                        for (int i = 0; i < wektorrozmiar1; i++)
                        {
                            System.out.print("Podaj " + (i+1) + ". wartość: ");
                            double wartoscwektor1 = scanner.nextDouble();
                            parametrwektor1[i] = wartoscwektor1;
                        }

                    }
                    else if (indeks1 == 2)
                    {

                    }
                    else if (indeks1 == 3)
                    {

                    }
                    else if (indeks1 == 4)
                    {

                    }
                    else
                    {
                        System.out.println("Podano zły indeks!");
                    }
                }
            }
            else if (indeks == 2)
            {

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
                System.out.println("Program stworzony jako projekt na przedmiot: Podstawy Programowania 2 (PRM2T) \n Autorzy: Mikołaj Pater, Paweł Hulanicki, Jowita Walczuk");
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
