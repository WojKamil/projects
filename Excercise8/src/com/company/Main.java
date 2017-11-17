package com.company;

class baza{
    static int liczbazolniezy  = 200;

    void walka(){
        int x = 5, y = liczbazolniezy, z = 0;
        z = y - x;
        liczbazolniezy = z;
    }
    void wojna(){
        int i = 100;
        Integer licz = new Integer(i);

        Integer liczba = new Integer(100);
    }
}



public class Main {

    public static void main(String[] args) {
        baza afg = new baza();
        afg.walka();
        baza irq = new baza();
        System.out.println(irq.liczbazolniezy);
        // write your code here
    }
}
