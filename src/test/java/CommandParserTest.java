import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nat on 2/3/2017 AD.
 */
public class CommandParserTest {
    CommandParser commandParser = new CommandParser();

    @Test
    public void command() throws Exception {
        assertTrue(commandParser.command("grab wood", 8, 9) == 8);
        assertTrue(commandParser.command("grab thatch", 8, 9) == 8);
        assertTrue(commandParser.command("grab stone", 8, 9) == 8);
        assertTrue(commandParser.command("get metal", 8, 9) == 8);
        assertTrue(commandParser.command("craft sword", 8, 9) == 8);
        assertTrue(commandParser.command("go left", 5, 9) == 4);
        assertTrue(commandParser.command("go right", 5, 9) == 6);
        assertTrue(commandParser.command("go up", 5, 9) == 7);
        assertTrue(commandParser.command("go down", 5, 9) == 3);


    }

}