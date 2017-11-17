package bruh2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kamil.wojciechowski on 2017-04-28.
 */
public class DetailsPanel extends JPanel {



    public DetailsPanel(){
        Dimension size = getPreferredSize();
        size.width = 200;
        setPreferredSize(size);


        //Panel title
        setBorder(BorderFactory.createTitledBorder("Details: "));

        final JLabel mouseClickCounter = new JLabel("Click counter: ");

        final JTextField clickField = new JTextField(5);
        //clickField.setSize(20,20);

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.anchor = GridBagConstraints.LINE_END;

        gc.weightx = 0.5;
        gc.weighty = 0.5;

        gc.gridx = 0;
        gc.gridy = 0;
        add(mouseClickCounter, gc);

        gc.anchor = GridBagConstraints.LINE_START;

        gc.gridx = 1;
        gc.gridy = 0;
        add(clickField, gc);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
