package com.company;

import java.util.Scanner;

public class Main {
    final static int LICZBA_ELEMENTOW = 10;
    static int[] tablica = new int[LICZBA_ELEMENTOW];
    public static void main(String[] args) {
        Scanner daneWejsciowe = new Scanner(System.in);
        for (int i = 0; i <LICZBA_ELEMENTOW ; i++) {
            System.out.print("Podaj " + (i + 1) + " dodatni element tablicy: ");
            tablica[i] =  daneWejsciowe.nextByte();
        }
        SortowanieKubelkowe sortowanieKubelkowe = new SortowanieKubelkowe(tablica);
        sortowanieKubelkowe.sortuj();
        System.out.println("Posortowana tablica: " + sortowanieKubelkowe.toString());
    }
}
