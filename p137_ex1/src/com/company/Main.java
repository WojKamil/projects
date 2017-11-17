/*
Exercise 3: (1) Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of this class.

Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.

Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based on various primitive data types,
and print different types of barking, howling, etc., depending on which overloaded version is called. Write a main( ) that calls all the different versions.

Exercise 6: (1) Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types),
but in reversed order relative to each other. Verify that this works.

Exercise 7: (1) Create a class without a constructor, and then create an object of that class in main( ) to verify that the default constructor is automatically synthesized.
 */

package com.company;
    /*
    Creating class without constructor, to make java use default constructor
     */
class Cat{
        Cat(){
            System.out.println("default constructor");
        }
        //Overloading constructor
        Cat(String s){
            System.out.println("Overloaded constructor: " + s);
        }
    }

class Dog{
    void bark(int i){
        System.out.println("bark: " + i);
    }
    public static void bark(char c){
        System.out.println("howl: " + c);
    }
    void bark(int i, char c){
        System.out.println("bark: " + i + " howl: " + c);
    }
    void bark(char c, int i){
        System.out.println("howl: " + c + " bark: " + i);
    }
}

//ad. 7
class Brid{}

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Cat();
        new Cat("ziom");

        new Dog().bark(2);
        new Dog().bark('A');
        new Dog().bark('C',5);
        new Dog().bark(6,'h');

        Dog b1 = new Dog();
        b1.bark('b');
        b1.bark(4);
        b1.bark('g',90);
        b1.bark(7,'t');

        //AD. 7
        new Brid();

    }
}
