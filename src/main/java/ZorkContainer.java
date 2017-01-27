import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Apple on 1/27/2017 AD.
 */
public class ZorkContainer extends ZorkObject {
    public String name;
    public HashMap<String,String> item = new HashMap<String,String>();

    public String description;
    public ArrayList<String> accept = new ArrayList<String>();
    boolean isOpen;
    public ZorkContainer()
    {
    }
}
