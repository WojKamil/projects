import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String tab1[], tab2[], tab3[], tab4[];
        tab1 = new String[]{"Hui s gory", "Yebenko", "Pizdiec", "Idiota kusok", "V rot mne nogi", "Odnohuystvenno", "Zaebis", "Yobannye passatizhi"};
        tab2 = new String[]{"Vyperdysch", "I hooly", "Nu naher", "Pizda rulyu", " yoptel-mopsel", "Nu ohuet teper", "Hitrovyebannyi", "Idi nahuey"};
        tab3 = new String[]{"Zalupa konskaya", "Hooy morzhovy", "Nu vse, tebe pizda", "Ti Durak", "Pidaras", "Pashol na khui", "Huy tebye v glaz!", "Yobanaya suka!"};
        tab4 = new String[]{"Nu kak", "Blyat", "Eta kak suka", "Woto na blyat", "Eta pizdiec", "Ja jebau lja", "Nu blyat", "Woto na blyat"};

        Random rand = new Random();
        int n,m,o,p;
        for (int i = 0; i<=10; i++){
            n = rand.nextInt(8);
            m = rand.nextInt(8);
            o = rand.nextInt(8);
            p = rand.nextInt(8);
            System.out.println(tab3[n]+" "+tab2[m]+" "+tab4[p]+" "+tab1[o]);
        }


    }
}
