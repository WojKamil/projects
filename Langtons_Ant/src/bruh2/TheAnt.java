package bruh2;

/**
 * Created by kamil.wojciechowski on 2017-05-23.
 */
public class TheAnt extends RedSquare{

    enum Direction{
        NORTH, EAST, SOUTH, WEST
    }
    Direction dir = Direction.NORTH;

    public void antMove(){
        int tempX, tempY;
        //RedSquare tempSquare = MainF
        tempX = getBoardX();
        tempY = getBoardY();

        switch (dir){
            case NORTH:
                setBoardY(tempY-1);
                tempY = getBoardY();
                break;
            case EAST:
                setBoardX(tempX+1);
                break;
            case SOUTH:
                setBoardY(tempY+1);
                break;
            case WEST:
                setBoardX(tempX-1);
                break;
            default:
                break;
        }

    }


}
