import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nat on 2/2/2017 AD.
 */
public class Fight {
    public static int fight(int monsterHp){
        Map<String, Integer> bag = Main.bag;
        while (true) {
            Scanner source = new Scanner(System.in);
            String input = source.nextLine();
            System.out.println("You can hurt them by three ways: 'punch', 'slash', 'pierce' or 'escape' to run away.");
            if (monsterHp < 0) {
                System.out.println("Monster is death");
                return 1;
            }
            if (input.equals("punch")) {
                monsterHp -= 1;
                System.out.println("That's nor really hurtt");
            }
            if (input.equals("slash")) {
                if (bag.containsKey("sword")) {
                    monsterHp -= 30;
                    System.out.println("OUNCHHHHHHH");
                }
                else{
                    System.out.println("You need sword to slash");
                }

            }
            if (input.equals("pierce")) {
                if (bag.containsKey("spear")) {
                    monsterHp -= 50;
                    System.out.println("AEEEEEEEE");
                }
                else{
                    System.out.println("You need spear to pierce");
                }
            }
            if (input.equals("escape")) {
                return 0;
            }

        }
    }


}
