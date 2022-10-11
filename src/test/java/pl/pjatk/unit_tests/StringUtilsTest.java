package pl.pjatk.unit_tests;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringUtilsTest {

    @Test
    public void alaUpperCaseIsALA() {
        String expected = "ALA MA KOTA";
        String result = StringUtils.toUpperCase("ala ma kota");
        assertEquals(expected, result);
    }

    @Test
    public void catReversedIsTac() {
        String expected = "tac";
        String result = StringUtils.reverseString("cat");
        assertEquals(expected, result);
    }

    @Test
    public void testMultipliedBy3Is3Test() {
        String expected = "test test test";
        String result = StringUtils.multiplyString("test", 3);
        assertEquals(expected, result);
    }

    @Test
    public void JanKowalskiRemoveSmallCharsIsJK() {
        String expected = "J K";
        String result = StringUtils.removeSmallChars("Jan Kowalski");
        assertEquals(expected, result);
    }

    @Test
    public void JanKowalskiRemoveBigCharsIsAnOwalski() {
        String expected = "an owalski";
        String result = StringUtils.removeBigChars("Jan Kowalski");
        assertEquals(expected, result);
    }

    @Test
    public void numbersRemovedFrom123Test() {
        String expected = "Test";
        String result = StringUtils.removeAllButLetters("123Test");
        assertEquals(expected, result);
    }
}
