import java.util.*;

/**
 * Created by Nat on 1/31/2017 AD.
 */
public class Main {
    static Map<String, Integer> bag = new HashMap<String, Integer>();
    static CreateRoom make = new CreateRoom();
    static List<Room> myRoom = make.makeRoom();
    static int sabertootStatus = 0;
    static int trexStatus = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to the dinosaur world. You can type 'go up','go down','go left' or 'go right' for move to" + "\r\n" +
                "other room. You also can grab the item from the room by type 'grab thatch,'grab wood' or 'grab stone'. Moreover," + "\r\n" +
                "You can craft the item by type 'craft hatcher', 'craft pickaxe', 'craft sword', or 'craft spear'. If you want to chec" + "\r\n" +
                "the stuff in the bag, you can type 'check bag'. The boss are hidden " + "\r\n" +
                "in some room. You have to go to that room and do something in the room, then the boss will come out. You must defeat three boss " + "\r\n" +
                "to win the game. Have fun with your game!." );
        int Location = 0;
        Room currentRoom = myRoom.get(Location);
        AddStuff.addItem();
        while (true) {
            Scanner source = new Scanner(System.in);
            String userInput = source.nextLine();
            CommandParser cmd = new CommandParser();
            Location = cmd.command(userInput, Location, myRoom.size());
            currentRoom = myRoom.get(Location);
            if (userInput.equals("exit")) {
                break;
            }

        }
    }
}
