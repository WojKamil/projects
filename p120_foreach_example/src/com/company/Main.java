package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(char c : "An African Swallow".toCharArray()){
            System.out.println(c + " ");
        }

        System.out.println("");

        Random rand = new Random(47);
        //b - dlugosc tablicy
        int b = 20;
        float tab[] = new float[b];
        int t[] = new int[b];
        for( int i = 0; i<b; i++){
            tab[i] = rand.nextFloat();
            t[i] = rand.nextInt(10) + 1;
        }
        for (float x : tab){
            System.out.println(x);
        }

        for (int x :t){
            System.out.print(x + " ");
        }

        System.out.println("");

        int val=190;
        int tablica[] = new int[5];
        tablica[0] = 2;
        tablica[1] = (tablica[0]+1)*3;
        tablica[2] = tablica[0];
        //tablica[3]= not assaigned;
        tablica[4] = val;

        for(int x : tablica){
            System.out.println(x);
        }



    }
}
