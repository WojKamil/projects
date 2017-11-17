package com.company;

public class Main {


    //Excercise 12:
    static void Chartobin(char c) {
        int i = (int) c;
        System.out.println(c + " zapisane binarnie: " + Integer.toBinaryString(i));
        System.out.println(c + " zapisane jako int: " + i);
    }

    public static void main(String[] args) {
	// write your code here



        int x = 0x80000000;
        int z = Integer.MAX_VALUE;

        //Excercise 10:
        int i = 32, j = 32;
        while (i >= 0){
            System.out.println(i + ": " + Integer.toBinaryString(x));
            x >>>= 1;
            i--;
        }

        //Excercise 11:
        System.out.println(Integer.toBinaryString(z));
        z <<= 1;
        while (j >= 0){
            System.out.println(j + ": " + Integer.toBinaryString(z));
            z >>>= 1;
            j--;
        }

        //Excercise 12:
        char s = 'D';
        char a = 'a';
        char b = 'b';
        char c = 'c';
        char g = 'g';

        Chartobin(s);
        Chartobin(a);
        Chartobin(b);
        Chartobin(c);
        Chartobin(g);


    }



}
