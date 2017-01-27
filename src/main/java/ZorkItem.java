import java.util.ArrayList;

/**
 * Created by Apple on 1/27/2017 AD.
 */
public class ZorkItem extends ZorkObject{
    public String name;
    public String description;
    public ArrayList<String> turnOnPrint = new ArrayList<String>();
    public ArrayList<String> turnOnAction = new ArrayList<String>();
    public ZorkItem()
    {
    }
}
