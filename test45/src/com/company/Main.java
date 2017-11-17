package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {
    /*public Main() {
        setLayout(new FlowLayout());
        for(int i = 0; i < 20; i++)
            add(new JButton("Button " + i));
    }
    public static class SwingConsole {
        public static void run(final JFrame f, final int width, final int height) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    f.setTitle(f.getClass().getSimpleName());
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setSize(width, height);
                    f.setVisible(true);
                }
            });
        }
    }

    public static void main(String[] args) {
        // write your code here
        SwingConsole.run(new Main(), 300, 300);
    }
    */
    System.out.print("Podaj liczbe: ");
    Scanner keyboardInput = new Scanner(System.in);
    byte wrt = keyboardInput.nextByte();
    for(int i=6; i>=0; i--){
        System.out.println((wrt>>i)%2 * (int)Math.pow(2, i));
    }
}
