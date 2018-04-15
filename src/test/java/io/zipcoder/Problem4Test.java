package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem4Test {

    private Problem4 tester;


    @Before
    public void setup() {
        tester = new Problem4();
    }

    @Test
    public void canBePalindromeTest1() {
        String input = "aaabbbb";
        String expected = "YES";
        String actual = tester.checkForPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canBePalindromeTest2() {
        String input = "cdefghmnopqrstuvw";
        String expected = "NO";
        String actual = tester.checkForPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canBePalindromeTest3() {
        String input = "cdcdcdcdeeeef";
        String expected = "YES";
        String actual = tester.checkForPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

}
