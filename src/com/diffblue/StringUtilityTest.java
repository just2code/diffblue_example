package com.diffblue;

import com.diffblue.StringUtility;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;
import java.lang.reflect.Method;

public class StringUtilityTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    // Test generated by Diffblue Cover.

    @Test
    public void everyNthCharacterOfInputNotNullPositiveOutputNotNull() {

        // Arrange
        final String input = "|";
        final int n = 1;

        // Act
        final String retval = StringUtility.everyNthCharacterOf(input, n);

        // Assert result
        Assert.assertEquals("|", retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void reverseInputNotNullOutputNotNull() {

        // Arrange
        final String input = "+<";

        // Act
        final String retval = StringUtility.reverse(input);

        // Assert result
        Assert.assertEquals("<+", retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isDayOfMonthInputNotNullOutputTrue() {

        // Arrange
        final StringUtility objectUnderTest = new StringUtility();
        final String input = "6";

        // Act
        final boolean retval = objectUnderTest.isDayOfMonth(input);

        // Assert result
        Assert.assertEquals(true, retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isDayOfMonthInputNotNullOutputFalse() {

        // Arrange
        final StringUtility objectUnderTest = new StringUtility();
        final String input = "0";

        // Act
        final boolean retval = objectUnderTest.isDayOfMonth(input);

        // Assert result
        Assert.assertEquals(false, retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isUpperCaseInputNotNullOutputTrue() {

        // Arrange
        final StringUtility objectUnderTest = new StringUtility();
        final String input = "W";

        // Act
        final boolean retval = objectUnderTest.isUpperCase(input);

        // Assert result
        Assert.assertEquals(true, retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isUpperCaseInputNotNullOutputTrue1() {

        // Arrange
        final StringUtility objectUnderTest = new StringUtility();
        final String input = "WAACE#";

        // Act
        final boolean retval = objectUnderTest.isUpperCase(input);

        // Assert result
        Assert.assertEquals(true, retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isUpperCaseInputNotNullOutputFalse() {

        // Arrange
        final StringUtility objectUnderTest = new StringUtility();
        final String input = "WAACE#b";

        // Act
        final boolean retval = objectUnderTest.isUpperCase(input);

        // Assert result
        Assert.assertEquals(false, retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void repeatInputNotNullZeroOutputNotNull() {

        // Arrange
        final String input = "";
        final int n = 0;

        // Act
        final String retval = StringUtility.repeat(input, n);

        // Assert result
        Assert.assertEquals("", retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void repeatInputNotNullPositiveOutputNotNull() {

        // Arrange
        final String input = "";
        final int n = 1;

        // Act
        final String retval = StringUtility.repeat(input, n);

        // Assert result
        Assert.assertEquals("", retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isWhitespaceInputNotNullOutputFalse() {

        // Arrange
        final char c = '\u0000';

        // Act
        final boolean retval = StringUtility.isWhitespace(c);

        // Assert result
        Assert.assertEquals(false, retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isWhitespaceInputNotNullOutputTrue() {

        // Arrange
        final char c = ' ';

        // Act
        final boolean retval = StringUtility.isWhitespace(c);

        // Assert result
        Assert.assertEquals(true, retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isPalindromeInputNotNullOutputStringIndexOutOfBoundsException() {

        // Arrange
        final String input = "";

        // Act
        thrown.expect(StringIndexOutOfBoundsException.class);
        StringUtility.isPalindrome(input);

        // Method is not expected to return due to exception thrown

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isPalindromeInputNotNullOutputTrue() {

        // Arrange
        final String input = "q";

        // Act
        final boolean retval = StringUtility.isPalindrome(input);

        // Assert result
        Assert.assertEquals(true, retval);

    }

    // Test generated by Diffblue Cover.

    @Test
    public void isPalindromeInputNotNullOutputFalse() {

        // Arrange
        final String input = "qiQ";

        // Act
        final boolean retval = StringUtility.isPalindrome(input);

        // Assert result
        Assert.assertEquals(false, retval);

    }

}