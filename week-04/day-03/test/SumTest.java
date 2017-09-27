import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    ArrayList<Integer> numbers2;
    Sum sum2;

    @Before
    public void setUp() throws Exception {
        sum2 = new Sum();
        numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void summing() throws Exception {
        assertEquals(8,sum2.getSumming(numbers2));
    }
}