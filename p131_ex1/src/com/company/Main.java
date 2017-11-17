package com.company;

public class Main {


    public static class Kot{
        String imie = "koteł";
        String nazwisko;
        Kot(String b){
            nazwisko = b;
        }
    }


    public static void main(String[] args) {
	// write your code here
        Kot kot1 = new Kot("aabla");
        Kot kicia = new Kot("kotełeł");
        System.out.println(kicia.imie);
        System.out.println(kicia.nazwisko);

    }
}
