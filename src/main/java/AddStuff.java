import java.util.Map;

/**
 * Created by Nat on 2/1/2017 AD.
 */
public class AddStuff {
    public static void addItem() {
        Map<String, Integer> bag = Main.bag;
        bag.put("stone",0);
        bag.put("wood",0);
        bag.put("thatch",0);
        bag.put("metal",0);

    }
}
