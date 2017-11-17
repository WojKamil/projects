package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
