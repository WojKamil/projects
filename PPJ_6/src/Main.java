public class Main {

    public static void main(String[] args) {
	// write your code here
        //====================zad1
        //deklaracja i inicjalizacja tablicy oraz wypelnienie jej losowo zerami i jedynkami
        int tab1[] = new int[10];
        for(int i = 0; i < tab1.length;i++){
            tab1[i]=(int)(Math.random()*2);
            //Print jest opcjonalny
            //System.out.println(tab1[i]);
        }

        //====================zad2
        //przejscie po tablicy z zad1, sprawdzenie ile jest zer i ile jedynek
        int licznik2=0;
        for(int i = 0; i<tab1.length;i++){
            if(tab1[i]==0){
                licznik2++;
            }
        }
        //Print jest opcjonalny
        //System.out.println("Ilosć zer: "+licznik2+" ilosc jedynek: "+(tab1.length-licznik2));

        //========================zad3
        //zadeklaruj talbice o losowej dlugosci, losowanej przy uruchomieniu, oraz sprawdz i wypisz dlugosc tablicy
        int tab3[] = new int[((int)(Math.random()*11))];
        System.out.println("Dlugosc tablicy: " + tab3.length);

        //========================zad4
        //zadeklaruj tablice double o dlugosci 10, wypelnij losowymi liczbami, wypisz tablice, wypisz tylko parzyste indeksy, wypisz tylko elementy , ktore po konwersji na in sa nieparzyste
        double tab4[] = new double[10];
        for(int i = 0; i<tab4.length;i++){
            tab4[i]=Math.random()*11;
            System.out.println(tab4[i]);
        }
        //Print jest opcjonalny, dla jasnosci zapisu tylko
        //System.out.println();

        for(int i = 0;i< tab4.length;i++){
            //zmienna tymczasowa, do sprawdzenia warunku z konwersja

            if(i%2==0){
                System.out.println(tab4[i]);
            }
        }

        //Print jest opcjonalny, dla jasnosci wydruku tylko
        //System.out.println();

        for(int i = 0; i<tab4.length;i++){
            int temp;
            temp = (int)tab4[i];
            if(temp%2!=0){
                System.out.println(tab4[i]);
            }
        }

        //Print jest opcjonalny, dla jasnosci wydruku tylko
        //System.out.println();

        //To samo zadanie, mniej czytelny wynik ale jedna petla
        for(int i = 0; i<tab4.length;i++){
            //wypelnienie i wypisanie tablicy
            tab4[i]=Math.random()*11;
            System.out.println("Wartosc tab4["+i+"]: "+tab4[i]);
            //wypisanie wartosci parzystych indeksow tablicy
            if(i%2==0){
                System.out.println("Wypisanie wartosci parzystego indeksu (wartosc i: "+i+"): "+tab4[i]);
            }
            //wypisanie wartosci, ktore po konwersji na int byly nieparzyste
            int temp= (int)tab4[i];
            if(temp%2!=0){
                //Print jest opcjonalny
                //System.out.println("wartosc po konwersji na int: "+temp);
                //ten jest obowiazkowy, do zadania
                System.out.println("Element, ktory po konwersji na int jest nieparzysty: "+tab4[i]);
            }
        }

        //===========================================zad5
        //dana jest tablica[]={1,0,0,0,2,0,0,0,3}; wyswietl w podany sposob: 123 na przekatnej z lewej gory na prawy dol, 123 z lewego dolu na prawa gore, 321 z lewej gory na prawy dol

        int tab5[]={1,0,0,0,2,0,0,0,3};
        for(int i = 0;i<tab5.length;i++){
            //wypisanie pierwszym sposobem, co trzecia wypisana wartosc jest zlamanie linii
            if((i+1)%3==0&i!=0){
                System.out.println(tab5[i]+" ");
            }else{
                System.out.print(tab5[i]+" ");
            }
        }

        //Print jest opcjonalny, dla jasnosci wydruku tylko
        System.out.println();

       for(int i=2;i>=0;i--){
           //drugi sposob wypisania
           for(int j = 0;j<=2;j++){
               if(j==0){
                   System.out.print(tab5[i]+" ");
               }else{
                   System.out.print(tab5[i+(j*3)]+" ");
               }
           }
           System.out.println();
       }

        //Print jest opcjonalny, dla jasnosci wydruku tylko
        System.out.println();

        for(int i = tab5.length-1;i>=0;i--){
            //trzeci sposob, zwykle odliczenie od konca
            if(i%3==0){
                System.out.println(tab5[i]);
            }else {
                System.out.print(tab5[i]+" ");
            }
        }

        //=========================================zad6
        //kompilator zglosi blad poniewaz tablica jest zdefiniowana ale brakuje inicjalizacji

        //int tab6[];
        //Syste.out.println(tab6);

        //==========================================zad7

        //Print jest opcjonalny, dla jasnosci wydruku tylko
        System.out.println();

        //program wypisze 3 wyniki dzialan odejmowania: pierwszego i pierwszego elementu, pierwszego i drugiego oraz pierwszego i trzeciego,
        //nastepnie dwa wyniki: drugiego i grugiego oraz grugiego i trzeciego, oraz w ostatnim rzucie wynik trzeciego i trzeciego elementu
        int tab7[] = {789, 678,567};
        for(int i=0;i<tab7.length;i++) {
            //Print jest opcjonalny, dla jasnosci wydruku tylko
            System.out.println("Iteracja nr: " + (i+1));
            for (int j = i; j < tab7.length; j++)
                System.out.println(tab7[i] - tab7[j]);
        }
        //Print jest opcjonalny, dla jasnosci wydruku tylko
        System.out.println();

        //======================================zad8
        //sprawdzic czy wszystkie wartosci poza glowna przekatna sa zerami
        int tab8[][] = {{1,0,0},{0,1,0},{0,0,1}};
        boolean czyDiagonalna = true;
        for(int i = 0; i<tab8.length;i++){
            for(int j=0; j<tab8[i].length; j++){
                if(i!=j){
                    if(tab8[i][j]!=0){
                        //jesli jakas wartosc poza przekatna jest rozna od zera to:
                        czyDiagonalna=false;
                    }
                }
            }
        }
        System.out.println("Czy tablica jest diagonalna? "+czyDiagonalna);
        System.out.println();
        System.out.println();

        //========================================zad9
        //sprawdzenie czy na przekatnych tablicy sa dwie takie same wartosci
        int tab9[][] = new int[5][5];
        boolean przekatna1 = false;
        boolean przekatna2 = false;

        for(int i =0; i<tab9.length; i++){
            for(int j=0;j<tab9[i].length;j++){
                //wypelnienie tablicy wartosciami losowymi
                tab9[i][j]=(int)(Math.random()*10);
                System.out.print(tab9[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<tab9.length;i++){
            //sprawdzenie jednej przekatnej (\)
            for(int j=i; j<tab9[i].length-1; j++){
                if (tab9[i][i]==tab9[j+1][j+1]) {
                    przekatna1 = true;
                }
            }
        }
        for(int i=0; i<tab9.length;i++){
            //sprawdzenie drugiej przekatnej (/)
            for(int j=i; j<tab9[i].length-1; j++){
                if (tab9[i][(tab9.length-1)-i]==tab9[j+1][(tab9[i].length-1)-(j+1)]) {
                    przekatna2 = true;
                }
            }
        }
        System.out.println("Czy na przekatnej 1 sa conajmniej dwie takie same wartosci? "+przekatna1);
        System.out.println("Czy na przekatnej 2 sa conajmniej dwie takie same wartosci? "+przekatna2);

        //==================================zad10
        //sprawdz tablice z zad9 czy suma dowolnego wiersza jest rowna sumie ktorejs kolumny
        boolean sumaKolumnyIWiersza = false;
        for(int i=0; i<tab9.length;i++){
            //przejscie po wszystkich wierszach kolejno
            int sumaWiersza=0, sumaKolumny=0;
            for(int j=0; j<tab9[i].length;j++){
                //wyliczenie sumy dla i-tego wiersza
                sumaWiersza=sumaWiersza+tab9[i][j];
            }
            for(int j=0;j<tab9.length;j++){
                //sprawdzenie kolejno dla wszystkich kolumn
                //czy suma danego wiersza jest rowna ktorejs sumie z kolumn
                for(int k =0;k<tab9.length;k++){
                    //wyliczenie sumy dla j-tej kolumny
                    sumaKolumny=sumaKolumny+tab9[k][j];
                }
                if(sumaKolumny==sumaWiersza&sumaKolumny!=0){
                    sumaKolumnyIWiersza=true;
                    System.out.println(sumaKolumny+" "+sumaWiersza);
                    System.out.println("i: "+i+" j: "+j);
                }
                sumaKolumny=0;
            }
        }
        System.out.println("Czy suma dowolnego wiersza i ktorejs z kolumn jest taka sama? "+sumaKolumnyIWiersza);

    }
}
