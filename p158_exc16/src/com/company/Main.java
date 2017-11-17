/*
Exercise 16: (1) Create an array of String objects and assign a String to each element. Print the array by using a for loop.

Exercise 17: (2) Create a class with a constructor that takes a String argument.
During construction, print the argument. Create an array of object references to this class,
but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization messages from the constructor calls are printed.

Exercise 18: (1) Complete the previous exercise by creating objects to attach to the array of references.
 */

package com.company;

//AD.17
class wypisz{
    wypisz(String s){
        System.out.println(s);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] Napisy = new String[]{
                new String("kot"),
                new String("kot kot"),
                new String("Bird")
        };
        for(int i=0; i<Napisy.length;i++){
            System.out.println("Wpis tablicy z poz." + (i+1) + " : " + Napisy[i]);
        }

        //AD.17
        wypisz[] tab = new wypisz[4];

        //AD.18
        tab[0] = new wypisz("asfge");
        tab[1] = new wypisz("erye");
        tab[2] = new wypisz("aeh");
        tab[3] = new wypisz("pl");

    }
}
