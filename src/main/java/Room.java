import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nat on 1/31/2017 AD.
 */
public class Room extends CreateRoom {
    private int name;
    private HashMap<String, Integer> stuff = new HashMap<String, Integer> ();

    public Room(int name, HashMap<String, Integer> stuff) {
        this.name = name;
        this.stuff = stuff;
    }
    public int getName(){
        return this.name;
    }
    public HashMap<String, Integer> getStuff(){
        return this.stuff;
    }
}
