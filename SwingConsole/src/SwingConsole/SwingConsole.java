package SwingConsole;

import javax.swing.*;

/**
 * Created by kamil.wojciechowski on 2015-09-24.
 */
public class SwingConsole {
    public static void run( final JFrame f, final int width, final int height) {
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