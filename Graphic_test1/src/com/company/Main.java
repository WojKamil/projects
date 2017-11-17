package com.company;
import javax.swing.*;
import java.util.concurrent.*;
import java.awt.*;

public class Main extends JFrame{
    private JButton
        b1 = new JButton("Button1"),
        b2 = new JButton("Button2");
    JLabel label;
    public Main () {
        super ("Hello Swing");
        label = new JLabel("A Label");
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }
    static Main ssp;

    public static void main(String[] args) throws Exception{
	// write your code here
//        JFrame frame = new JFrame("Hello Swing");
//        final JLabel label = new JLabel("A label");
//        frame.add(label);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 100);
//        frame.setVisible(true);
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                label.setText("Hey! This is Different!");
//            }
//        });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp = new Main();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("Hey! This is Different!");
            }
        });
    }
}
