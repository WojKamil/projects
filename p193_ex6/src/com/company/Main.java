package com.company;
/*
If you don’t call the base-class constructor in BoardGame( ), the compiler will complain that it can’t find a constructor of the form Game( ).
In addition, the call to the base-class constructor must be the first thing you do in the derived-class constructor.
(The compiler will remind you if you get it wrong.)

Exercise 6: (1) Using Chess.java, prove the statements in the previous paragraph.

Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
Write a constructor for C and perform all initialization within C’s constructor.

Exercise 8: (1) Create a base class with only a non-default constructor,
and a derived class with both a default (no-arg) and non-default constructor.
In the derived-class constructors, call the base-class constructor.

Exercise 9: (2) Create a class called Root that contains an instance of each of the classes (that you also create) named Component1,
Component2, and Component3. Derive a class Stem from Root that also contains an instance of each “component.”
All classes should have default constructors that print a message about that class.

Exercise 10: (1) Modify the previous exercise so that each class only has non-default constructors.
 */

import java.util.Random;

class Game{
    Game(int i){
        System.out.println("Game constructor");
        System.out.println("i: " + i);
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        //Ad 6
        //System.out.println(i);
        super(i);
        System.out.println("BoardGame constructor");
        System.out.println("i: " + i);
    }
}

class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess constructor");
    }
}

//Ad 7
class classA{
    classA(int a){
        System.out.println("A constructor");
    }
}

class classB{
    classB(int b){
        System.out.println("B constructor");
    }
}

class classC extends classA{
    classC (){
        super(2);
    }
    classB b = new classB(3);
}

//Ad. 8
class Animal{
    Animal(String name){
        System.out.println("animal name: " + name);
    }
}

class Cat extends Animal{
    Cat(){
        super("Kotel");
    }
    Cat(String name){
        super(name);
    }
}

//Ad 9
class Root{
    Root(){
        System.out.println("Root constructor");
    }
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();
}

class Component1{
    Component1(){
        System.out.println("Component1 constructor");
    }
}

class Component2{
    Component2(){
        System.out.println("Component2 constructor");
    }
}

class Component3{
    Component3(){
        System.out.println("Component3 constructor");
    }
}

class Stem extends Root{
    Stem(){
        System.out.println("Stem constructor");
    }
}

//Ad 10
class RootMod{
    RootMod(int i){
        System.out.println("RootMod constructor: " + i);
    }
    Component1Mod com1Mod = new Component1Mod(1);
    Component2Mod com2Mod = new Component2Mod(2);
    Component3Mod com3Mod = new Component3Mod(3);
}

class Component1Mod{
    Component1Mod(int i1){
        System.out.println("Component1Mod constructor: " + i1);
    }
}

class Component2Mod{
    Component2Mod(int i2){
        System.out.println("Component2Mod constructor: " + i2);
    }
}

class Component3Mod{
    Component3Mod(int i3){
        System.out.println("Component3Mod constructor: " + i3);
    }
}

class StemMod extends RootMod{
    StemMod(int x){
        super(4);
        System.out.println("StemMod constructor: " + x);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chess x = new Chess();
        //Ad 7
        classC c = new classC();
        //Ad 8
        Cat kot1 = new Cat();
        Cat kot2 = new Cat("Kotelel");
        //Ad 9
        Stem stem1 = new Stem();
        //Ad 10
        StemMod stem1Mod = new StemMod(6);

    }
}
