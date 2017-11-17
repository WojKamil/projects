import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Langton's Ant in Java
 * TODO Add GUI options (and make the GUI nicer)
 * TODO Mark current square red, so it easier to follow the steps
 * TODO Add step counter
 */

class Main {

    Ant a;
    AntGUI g;
    int dim;

    public Main(AntGUI gui, int d) {
        g = gui;
        dim = d;
        a = new Ant('r', dim);
    }

    public void startAnt() {

        //place ant on starting square
        g.updateSquareColor(a.getXPos(), a.getYPos(), Color.BLACK);
        Color c;
        int x, y;

        /** main loop */
        while (true) {
            try {
                x = a.getXPos();
                y = a.getYPos();
                c = g.getSquareColor(x, y);
                g.setTempColor(x, y);
                Thread.currentThread().sleep(10);
                a.move(c);
                g.updateSquareColor(x, y, c); //WHITE / BLACK
                Thread.currentThread().sleep(5);

            } catch (InterruptedException e) {}
        }
    }
}


