package com.company;

class Root{
    Root(){
        System.out.println("Root constructor");
    }
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();
    void dispose(){
        System.out.println("Root dispose");
        com3.dispose();
        com2.dispose();
        com1.dispose();
    }

}

class Component1{
    Component1(){
        System.out.println("Component1 constructor");
    }
    void dispose(){
        System.out.println("Component1 dispose");
    }
}

class Component2{
    Component2(){
        System.out.println("Component2 constructor");
    }
    void dispose(){
        System.out.println("Component2 dispose");
    }
}

class Component3{
    Component3(){
        System.out.println("Component3 constructor");
    }
    void dispose(){
        System.out.println("Component3 dispose");
    }
}

class Stem extends Root{
    Stem(){
        System.out.println("Stem constructor");
    }
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();

    void dispose(){
        System.out.println("Stem.dispose()");
        com3.dispose();
        com2.dispose();
        com1.dispose();
        super.dispose();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stem stem1 = new Stem();
        stem1.dispose();
    }
}
