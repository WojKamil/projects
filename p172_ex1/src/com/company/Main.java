/*
Exercise 1: (1) Create a class in a package. Create an instance of your class outside of that package.

Exercise 2: (1) Take the code fragments in this section and turn them into a program, and verify that collisions do in fact occur.

Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a debug( ) method. The first version displays its String argument to the console,
the second does nothing. Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
 */

package com.company;
import test.*;
import test.Vector;

//AD. 3
// change this between debug|debugoff to make changes
import debug.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AD. 1
        start s = new start();
        s.start();

        new drukuj();

        //AD. 2
        // new Vector(); <- complain because it's ambigious
        //******************************************************
        //or at least it was, because now compiler takes Vector form test?!
        //new Vector();
        java.util.Vector v = new java.util.Vector();
        test.Vector b = new test.Vector();

        //AD. 3
        testclass te = new testclass("a");
        te.debug();

        new testclass("daso").debug();
    }
}
