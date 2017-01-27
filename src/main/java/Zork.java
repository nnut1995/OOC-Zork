import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Apple on 1/27/2017 AD.
 */
public class Zork {
    Scanner source = new Scanner(System.in);
    public String userInput="";

    /*Hashmaps to store the instance of the game*/
    public HashMap<String,ZorkRoom> Rooms = new HashMap<String,ZorkRoom>();
    public HashMap<String,ZorkItem> Items = new HashMap<String,ZorkItem>();
    public HashMap<String,ZorkContainer> Containers = new HashMap<String,ZorkContainer>();
    public HashMap<String,ZorkObject> Objects = new HashMap<String,ZorkObject>();
    public HashMap<String,ZorkCreature> Creatures = new HashMap<String,ZorkCreature>();
    public HashMap<String,String> Inventory = new HashMap<String,String>();
    public HashMap<String,String> ObjectLookup = new HashMap<String,String>();
    public String currentRoom;
    public File file;
}
