package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kamil.wojciechowski on 2017-04-12.
 */
public class MainFrame extends JFrame{

        private DetailsPanel detailsPanel;

        public MainFrame(String title){
            super(title);

            // Set layout manager
            setLayout(new BorderLayout());

            // Create Swing component
            final JTextArea textArea = new JTextArea();
            JButton button = new JButton("Click me");

            detailsPanel = new DetailsPanel();

            detailsPanel.addDetailListener(new DetailListener(){
                public void detailEventOccured(DetailEvent event){
                    String text = event.getText();

                    textArea.append(text);

                }
            });

            // Add Swing components to content pane
        Container c = getContentPane();

        c.add(textArea, BorderLayout.CENTER);
        c.add(button, BorderLayout.SOUTH);
        c.add(detailsPanel, BorderLayout.LINE_START);

        // Add behaviour
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello\n");
            }
        });

    }

}
