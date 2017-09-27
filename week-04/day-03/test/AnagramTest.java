import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    String word1;
    String word2;
    Anagram result;

    @Before
    public void setUp() throws Exception {
      word1 = "alma";
      word2 = "lama";
      result = new Anagram();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void ifAnagram() throws Exception {
        boolean answer = true;
        assertEquals(answer,result.ifAnagram(word1, word2));
    }

}