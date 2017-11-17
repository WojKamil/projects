package com.company;

/*
You can see that the construction happens from the base “outward,”
so the base class is initialized before the derived-class constructors can access it.
Even if you don’t create a constructor for Cartoon( ),
the compiler will synthesize a default constructor for you that calls the base class constructor.

Exercise 3: (2) Prove the previous sentence.

Exercise 4: (2) Prove that the base-class constructors are (a) always called and (b) called before derived-class constructors.

Exercise 5: (1) Create two classes, A and B, with default constructors (empty argument lists) that announce themselves.
Inherit a new class called C from A, and create a member of class B inside C. Do not create a constructor for C.
Create an object of class C and observe the results.

Ad. 4: excercise 3&5 solves this.
 */

class Art{
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing contrsuctor");
    }
}

class Cartoon extends Drawing{
//Excercise 3:
//    public Cartoon() {
//        System.out.println("Cartoon constructor");
//    }
    public static void main(String[] args){
        Cartoon x = new Cartoon();
    }
}

//Excercise 5:
class classA{
    classA(){
        System.out.println("A constructor");
    }
}

class classB{
    classB(){
        System.out.println("B constructor");
    }
}

class classC extends classA{
    classB b = new classB();
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Cartoon.main(args);
        //Ad exc 5:
        classC c = new classC();
    }
}
