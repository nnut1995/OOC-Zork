/**
 * Created by Apple on 1/27/2017 AD.
 */
public class CheckInput extends Condition {
    String command;
    public boolean evaluate(Zork zork)
    {
        if (command.equals(zork.userInput))
            return true;
        else
            return false;
    }
}
