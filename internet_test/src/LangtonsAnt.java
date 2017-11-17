import javax.swing.*;

public class LangtonsAnt {
    public static void main(String[] args) {
        final int DIM = 80;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AntGUI g = new AntGUI(DIM);
            }
        });
    }
}