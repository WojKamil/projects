package com.company;

class Cleanser{
    private String s = "Cleanser";
    public void append(String a){ s += a; }
    public void dilute() { append(" dilute()");}
    public void apply() { append(" apply");}
    public void scrub() { append(" scrub()");}
    public String toString() {return s;}
    public static void main(String[] args ){
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser{
    //change a method:
    public void scrub(){
        append(" Detergent.scrub()");
        //base-class version
        super.scrub();
    }
    //add methods to the interface:
    public void foam(){ append(" foam()");}
    //test new class:
    public static void main(String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

class UltraDetergent extends Detergent{
    public void scrub(){
        append(" overrided ultradetergent.scrub()");
    }
    public void sterilize(){ append(" sterilize()");}
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Detergent.main(args);
        UltraDetergent a = new UltraDetergent();
        a.scrub();
        a.sterilize();
        System.out.println(a);
    }
}
