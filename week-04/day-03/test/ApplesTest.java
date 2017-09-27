import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    Apples myfruit;

    @Before
    public void setUp() throws Exception {

        myfruit = new Apples("apple");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getApple() throws Exception {
            assertEquals("apple", myfruit.getApple());
        }
}

/*
 public void getAppleTest() throws Exception {
        Apples myfruit =  new Apples();
        assertEquals("apple", myfruit.getApple());
    }
 */