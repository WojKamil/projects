package kolkoIKrzyzyk.gra;

/**
 * Created by kamil.wojciechowski on 2016-10-17.
 */
public class Punkt {
    int wspX;
    int wspY;

    void ustawX(int x){
        wspX = x;
    }
    void ustawY(int y){
        wspY = y;
    }
    int podajX(){
        return wspX;
    }
    int podajY(){
        return wspY;
    }
}
