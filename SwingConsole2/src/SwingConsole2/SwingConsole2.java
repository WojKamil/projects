package SwingConsole2;

import java.util.concurrent.*;
import javax.swing.*;

class SubmitSwingProgram2 extends JFrame {
    JLabel label;
    public SubmitSwingProgram2() {
        label = new JLabel("A Label");
        add(label);
    }
}

public class SwingConsole2 {

    static SubmitSwingProgram2 ssp2;
    public static void main(String[] args) throws Exception {
	// write your code here
        run(ssp2 = new SubmitSwingProgram2(), 300, 100);
        TimeUnit.SECONDS.sleep(2);
    }
}
