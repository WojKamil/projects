package com.company;


class StaticTest{
    static int i = 47;
}


class Incermentable{
    static void increment(){
        StaticTest.i++;
    }
}

public class Main {

    class ATypeName { /* Class body goes here */ }
    ATypeName a = new ATypeName();

    static class DataOnly {
        int i;
        double d;
        boolean b;

        int storage(String s) {
            return s.length() * 2;
        }
    }



    static int storage2(String s) {
        return s.length() * 2;
    }


    public static void main(String[] args) {

	// write your code here

        DataOnly data = new DataOnly();

        System.out.println(StaticTest.i);
        Incermentable.increment();


        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);


        System.out.println(StaticTest.i);
        StaticTest.i++;
        System.out.println(StaticTest.i);
        System.out.println(st1.i);
        System.out.println(st2.i);
        data.i = 43;
        data.d = 1.1;
        data.b = false;
        int dlugosc = storage2("opcja");
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
        System.out.println(data.storage("tata"));
        System.out.println(storage2("tri"));
        System.out.println(dlugosc);

    }

}
