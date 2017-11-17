package kolkoIKrzyzyk.gra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
	// write your code here
        /*

        String Player0, Player1;
        System.out.println("Podaj imie/nick: ");
        Scanner odczyt = new Scanner(System.in);

        Player0 = odczyt.nextLine();

        System.out.println("Witaj "+ Player0);

        */

        //odczyt z pliku
        /*
        File plik = new File("ala.txt");
        Scanner odczyt = new Scanner(plik);
        String zdanie = odczyt.nextLine();
        System.out.println(zdanie);
        */

        /*
        Scanner odczytImienia = new Scanner(System.in);
        String Imie = odczytImienia.nextLine();

        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println(Imie);
        zapis.close();

        //odczytImienia = new Scanner(new File("ala.txt"));
        //Imie = new Scanner(new File("ala.txt")).nextLine();
        System.out.println(new Scanner(new File("ala.txt")).nextLine());
        */

        /*
        String[] tablicaImion = new String[5];
        for (int i = 0; i<tablicaImion.length; i++){
            tablicaImion[i] = new Scanner(System.in).nextLine();
        }
        for (int i = 0; i < tablicaImion.length; i++)
            System.out.println("Witaj "+tablicaImion[i]);

        */


        int[] tablicaIntow = new int[new Scanner(System.in).nextInt()];
        int i = 0;
        while (i<tablicaIntow.length){
            int j = 0;
            System.out.println(tablicaIntow[i]);
            tablicaIntow[j] = j;
            i++;
            j++;
        }

        /*
        int[] tablicaInt;
        Scanner input = new Scanner(System.in);
        int dlugoscTab = input.nextInt();
        tablicaInt = new int[dlugoscTab];
        int i = 0;
        for (int j = 0; j<tablicaInt.length; j++)
            tablicaInt[j] = j;
        while (i<tablicaInt.length){
            System.out.println(tablicaInt[i]);
            i++;
        }
        */



    }
}
