/*
Exercise 8: (1) Create a class with two methods. Within the first method, call the second method twice: the first time without using this,
and the second time using this—just to see it working; you should not use this form in practice.

Exercise 9: (1) Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
 */

package com.company;

class Bird{
    Bird(){
        this("beerdy");
        System.out.println("Bird name is beerdy");
    }
    Bird(String s){
        System.out.println("Bird name is: " + s);
    }

    void squek(){
        sound();
        this.sound();
    }
    void sound(){
        System.out.println("bird goes: tweet");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Bird().squek();
    }
}
