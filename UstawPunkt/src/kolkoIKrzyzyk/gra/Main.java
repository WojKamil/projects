package kolkoIKrzyzyk.gra;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Punkt punkt = new Punkt();
        punkt.ustawX(10);
        punkt.ustawY(25);

        System.out.println("Wspolrzedne punktu to: " +punkt.podajX()+" "+punkt.podajY());

        //Pracownik pracownik1 = new Pracownik();
        //Pracownik pracownik2 = new Pracownik();
        //Pracownik pracownik3 = new Pracownik();

        Pracownik[] tabPracownikow = new Pracownik[3];

        String[] tabImion = {"Jan","Kazmirz","Boris"};
        String[] tabNazwisk = {"Ivanov","Jaskolka","Danielow"};
        int[] tabWieku = {44,57,64};

        for(int i=0; i<tabPracownikow.length; i++){
            tabPracownikow[i] = new Pracownik();
            tabPracownikow[i].Imie = tabImion[i];
            tabPracownikow[i].Nazwisko = tabNazwisk[i];
            tabPracownikow[i].Wiek = tabWieku[i];
        }

        System.out.println("Pracownicy firmy to: ");
        for(int i=0;i<tabPracownikow.length; i++){
            System.out.println(tabPracownikow[i].Imie+" "+tabPracownikow[i].Nazwisko+" "+tabPracownikow[i].Wiek+" lat.");
        }

        /*
        pracownik1.Imie = "Jan";
        pracownik1.Nazwisko = "Kowalski";
        pracownik1.Wiek = 45;

        pracownik2.Imie = "Janusz";
        pracownik2.Nazwisko = "Mirecki";
        pracownik2.Wiek = 65;
        */

    }
}
