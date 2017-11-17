package bruh2;

import java.awt.*;

/**
 * Created by kamil.wojciechowski on 2017-04-24.
 */
public class RedSquare {

    private int xPos = 100;
    private int boardX;
    private int yPos = 100;
    private int boardY;
    private int width = 15;
    private int height = 15;
    private Color color = Color.WHITE;

    public void setX(int xPos){
        this.xPos = xPos;
    }

    public int getX(){
        return xPos;
    }

    public void setBoardX(int boardX){
        this.boardX = boardX;
    }

    public int getBoardX(){
        return boardX;
    }

    public void setY(int yPos){
        this.yPos = yPos;
    }

    public int getY(){
        return yPos;
    }

    public void setBoardY(int boardY){
        this.boardY = boardY;
    }

    public int getBoardY(){
        return boardY;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void  setColor(Color color){
        this.color = color;
    }

    public void changeColor(){
        if(color == Color.WHITE){
            color = Color.BLACK;
        }/*else if(color == Color.BLACK){
            color = Color.RED;
        }*/else{
            color = Color.WHITE;
        }
    }

    public Color getColor(){
        return color;
    }

    public void setSquareSize(int squareSize){
        this.width = squareSize;
        this.height = squareSize;

     }

    public void paintSquare(Graphics g){
        g.setColor(getColor());
        g.fillRect(xPos,yPos,width,height);
        g.setColor(getColor());
        g.drawRect(xPos,yPos,width,height);
    }
}
