import java.util.ArrayList;

/**
 * Created by Apple on 1/27/2017 AD.
 */
public class ZorkTrigger {
    public ArrayList<ZorkCondition> conditions = new ArrayList<ZorkCondition>();
    String type="single"; /*By default, single*/
    boolean hasCommand = false;
    public ArrayList<String> print = new ArrayList<String>();
    public ArrayList<String> action = new ArrayList<String>();

    public boolean evaluate(Zork zork)
    {
        for(int i=0;i<conditions.size();i++)
        {
            if (!conditions.get(i).evaluate(zork))
            {
                return false;
            }
        }
        return true;
    }
}
