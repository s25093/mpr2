package pl.pjatk.tdd.test.strings;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.strings.StringUtils;

public class StringUtilsTest {

    @Test
    public void sumOfDigits52Is7(){
        Assert.assertEquals(7, StringUtils.sumOfDigitsInNumber(52));
    }

    @Test
    public void alaIsPalindrome(){
        Assert.assertTrue(StringUtils.isPalindrome("ala"));
    }

    @Test
    public void catIsNotPalindrome(){
        Assert.assertFalse(StringUtils.isPalindrome("cat"));
    }

}
