package com.company;

import java.util.Arrays;

public class SortowanieKubelkowe {
    private int[] tablica;
    private int[] kubelki;
    private int[] posortowana;

    public SortowanieKubelkowe(int[] tablica) {
        this.tablica = tablica;
        this.posortowana = new int[tablica.length];
    }

    private int znajdzNajwiekszy(){
        int najwiekszy = 0;
        for (int i = 0; i < tablica.length ; i++) {
            if(najwiekszy < tablica[i]){
                najwiekszy = tablica[i];
            }
        }
        return najwiekszy;
    }

    public void sortuj(){
        int iloscKubelkow = znajdzNajwiekszy() + 1;
        kubelki = new int[iloscKubelkow];
        for (int i = 0; i < tablica.length; i++) {
            //odczytuję wartość elementu z tablicy
            int wartosc = tablica[i];
            kubelki[wartosc] += 1;
        }
        int licznik = 0;
        for (int i = 0; i < kubelki.length ; i++) {
            int ileRazy = kubelki[i];
            for (int j = 0; j <ileRazy ; j++) {
                posortowana[licznik] = i;
                licznik ++;
            }
        }
    }

    @Override
    public String toString() {
        return  Arrays.toString(posortowana);
    }
}
