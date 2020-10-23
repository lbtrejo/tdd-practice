import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ServerNameGenTest {

    @Test
    public void testNounArrayProperties(){
        assertEquals("Ensure the noun array has 10 items", 10, ServerNameGenerator.getNounArray().length, 0);
        assertEquals("Ensure the first item in the noun array is 'fox'", "fox", ServerNameGenerator.getNounArray()[0]);
    }

    @Test
    public void testAdjectiveArrayProperties(){
        assertEquals("Ensure the adjective array has 10 items", 10, ServerNameGenerator.getAdjectiveArray().length, 0);
        assertEquals("Ensure the last item of the adj array is 'graceful'", "graceful", ServerNameGenerator.getAdjectiveArray()[9]);
    }

    @Test
    public void testRandomElementFromArray(){
        assertTrue(ServerNameGenerator.getRandomElementFromArray(ServerNameGenerator.getNounArray()).length() >= 3);
        assertTrue(ServerNameGenerator.getRandomElementFromArray(ServerNameGenerator.getAdjectiveArray()).length() <= 9);
    }
}
