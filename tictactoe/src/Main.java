import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Witaj!\n Wlasnie rozpoczales gre w kolko i krzyzyk\n Czy masz kompana do gry?\n (podaj 1 dla tak, 2 dla nie, 0 aby zakonczyc)");
        int menu = input.nextInt();
        if (menu == 1) {
            System.out.println("Podaj nick gracza 1:");
            String player1 = input.nextLine();
            System.out.println("Podaj nick gracza 2:");
            String player2 = input.nextLine();
        }else if(menu==2){
            System.out.println("Podaj nick gracza 1:");
            String player1 = input.nextLine();
        }else if(menu==0){
            System.out.print("Dzieki za wspolprace");
        }

        if(menu==1){
            
        }

    }
}
