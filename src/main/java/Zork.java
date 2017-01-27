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
    public HashMap<String, Locations> Rooms = new HashMap<String, Locations>();
    public HashMap<String, Items> Items = new HashMap<String, Items>();
    public HashMap<String, Bag> Containers = new HashMap<String, Bag>();
    public HashMap<String, Object> Objects = new HashMap<String, Object>();
    public HashMap<String, Dinosaur> Creatures = new HashMap<String, Dinosaur>();
    public HashMap<String,String> Inventory = new HashMap<String,String>();
    public HashMap<String,String> ObjectLookup = new HashMap<String,String>();
    public String currentRoom;
    public File file;
}
