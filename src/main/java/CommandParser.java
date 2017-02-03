import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nat on 1/31/2017 AD.
 */
public class CommandParser {
    public int command(String userInput, int Location, int size) {
        CreateRoom make = new CreateRoom();
        List<Room> myRoom = make.makeRoom();
        Map<String, Integer> stuffInRoom = Main.myRoom.get(Location).getStuff();
        Map<String, Integer> bag = Main.bag;
        Fight fighting = new Fight();
        int sabertootStatus = Main.sabertootStatus;
        int trexStatus = Main.trexStatus;
        int mosasaurStatus = 0;
        int sabertoothHp = 100;
        int trexHp = 300;
        int mosasaurHp = 500;
        try {
            boolean match = false;
            if (userInput.equals("go left")) {
                if (Location < 1) {
                    System.out.println("U cant walk this way");
                } else {
                    System.out.println("You are at room: " + (Location - 1));
                    return Location - 1;
                }
                match = true;
            }
            else if (userInput.equals("go right")) {
                if (Location > (size - 2)) {
                    System.out.println("U cant walk this way");
                } else {
                    System.out.println("You are at room: " + (Location + 1));
                    return Location + 1;
                }
                match = true;
            }
            else if (userInput.equals("go down")) {
                if (Location < 2) {
                    System.out.println("U cant walk this way");
                } else {
                    System.out.println("You are at room: " + (Location - 2));
                    return Location - 2;
                }
                match = true;
            }
            else if (userInput.equals("go up")) {
                if (Location > (size - 3)) {
                    System.out.println("U cant walk this way");
                } else {
                    System.out.println("You are at room: " + (Location + 2));
                    return Location + 2;
                }
                match = true;
            }
            if (Location == 4 && !userInput.equals("fight sabertooth") && sabertootStatus == 0) {
                System.out.println("Sabertooth is here if you want to fight type 'fight sabertooth'");
                match = true;
            }
            if (Location == 7 && !userInput.equals("fight trex") && sabertootStatus == 1) {
                System.out.println("Trex is here if you want to fight type 'fight trex'");
                match = true;
            }

            if (userInput.equals("grab stone")) {
                if (stuffInRoom.get("stone").equals(0)) {
                    System.out.println("No more stone here");
                } else {
                    System.out.println("You have earned one stone");
                    stuffInRoom.put("stone", stuffInRoom.get("stone") - 1);
                    bag.put("stone", bag.get("stone") + 1);
                }
                match = true;
            }
            else if (userInput.equals("grab wood")) {
                if (stuffInRoom.get("wood").equals(0)) {
                    System.out.println("No more wood here");
                } else {
                    System.out.println("you have earned one wood");
                    stuffInRoom.put("wood", stuffInRoom.get("wood") - 1);
                    bag.put("wood", bag.get("wood") + 1);
                }
                match = true;
            }
            else if (userInput.equals("grab thatch")) {
                if (stuffInRoom.get("thatch").equals(0)) {
                    System.out.println("No more thatch here");

                } else {
                    System.out.println("you have earned one thatch");
                    stuffInRoom.put("thatch", stuffInRoom.get("thatch") - 1);
                    bag.put("thatch", bag.get("thatch") + 1);
                }
                match = true;

            }
            else if (userInput.equals("get metal")) {
                if (bag.containsKey("pickaxe") || bag.containsKey("hatcher")) {
                    if (stuffInRoom.get("metal").equals(0)) {
                        System.out.println("No metal here");
                    } else {
                        System.out.println("you have earned one metal");
                        stuffInRoom.put("metal", stuffInRoom.get("metal") - 1);
                        bag.put("metal", bag.get("metal") + 1);
                    }
                } else {
                    System.out.println("you need pickaxe to do this");
                }
                match = true;

            }

            if (userInput.equals("check bag")) {
                System.out.println(bag);
                match = true;

            }

            if (userInput.equals("craft hatcher")) {
                if (bag.get("wood") >= 2 && bag.get("thatch") >= 3) {
                    System.out.println("Hatcher crafting is done.");
                    bag.put("hatcher", 1);
                    bag.put("wood", bag.get("wood") - 2);
                    bag.put("thatch", bag.get("thatch") - 3);
                } else {
                    System.out.println("You don't have enough material");
                }
                match = true;

            }

            else if (userInput.equals("craft pickaxe")) {
                if (bag.get("wood") >= 2 && bag.get("stone") >= 3) {
                    System.out.println("Pickaxe crafting is done.");
                    bag.put("pickaxe", 1);
                    bag.put("wood", bag.get("wood") - 2);
                    bag.put("stone", bag.get("stone") - 3);
                } else {
                    System.out.println("You don't have enough material");
                }
                match = true;

            }
            else if (userInput.equals("craft sword")) {
                if (bag.get("metal") >= 2 && bag.get("wood") >= 4) {
                    System.out.println("Sword crafting is done.");
                    bag.put("sword", 1);
                    bag.put("metal", bag.get("metal") - 2);
                    bag.put("wood", bag.get("wood") - 4);
                } else {
                    System.out.println("You don't have enough material");
                }
                match = true;

            }
            else if (userInput.equals("craft spear")) {
                if (bag.get("metal") >= 6 && bag.get("wood") >= 3 && bag.get("thatch") >= 4) {
                    System.out.println("Spear crafting is done.");
                    bag.put("spear", 1);
                    bag.put("metal", bag.get("metal") - 6);
                    bag.put("wood", bag.get("wood") - 3);
                    bag.put("thatch", bag.get("thatch") - 4);
                } else {
                    System.out.println("You don't have enough material");
                }
                match = true;

            }
            if (userInput.equals("fight sabertooth") && Location == 4 && sabertootStatus == 0) {
                System.out.println("Sabertooth is here");
                Main.sabertootStatus = fighting.fight(sabertoothHp);
                match = true;

            }


            if (userInput.equals("fight trex") && Location == 7 && sabertootStatus == 1) {
                System.out.println("trex is here");
                Main.trexStatus = fighting.fight(trexHp);
                if (Main.trexStatus == 1) {
                    System.out.println("You can go back to your own island now. Type 'back to island' to go back there. ");
                }
                match = true;

            }

            if (userInput.equals("back to island") && trexStatus == 1) {
                System.out.println("Mosasaur is here");
                mosasaurStatus = fighting.fight(mosasaurHp);
                if (mosasaurStatus == 1) {
                    System.out.println("You win the game");
                    System.exit(0);
                }
                match = true;
            }
            if (!match) {
                System.out.println("Invalid command");
        }
            return Location;
        } catch (Exception e) {
            return Location;
        }
    }
}
