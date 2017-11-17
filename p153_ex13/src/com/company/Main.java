/*
The static initializers for Cups run when either the access of the static object cup1 occurs on the line marked (1),
or if line (1) is commented out and the lines marked (2) are uncommented.
If both (1) and (2) are commented out, the static initialization for Cups never occurs,
as you can see from the output. Also, it doesn’t matter if one or both of the lines marked (2) are uncommented;
the static initialization only occurs once.

Exercise 13: (1) Verify the statements in the previous paragraph.

Exercise 14: (1) Create a class with a static String field that is initialized at the point of definition,
and another one that is initialized by the static block.
Add a static method that prints both fields and demonstrates that they are both initialized before they are used.

Exercise 15: (1) Create a class with a String that is initialized using instance initialization.
 */
package com.company;

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}

class instanceInitialization{
    String s;
    {
        s ="String initialized using instance initialization";
    }
    instanceInitialization(){
        System.out.println(s);
    }
}

public class Main {

    //AD. 14
    static String s = "point of definition";
    static String ss;
    static {
        ss = "static block";
    }
    //end of ad. 14

    public static void main(String[] args) {
	// write your code here
        System.out.println("Inside main()");
        Cups.cup1.f(99); // (1)

        //AD. 14
        System.out.println("s: " + s);
        System.out.println("ss: " + ss);
        //end of AD. 14

        //AD. 15
        new instanceInitialization();
    }
// static Cups cups1 = new Cups(); // (2)
// static Cups cups2 = new Cups(); // (2)
}
