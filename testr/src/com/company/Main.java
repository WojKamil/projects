package com.company;

class classforref{
    private String s;
    classforref(){
        System.out.println("classforref()");
        s = "Constructed";
    }
    public String toString() { return s; }
}

class classtoini{
    private String
            s2,
            s3;
    private classforref newdelayedref;
    classtoini(){
        System.out.println("classtoini()");
        s2 = "ha";
        newdelayedref = new classforref();
    }
    public String toString() {
        s3 = "delayed initializaion";
        return
                "s2= " + s2 + "\n" + "s3= " + s3 + "\n" + "newdelayedref= " + newdelayedref;
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        classtoini ini = new classtoini();
        System.out.println(ini);

    }
}
