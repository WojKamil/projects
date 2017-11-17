package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Excercise 1: ");

        //Excercise 1
        for (int i = 1; i <=100; i++){
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Excercise 2: ");

        //Excercise 2
        Random generator = new Random(2);
        int b = generator.nextInt(47);
        System.out.println("Rnd static: " + b);
        for(int i = 1; i <= 25; i++){
            int a = generator.nextInt(47);
            System.out.println("Rnd var nr " + i + ": " + a);
            if(a==b)
                System.out.println(a + "=" + b);
            else if(a>b)
                System.out.println(a + ">" + b);
            else
                System.out.println(a + "<" + b);
        }

        /*
        System.out.println("");
        System.out.println("Excercise 3: ");

        //Excercise 3
        Random generator2 = new Random();
        int c = generator2.nextInt(47);
        System.out.println("Rnd static: " + c);
        int i = 1;
        while(i>0){
            int a = generator2.nextInt(47);
            System.out.println("Rnd var nr " + i + ": " + a);
            if(a==c)
                System.out.println(a + "=" + c);
            else if(a>c)
                System.out.println(a + ">" + c);
            else
                System.out.println(a + "<" + c);
            i++;
        }
        */

        System.out.println("");
        System.out.println("Excercise 4: ");

        //Excercise 4
        int ilosc = 100;
        for(int i=1; i<ilosc; i++){

            boolean isPrime = true;

            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        }

        System.out.println("");
        System.out.println("Excercise 5: ");

        //Excercise 5 not done!!!!
        int n1 = 0xAAAAAAAA;
        int n2 = 0x55555555;

        System.out.println("n1= " + Integer.toBinaryString(n1));
        System.out.println("n2= " + Integer.toBinaryString(n2));
        System.out.println("n1&n2= " + Integer.toBinaryString(n1&n2));
        System.out.println("n1|n2= " + Integer.toBinaryString(n1|n2));
        System.out.println("n1^n2= " + Integer.toBinaryString(n1^n2));
        System.out.println("~n1= " + Integer.toBinaryString(~n1));
        System.out.println("~n2= " + Integer.toBinaryString(~n2));
        System.out.println("n1&=n2= " + Integer.toBinaryString(n1&=n2));
        System.out.println("n1|=n2= " + Integer.toBinaryString(n1|=n2));
        System.out.println("n1^=n2= " + Integer.toBinaryString(n1^=n2));

    }

}
