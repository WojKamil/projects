package com.company;

public class Main {


    public static class czlek {
        int wiek;
        char plec;

        int zwrocWiek() {
            return wiek;
        }

        char zwrocPlec() {
            return plec;
        }
    }

    public static void main(String[] args) {
        // write your code here
        czlek kamil = new czlek();
        System.out.println("plec: ");
        System.out.println(kamil.plec);
        System.out.println("wiek: ");
        System.out.println(kamil.wiek);

        czlek kamil2 = new czlek();
        kamil2.plec = 'm';
        kamil2.wiek = 20;
        System.out.println("plec: ");
        System.out.println(kamil2.plec);
        System.out.println("wiek: ");
        System.out.println(kamil2.wiek);


    }


}
