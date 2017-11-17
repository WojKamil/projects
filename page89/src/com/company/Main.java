package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Create a seeded random number generator:
        Random mLosujaca = new Random(47);
        int i, j , k;
        //chose value from 1 to 100;
        j = mLosujaca.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = mLosujaca.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j + k: " + i);
        i = j - k;
        System.out.println("j - k: " + i);
        i = j / k;
        System.out.println("j / k: " + i);
        i = j * k;
        System.out.println("j * k: " + i);
        i = j % k;
        System.out.println("j % k: " + i);
        i = j %= k;
        System.out.println("j %= k: " + i);
        //floating point number tests:
        float u, v, w;
        v = mLosujaca.nextFloat();
        System.out.println("v: " + v);
        w = mLosujaca.nextFloat();
        System.out.println("w: " + w);
        u = v + w;
        System.out.println("v + w: " + u);
        u = v - w;
        System.out.println("v - w: " + u);
        u = v * w;
        System.out.println("v * w: " + u);
        u = v / w;
        System.out.println("v / w: " + u);
        //The following also works for char
        //byt short int long and double
        u += v;
        System.out.println("u += v: " + u);
        u -= v;
        System.out.println("u -= v: " + u);
        u *= v;
        System.out.println("u *= v: " + u);
        u /= v;
        System.out.println("u /= v: " + u);


    }
}
