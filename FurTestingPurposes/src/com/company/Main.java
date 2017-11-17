package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class TextArea extends JFrame {
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
    private JButton
            b = new JButton("Add Data"),
            c = new JButton("Clear Data");
    private JTextArea t = new JTextArea(20, 40);
    private Map<String,String> m =
            new HashMap<String,String>();
    public TextArea() {
// Use up all the data:
        m.putAll(Countries.capitals());
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(Map.Entry me : m.entrySet())
                    t.append(me.getKey() + ": "+ me.getValue()+"\n");
            }
        });
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });
        setLayout(new FlowLayout());
        add(new JScrollPane(t));
        add(b);
        add(c);
    }
    public static void main(String[] args) {
        run(new TextArea(), 475, 425);
    }
}

class DynamicHelloLabel extends JFrame {
    private static Random rnd = new Random(47);
    JLabel[] labels;
    DynamicHelloLabel() {
        super("Hello Label");
        setLayout(new FlowLayout());
        int numOfLabels = rnd.nextInt(10) + 1;
        labels = new JLabel[numOfLabels];
        for(int i = 0; i < numOfLabels; i++)
            add(labels[i] = new JLabel("label: " + i));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }
}
public class main {
    static DynamicHelloLabel dhl;
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() { dhl = new DynamicHelloLabel(); }
        });
        TimeUnit.SECONDS.sleep(2);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                for(int i = 0; i< dhl.labels.length; i++)
                    dhl.labels[i].setText("LABEL: " + i);
            }
        });
    }
}
}