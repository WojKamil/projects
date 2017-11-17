package com.company;

public class Main {

    //klasa strrefini zawierajaca tylko niezainicjalizowany string s!!!
    public static class strrefini{
        String s;
    }

    public static void main(String[] args) {
	// write your code here
        //utworzenie nowego obiektu klasy strrefini
        strrefini sri = new strrefini();
        //odwolanie sie/wywolanie niezainicjalizowanego stringa s obiektu sri klasystrrefini
        System.out.println("sri.s = " + sri.s);
    }
}
