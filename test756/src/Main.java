import java.util.*;

public class Main {

    public static void main(String[] args) {
        int ARGB = 370208;
        int length = String.valueOf(ARGB).length();
        if(length==6) {
            String temp = Integer.toString(ARGB);
            System.out.println("Green index is: " + temp.substring(2, 4));
        }else if (length==8){
            String temp = Integer.toString(ARGB);
            System.out.println("Green index is: " + temp.substring(4,6));
        }else {
            System.out.println("Wrong format");
        }
    }
}
