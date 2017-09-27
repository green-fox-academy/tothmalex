import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci number;
    Integer n;

    @Before
    public void setUp() throws Exception {
        number = new Fibonacci();
        n = 6;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fib() throws Exception {
        assertEquals(8,number.fib(n));
    }

}