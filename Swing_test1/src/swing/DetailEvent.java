package swing;

import java.util.EventObject;

/**
 * Created by kamil.wojciechowski on 2017-04-12.
 */
public class DetailEvent extends EventObject {

    private String text;

    public DetailEvent(Object source, String text){
        super(source);
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
