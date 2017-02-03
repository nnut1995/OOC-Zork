import java.util.*;

/**
 * Created by Nat on 1/31/2017 AD.
 */
public class CreateRoom {
    public static List makeRoom() {
        Random rand = new Random();
        List<HashMap<String, Integer>> stuffRooms = new ArrayList<HashMap<String, Integer>>();
        List<Room> rooms = new ArrayList<Room>();
        for (int i = 0; i < 9; i++ ) {
            HashMap<String, Integer> stuff = new HashMap<String, Integer>();
            stuff.put("wood",rand.nextInt(10));
            stuff.put("thatch",rand.nextInt(10));
            stuff.put("stone",rand.nextInt(10));
            stuff.put("metal",rand.nextInt(10));
            stuffRooms.add(stuff);
        }
        for (int i = 0; i < 9; i++ ) {
            rooms.add(new Room(i, stuffRooms.get(i)));
        }
    return rooms;
    }


}
