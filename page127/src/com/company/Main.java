package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random(47);
        for(int i=0; i<100; i++){
            int c = rand.nextInt(26) + 'a';
            System.out.print((char)c + ", " + c + ": ");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'w':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("Consonant");

            }
        }
    }
}
