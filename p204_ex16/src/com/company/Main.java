package com.company;

class Amphibian {
    String name;
    Amphibian(String s){
        name = s;
        System.out.println("Amphibian constructor, Amphibian name: " + s);
    }
    void makesound(){
        System.out.println("amphibian sound");
    }
    static void squeze(Amphibian a){
        a.makesound();
    }
}

class Frog extends Amphibian {
    Frog(String s){
        super(s);
    }
    void makesound(){
        System.out.println("ribbit");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code
        Frog frog = new Frog("frog");
        Amphibian.squeze(frog);
    }
}
