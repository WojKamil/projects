package com.company;
/****************** Exercise 7 ******************
 * Create an application using SwingConsole, and
 * add all the Swing components that have an
 * addActionListener() method. (Look these up in
 * the JDK documentation from http://java.sun.com.
 * Hint: Search for addActionListener() using the
 * index.) Capture their events and display an
 * appropriate message for each inside a text field.
 ***********************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
    // The JMenuItem's derivatives JCheckBoxMenuItem, JMenu &
    // JRadioButtonMenuItem will not be shown separately:
    JMenuItem mi = new JMenuItem("Menu Item");
    JTextField txt = new JTextField(30);
    Cursor hand = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
    JButton b1 = new JButton("Button1");
    JComboBox jcb = new JComboBox(new String[] {
        "Elements", "To", "Place", "In", "Combobox"
    });
    JFileChooser jfc = new JFileChooser(".");
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
    public Main(){
        setLayout(new FlowLayout());
        add(mi);
        add(txt);
        txt.setCursor(hand);
        add(b1);
        setCursor(hand);
        add(jcb);
        add(jfc);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("Button Pressed");
            }
        });
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "JTestField ActionListener fired", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        jcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("JComboBox selected: " + jcb.getSelectedItem());
            }
        });
        jfc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("FileChooser ActionListener fired: " + jfc.getSelectedFile());
            }
        });
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("JMenuItem Selected");
            }
        });
        new Timer(5000, new ActionListener() {
            int i=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("Timer Ticked " + i++);
            }
        }).start();;
    }
    public static void main(String[] args) {
	// write your code here
        SwingConsole.run(new Main(), 550, 425);
    }
}
