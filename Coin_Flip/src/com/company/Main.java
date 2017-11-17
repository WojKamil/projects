package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rNumber = new Random();
        int i = rNumber.nextInt(2);
        System.out.println("Wynik rzutu moneta: " + i);
    }
}
