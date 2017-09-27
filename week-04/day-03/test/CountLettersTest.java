import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters map2;
    String input;

    @Before
    public void setUp() throws Exception {
        input = "allateledel";
        map2 = new CountLetters();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mapping() throws Exception {
        assertEquals(5, (int) map2.mapping(input));
    }
}
