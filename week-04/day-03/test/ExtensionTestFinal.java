
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ExtensionTestFinal {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void add() throws Exception {
        Extension extension = new Extension();
        assertEquals(5, extension.add(2, 3));
    }

    @Test
    public void testAdd_1and4is5() throws Exception {
        Extension extension2 = new Extension();
        assertEquals(5, extension2.add(1, 4));
    }

    @Test
    public void testMaxOfThree_first() throws Exception {
        Extension extension3 = new Extension();
        assertEquals(5, extension3.maxOfThree(5, 4, 3));
    }

    @Test
    public void testMaxOfThree_third() throws Exception {
        Extension extension4 = new Extension();
        assertEquals(5, extension4.maxOfThree(3, 4, 5));
    }

    @Test
    public void testMedian_four() throws Exception {
        Extension extension5 = new Extension();
        assertEquals(5, extension5.median(Arrays.asList(7, 5, 3, 5)));
    }

    @Test
    public void testMedian_five() throws Exception {
        Extension extension6 = new Extension();
        assertEquals(3, extension6.median(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void testIsVowel_a() throws Exception {
        Extension extension7 = new Extension();
        assertTrue(extension7.isVowel('a'));
    }

    @Test
    public void testIsVowel_u() throws Exception {
        Extension extension8 = new Extension();
        assertTrue(extension8.isVowel('u'));
    }

    @Test
    public void testTranslate_bemutatkozik() throws Exception {
        Extension extension9 = new Extension();
        assertEquals("bevemuvutavatkovozivik", extension9.translate("bemutatkozik"));
    }

    @Test
    public void testTranslate_kolbice() throws Exception {
        Extension extension10 = new Extension();
        assertEquals("lavagovopuvus", extension10.translate("lagopus"));
    }
}