package bruh2;

import javax.swing.*;



public class Main {



    public static void main(String[] args) {
	// write your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }


    private static void createAndShowGUI(){
        System.out.println("Created GUI on EDT? "+SwingUtilities.isEventDispatchThread());
        MainFrame frame = new MainFrame("Langton's Ant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setSize(400,400); this is no longer needed as new component on JFrame has it's own dimensions
        frame.setVisible(true);
        //frame.pack();
    }



}
