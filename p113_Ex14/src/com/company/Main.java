package com.company;

public class Main {

    public static void StringCompare(String s, String t){
        System.out.println((s + " == " + t) + " is " + (s==t));
        System.out.println((s + " != " + t) + " is " + (s!=t));
        System.out.println((s + " equals() " + t) + " is " + s.equals(t));
    }


    public static void main(String[] args) {
	// write your code here
        String str1 = "test";
        String str2 = "abla";
        StringCompare(str1, str2);
        StringCompare("habla", "abla");

    }
}
