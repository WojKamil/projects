package com.company;

public class Main {

    static class Dog{
        String name;
        String says;
    }

    public static void main(String[] args) {
	// write your code here
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "spot";
        d2.name = "scruff";
        d1.says = "Ruff!";
        d2.says = "Wurf!";
        System.out.println("Dog 1: " + d1.name + " says: " + d1.says);
        System.out.println("Dog 2: " + d2.name + " says: " + d2.says);
        Dog d3 = new Dog();
        d3.name = d1.name;
        d3.says = "Woof!";
        System.out.println("Dog 3: " + d3.name + " says: " + d3.says);
        System.out.println("d3 ==: " + (d3 == d1));
        System.out.println("d3 equals: " + (d3.equals(d1)));
        System.out.println("name ==: " + (d3.name == d1.name));
        System.out.println("name equals: " + (d3.name.equals(d1.name)));
        System.out.println("says ==: " + (d3.says == d1.says));
        System.out.println("says equals: " + (d3.says.equals(d1.says)));


    }
}
