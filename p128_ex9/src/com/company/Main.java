package com.company;

public class Main {

    static int Fibonacci(int n){
        switch (n){
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
	// write your code here
        //int d =Integer.parseInt(args[0]);

        int d = 45;

        long startTime = System.currentTimeMillis();
        for(int i = 1; i<=d; i++){
            long start=System.currentTimeMillis();
            System.out.println(i + ": " + Fibonacci(i));
            long stopTime = System.currentTimeMillis();
            System.out.println("Elapsed time was " + (stopTime - start) + " miliseconds.");
            System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds.");
        }



    }
}
