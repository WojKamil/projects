package com.company;

import java.util.*;

class Tank{
    float level;
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 2;
        t2.level = 42;
        System.out.println("1; t1.level: " + t1.level + " t2.level: " + t2.level);
        t1.level = t2.level;
        System.out.println("2; t1.level: " + t1.level + " t2.level: " + t2.level);
        t1.level = 27;
        System.out.println("3; t1.level: " + t1.level + " t2.level: " + t2.level);
    }
}
