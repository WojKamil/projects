/*
Class Book is an example from p.144

Exercise 10: (2) Create a class with a finalize( ) method that prints a message. In main( ),
create an object of your class. Explain the behavior of your program.

Exercise 11: (4) Modify the previous exercise so that your finalize( ) will always be called.

Exercise 12: (4) Create a class called Tank that can be filled and emptied,
and has a termination condition that it must be empty when the object is cleaned up.
Write a finalize( ) that verifies this termination condition. In main( ),
test the possible scenarios that can occur when your Tank is used.
 */

package com.company;

class Book{
    boolean borrowed = false;
    Book(boolean borrow){
        borrowed = borrow;
    }
    void giveback(){
        borrowed = false;
    }
    protected void finalize(){
        if(borrowed){
            System.out.println("error: borrowed");
        }
    }
}

class Bird{
    protected void finalize(){
        System.out.println("Bird method finalize");
    }
}

class Tank{
    boolean filled = false;
    Tank(boolean fill){
        filled=fill;
    }
    void fill(){
        filled = true;
    }
    void empty(){
        filled=false;
    }
    protected void finalize(){
        if(filled){
            System.out.println("Error: tank is filled");
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book novel = new Book(true);
        novel.giveback();
        new Book(true);

        //AD. 10 only purpose of class Bird is to say 'bird method finalize" if finalize will be called because it is not called every time.
        //But if it will be called it can be used to bugfixing as shown in Book class example above!
        new Bird();

        //AD. 12
        Tank t1 = new Tank(true);
        Tank t2 = new Tank(false);
        Tank t3 = new Tank(true);
        Tank t4 = new Tank(false);
        //only this below works?!
        new Tank(true);

        t1.empty();
        t2.fill();

        t4.fill();
        t4.empty();

        System.gc();
        //AD. 11 this may run your finalization but it is not guaranteed!
        System.runFinalization();
    }
}
