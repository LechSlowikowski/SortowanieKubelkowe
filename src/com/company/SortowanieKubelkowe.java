package com.company;

import java.util.Arrays;

/********************************************************
 * nazwa klasy: SortowanieKubelkowe
 * parametry wejściowe: brak
 * wartość zwracana: brak
 * opis: Klasa sortująca tablicę metodą kubełkową
 * autor: 78901234567
 * ****************************************************/
public class SortowanieKubelkowe {
    private int[] tablica;
    private int[] kubelki;
    private int[] posortowana;

    /********************************************************
     * nazwa funkcji: SortowanieKubelkowe
     * parametry wejściowe: tablica - tablica do posortowania
     * wartość zwracana: brak
     * opis: Konstruktor klasy SortowanieKubelkowe
     * autor: 78901234567
     * ****************************************************/
    public SortowanieKubelkowe(int[] tablica) {
        this.tablica = tablica;
        this.posortowana = new int[tablica.length];
    }

    /********************************************************
     * nazwa funkcji: znajdzNajwiekszy
     * parametry wejściowe: brak
     * wartość zwracana: największy element w tablicy
     * opis: Znajduje największy element w tablicy
     * autor: 78901234567
     * ****************************************************/
    private int znajdzNajwiekszy() {
        int najwiekszy = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (najwiekszy < tablica[i]) {
                najwiekszy = tablica[i];
            }
        }
        return najwiekszy;
    }

    /********************************************************
     * nazwa funkcji: sortuj
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sortuje tablicę metodą kubełkową
     * autor: 78901234567
     * ****************************************************/
    public void sortuj() {
        int iloscKubelkow = znajdzNajwiekszy() + 1;
        kubelki = new int[iloscKubelkow];
        for (int i = 0; i < tablica.length; i++) {
            //odczytuję wartość elementu z tablicy
            int wartosc = tablica[i];
            kubelki[wartosc] += 1;
        }
        int licznik = 0;
        for (int i = 0; i < kubelki.length; i++) {
            int ileRazy = kubelki[i];
            for (int j = 0; j < ileRazy; j++) {
                posortowana[licznik] = i;
                licznik++;
            }
        }
    }

    /********************************************************
     * nazwa funkcji: toString
     * parametry wejściowe: brak
     * wartość zwracana: napis zawierający elementy tablicy oddzielone przecinkami
     * opis: Zwraca posortowaną tablicę w postaci napisu
     * autor: 78901234567
     * ****************************************************/
    @Override
    public String toString() {
        return Arrays.toString(posortowana);
    }
}
