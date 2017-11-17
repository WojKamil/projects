package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0; i<5; i++){
            switch (i){
                case 0:
                    System.out.println("case: " + i);
                    //break;
                case 1:
                    System.out.println("case: " + i);
                    //break;
                case 2:
                    System.out.println("case: " + i);
                    //break;
                case 3:
                    System.out.println("case: " + i);
                    //break;
                case 4:
                    System.out.println("case: " + i);
                    //break;
                default:
                    System.out.println("default");
            }
            System.out.println("loop: " + i);
            System.out.println("");
        }
    }
}
