package com.company;

class Pen{
    void write(){
        System.out.println("write");
    }
    void write(String s){
        System.out.println(s);
    }
    void write(int i){
        System.out.println(i);
    }
}

class Pen2 extends Pen{
    void write(char c){
        System.out.println(c);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Pen2 p2 = new Pen2();
        p2.write();
        p2.write('a');
        p2.write(4);
        p2.write("abla");
    }
}
