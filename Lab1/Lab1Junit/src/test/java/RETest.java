package test.java;

import main.java.RE;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class RETest {

    @Test
    public void testREValidPhoneNumber1() {
        assertTrue(RE.checkPhoneNumber("(123) 123 - 1234"));
    }

    @Test
    public void testREValidPhoneNumber2() {
        assertTrue(RE.checkPhoneNumber("(123) 456 - 7890"));
    }

    @Test
    public void testRENumberWithoutParentheses() {
        assertFalse(RE.checkPhoneNumber("123 123 - 1234"));
    }

    @Test
    public void testRENoHyphen() {
        assertFalse(RE.checkPhoneNumber("(123)123  1234"));
    }
}

