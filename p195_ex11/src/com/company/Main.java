package com.company;
/*
Exercise 11: (3) Modify Detergent.java so that it uses delegation.
 */
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

class DetergentDelegation{
    private Cleanser cleanser = new Cleanser();
    public void append(String a){
        cleanser.append(a);
    }
    public void dilute(){
        cleanser.dilute();
    }
    public void apply(){
        cleanser.apply();
    }
    public String toString(){
        return cleanser.toString();
    }
    public void scrub(){
        cleanser.append(" DetergentDelegation.scrub");
        cleanser.scrub();
    }
    public void foam(){
        cleanser.append(" foam()");
    }

    public static void main(String[] args) {
        // write your code here
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
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

public class Main {

    public static void main(String[] args) {
	// write your code here
        DetergentDelegation.main(args);
    }
}
