import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ServerNameGenTest {

    @Test
    public void testNounArrayProperties(){
        assertEquals("Ensure the noun array has 10 items", 10, ServerNameGenerator.getNounArray().length, 0);
        assertEquals("Ensure the first item in the noun array is 'fox'", "fox", ServerNameGenerator.getNounArray()[0]);
    }
}
