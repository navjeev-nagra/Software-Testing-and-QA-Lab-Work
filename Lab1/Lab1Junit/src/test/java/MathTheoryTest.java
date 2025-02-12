package test.java;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class MathTheoryTest {

    // Values for a and b
    @DataPoints
    public static int[] val = {1, 2, 307, 400567};
    
    @DataPoints
    public static int[] newval = {0, -1, -10, -1234, 1, 10, 6789};
    
    @DataPoints
    public static int[] newval2 = {0, -1, -10, -1234, 1, 10, 6789, Integer.MAX_VALUE, Integer.MIN_VALUE};


    // Theory to check math statement for every pair of a and b
    @Theory
    public void testMathematicalStatements(int a, int b) {
        Assume.assumeTrue(a > 0 && b > 0);
        // Check a + b > a and a + b > b
        assertTrue(a + b > a);
        assertTrue(a + b > b);
        // Check a + b = b + a
        assertTrue(a + b == b + a);
    }
}

