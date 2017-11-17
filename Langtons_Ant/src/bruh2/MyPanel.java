package bruh2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

/**
 * Created by kamil.wojciechowski on 2017-04-21.
 */
public class MyPanel extends JPanel {

    RedSquare redSquare = new RedSquare();
    RedSquare[][] board = new RedSquare[100][100];
    int squareDistance = 15;
    int squareSize = 15;




    public MyPanel(){

        setBorder(BorderFactory.createLineBorder(Color.black));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                moveSquare(e.getX(),e.getY());
                checkCollision(e.getX(),e.getY());
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                moveSquare(e.getX(),e.getY());
                checkCollision(e.getX(),e.getY());
            }
        });

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++) {
                RedSquare a = new RedSquare();
                board[i][j] = a;
                a.setX(squareDistance*i);
                a.setY(squareDistance*j);
                a.setBoardX(i);
                a.setBoardY(j);
                a.setSquareSize(squareSize);
            }
        }
    }

    public RedSquare getRedSquare(int i, int j){
        return board[i][j];
    }


    private void checkCollision(int x, int y){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++) {
                RedSquare temp = board[i][j];
                int xValue = temp.getX();
                int yValue = temp.getY();
                int tempHeight = temp.getHeight();
                int tempWidth = temp.getWidth();

                if((xValue <= x && x <= xValue+tempWidth) && (yValue <= y && y<= yValue+tempHeight)){
                    //COLLISION!!!
                    temp.changeColor();
                    repaint(xValue,yValue,tempWidth+1,tempHeight+1);
                }
            }
        }
    }

    private void moveSquare(int x, int y){

        //Current square state, stored as final variables
        //to avoid repeat invocations of the same methods.
        final int CURR_X = redSquare.getX();
        final int CURR_Y = redSquare.getY();
        final int CURR_W = redSquare.getWidth();
        final int CURR_H = redSquare.getHeight();
        final int OFFSET = 1;

        if((CURR_X!=x)||(CURR_Y!=y)){

            // The square is moving, repaint background
            //over the old square location.
            repaint(CURR_X,CURR_Y,CURR_H+OFFSET,CURR_W+OFFSET);

            // Update coordinates
            redSquare.setX(x);
            redSquare.setY(y);

            //Repaint the square at the new location
            repaint(redSquare.getX(),redSquare.getY(),redSquare.getWidth()+OFFSET,redSquare.getHeight()+OFFSET);
        }
    }
    public Dimension getPreferredSize(){
        return new Dimension(400,400);
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        redSquare.paintSquare(g);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++) {
                board[i][j].paintSquare(g);
            }
        }

    }
}
