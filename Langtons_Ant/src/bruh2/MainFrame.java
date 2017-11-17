package bruh2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kamil.wojciechowski on 2017-04-28.ty7
 */
public class MainFrame extends JFrame{

    private DetailsPanel detailsPanel;
    public final JPanel drawingPanel = new MyPanel();

    public MainFrame(String title){
        super(title);

        //Set layout manager
        setLayout(new BorderLayout());

        // Create Swing component


        detailsPanel = new DetailsPanel();

        Container container = getContentPane();

        container.add(drawingPanel, BorderLayout.CENTER);
        container.add(detailsPanel, BorderLayout.EAST);
    }
}
