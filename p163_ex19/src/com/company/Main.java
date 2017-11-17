/*
Exercise 19: (2) Write a method that takes a vararg String array. Verify that you can pass either a comma-separated list of Strings or a String[] into this method.

Exercise 20: (1) Create a main( ) that uses varargs instead of the ordinary main( ) syntax.
Print all the elements in the resulting args array. Test it with various numbers of command-line arguments.

Exercise 21: (1) Create an enum of the least-valuable six types of paper currency. Loop through the values( ) and print each value and its ordinal( ).

Exercise 22: (2) Write a switch statement for the enum in the previous example. For each case, output a description of that particular currency.
 */
package com.company;

class printOnScreen{
    printOnScreen(String... arg){
        for(String s : arg){
            System.out.println(s);
        }
    }
}


//AD. 21
enum Currency{
    JEDEN, DWA, PIEC, DZIESIEC, DWADZIESCIA, PIECDZIESIAT, STO, DWIESCIE
}

//AD. 22
class Banknot{
    Currency value;
    Banknot(Currency value){
        this.value = value;
    }
    void describe(){
        System.out.print("Opis Banknotu " + value + ": ");
        switch (value){
            case JEDEN:
                System.out.println("wartosc 1, pierwszy liczac od najnizszych");
                break;
            case DWA:
                System.out.println("wartosc 2, drugi liczac od najnizszych");
                break;
            case PIEC:
                System.out.println("wartosc 5, trzeci liczac od najnizszych");
                break;
            case DZIESIEC:
                System.out.println("wartosc 10, czwarty liczac od najnizszych");
                break;
            case DWADZIESCIA:
                System.out.println("wartosc 20, piaty liczac od najnizszych");
                break;
            case PIECDZIESIAT:
                System.out.println("wartosc 50, szosty liczac od najnizszych");
                break;
            case STO:
                System.out.println("wartosc 100, siodmy liczac od najnizszych");
                break;
            case DWIESCIE:
                System.out.println("wartosc 200, osmy liczac od najnizszych");
                break;
            default:
                System.out.println("moze nie ma takiego banknotu?");
        }
    }


}

public class Main {

    public static void main(String... args) {
	// write your code here
        new printOnScreen("cat", "bird", "dog");
        String[] napisy = {
                new String("cat cat"),
                new String("bird bird"),
                new String("dod dog"),
        };
        new printOnScreen(napisy);
        new printOnScreen(args);

        //AD. 21
        for(Currency i : Currency.values()){
            System.out.println("Currency values: " + i + " is : " + i.ordinal());
        }

        //AD. 22
        Banknot
                pierwszy = new Banknot(Currency.JEDEN),
                drugi = new Banknot(Currency.DWA),
                trzeci = new Banknot(Currency.PIEC),
                czwarty = new Banknot(Currency.DZIESIEC),
                piaty = new Banknot(Currency.DWADZIESCIA),
                szosty = new Banknot(Currency.PIECDZIESIAT),
                siodmy = new Banknot(Currency.STO),
                osmy = new Banknot(Currency.DWIESCIE);
        pierwszy.describe();
        drugi.describe();
        trzeci.describe();
        czwarty.describe();
        piaty.describe();
        szosty.describe();
        siodmy.describe();
        osmy.describe();
    }
}

/* *********************************************PRZYKLAD DO ZADAN!!!********************************************

public enum Spiciness {
NOT, MILD, MEDIUM, HOT, FLAMING
}

////////////////////////////////////////////////////////////////////

public class EnumOrder {
public static void main(String[] args) {
for(Spiciness s : Spiciness.values())
System.out.println(s + ", ordinal " + s.ordinal());
}
} /* Output:
NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4

/////////////////////////////////////////////////////////////////

public class Burrito {
Spiciness degree;
public Burrito(Spiciness degree) { this.degree = degree;}
public void describe() {
System.out.print("This burrito is ");
switch(degree) {
case NOT: System.out.println("not spicy at all.");
break;
case MILD:
case MEDIUM: System.out.println("a little hot.");
break;
case HOT:
case FLAMING:
default: System.out.println("maybe too hot.");
}
}
public static void main(String[] args) {
Burrito
plain = new Burrito(Spiciness.NOT),
greenChile = new Burrito(Spiciness.MEDIUM),
jalapeno = new Burrito(Spiciness.HOT);
plain.describe();
greenChile.describe();
jalapeno.describe();
}
} /* Output:
This burrito is not spicy at all.
This burrito is a little hot.
This burrito is maybe too hot.

 */