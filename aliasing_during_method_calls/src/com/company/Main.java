package com.company;

class Letter{
    char c;
}

class zprzecinkiem{
    float liczb;
}

public class Main {
    static void funct(Letter y){
        y.c ='z';
    }

    public static void main(String[] args) {
	// write your code here
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        funct(x);
        System.out.println("2: x.c: " + x.c);
    }
}
