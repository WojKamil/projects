import java.awt.*;

class Ant {


    char direction;
    int xPos;
    int yPos;
    int dim;

    public Ant(char d, int dim) {
        direction = d;
        xPos = dim / 2;
        yPos = dim / 2;
        this.dim = dim;
    }

    public void move(Color c) {

        //Is it a better way to do this?
        if (c == Color.WHITE) {
            if (direction == 'u') {
                direction = 'r';
                moveRight();
            } else if (direction == 'r') {
                direction = 'd';
                moveDown();
            } else if (direction == 'd') {
                direction = 'l';
                moveLeft();
            } else if (direction == 'l') {
                direction = 'u';
                moveUp();
            }
        } else if (c == Color.BLACK) {
            if (direction == 'u') {
                direction = 'l';
                moveLeft();
            } else if (direction == 'l') {
                direction = 'd';
                moveDown();
            } else if (direction == 'd') {
                direction = 'r';
                moveRight();
            } else if (direction == 'r') {
                direction = 'u';
                moveUp();
            }
        }
    }

    public void moveUp() {

        if ((yPos - 1) == -1)
            yPos = dim-1;
        else
            yPos -= 1;

    }

    public void moveDown() {

        if ((yPos + 1) == dim)
            yPos = 0;
        else
            yPos += 1;
    }

    public void moveLeft() {

        if ((xPos - 1) == -1)
            xPos = dim-1;
        else
            xPos -= 1;
    }

    public void moveRight() {

        if ((xPos + 1) == dim)
            xPos = 0;
        else
            xPos += 1;
    }

    public void setXPos(int i) {
        xPos = i;
    }

    public void setYPos(int i) {
        yPos = i;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }
}
