package com.company;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.SOUTH, new JButton("South"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.CENTER, new JButton("Center"));
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
        SwingConsole.run(new Main(), 300, 250);
    }
}
