package com.example._static;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar szachownicy: ");
        int rozmiar = scanner.nextInt();
        if (rozmiar <2) {
            System.out.println("Podano zly rozmiar tablicy");
            return;
        }
        System.out.print("Podaj typ figury: 0-wieza, 1-laufer, 2-hetman, 3-król: ");
        int typFigury = scanner.nextInt();

        if (typFigury < 0 || typFigury > 4) {
            System.out.println("Niepoprawny wybór!");
            return;
        }

        System.out.print("Podaj wspolrzedne X figury: ");
        int kolumna = scanner.nextInt();
        if (kolumna <1 || kolumna > rozmiar) {
            System.out.println("Niepoprawna wspolrzedna X!");
            return;
        }

        System.out.print("Podaj wspolrzedne Y figury: ");
        int wiersz = scanner.nextInt();
        if (wiersz <1 || wiersz > rozmiar) {
            System.out.println("Niepoprawna wspolrzedna Y!");
            return;
        }

        System.out.print("Podaj wspolrzedne X docelowe: ");
        int kolumna_target = scanner.nextInt();
        if (kolumna_target <1 || kolumna_target > rozmiar) {
            System.out.println("Niepoprawna wspolrzedna X pola docelowego!");
            return;
        }

        System.out.print("Podaj wspolrzedne Y docelowe: ");
        int wiersz_target = scanner.nextInt();
        if (wiersz_target <1 || wiersz_target > rozmiar) {
            System.out.println("Niepoprawna wspolrzedna Y pola docelowego!");
            return;
        }

        switch (typFigury)  {
            case 0:
                ile_ruchow_wieza(kolumna,wiersz,kolumna_target,wiersz_target);
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:
                ile_ruchow_krol(kolumna,wiersz,kolumna_target,wiersz_target);
                break;
            default:
                System.out.println("Niepoprawny wybór");
                return;
        }

    }

    public static void ile_ruchow_krol(int kolumna, int wiersz, int kolumna_docelowa, int wiersz_docelowy) {
        int kolumna_diff = kolumna_docelowa - kolumna;
        int wiersz_diff = wiersz_docelowy - wiersz;
        if (Math.abs(kolumna_diff) > Math.abs(wiersz_diff)) {
            System.out.println("Figura król potrzebuje: "+ Math.abs(kolumna_diff) +" ruchow do celu");
            return;
        }else if (Math.abs(kolumna_diff) <= Math.abs(wiersz_diff) ) {
            System.out.println("Figura król potrzebuje: "+ Math.abs(wiersz_diff) +" ruchow do celu");
            return;
        }else System.out.println("Something is not yes (z cyklu Angielski z Tuskiem)");

    }
    public static void ile_ruchow_wieza(int kolumna, int wiersz, int kolumna_docelowa, int wiersz_docelowy) {
        if (kolumna == kolumna_docelowa || wiersz == wiersz_docelowy) {
            System.out.println("Figura wieża potrzebuje 1 ruchu do celu");
        }else if (kolumna == kolumna_docelowa && wiersz == wiersz_docelowy) {
            System.out.println("Figura już jest w miejscu docelowym");
        }else {
            System.out.println("Figura wieża potrzebuje 2 ruchów do celu");
        }
    }
}
