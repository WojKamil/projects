package com.company;

public class Main {

    static char test(int testval, int target, int begin, int end){
        if((testval<=end) && (testval>=begin)){
            if(testval>target)
                return '>';
            else if(testval<target)
                return '<';
            else
                return '=';
        }
        else
            System.out.println("not in specified range");
        return '!';
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(test(20,20,0,20));

    }
}
