package com.company;
import outpakcage.*;

class inpackage extends outpackageclass {
    void p1() {
        print1();
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        outpackageclass m1 = new outpackageclass();
        //m1.print1();
        inpackage n1 = new inpackage();
        n1.p1();

    }
}
