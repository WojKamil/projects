package Button1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
    private JButton b1 = new JButton("Button 1");
    private JButton b2 = new JButton("Button 2");
    private JButton b3 = new JButton("Button 3");
    private JButton b4 = new JButton("Button 4");
    private JButton b5 = new JButton("Button 5");
    private JTextField txt = new JTextField(20);
    private JTextArea t = new JTextArea(20,40);
    private ActionListener bl = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        }
    };
    private ActionListener bl3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txt.setText("W roku 1983 na ekrany jednej ze stacji telewizyjnych w USA wszed³ nowy teleturniej Press Your Luck (Naciœnij Swoje Szczêœcie).idowniê.");
        }
    };
    private ActionListener bl4 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txt.setText("test button4");
        }
    };
    private ActionListener bl5 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txt.setText("..........");
        }
    };

    public Main() {
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        b3.addActionListener(bl3);
        b4.addActionListener(bl4);
        b5.addActionListener(bl5);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);
        add(b3);
        add(b4);
        add(b5);
        add(new JScrollPane(t));
    }

    public static void main(String[] args) {
        // write your code here
        SwingConsole.run(new Main(), 475, 425);
    }
}
