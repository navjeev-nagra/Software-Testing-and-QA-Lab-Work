package test.java;

import main.java.PrimeNumberChecker;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Theories.class)
public class PrimeNumberCheckerTestWithTheories {

    @DataPoints
    public static Object[][] values() {
        return new Object[][]{{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }

    @Theory
    public void PrimeNumberTheory(Object[] a) {
        PrimeNumberChecker p = new PrimeNumberChecker();
     // Assert that the result of prime checker is equal to expected result
     // Get boolean a[0] and compare with a[1] to check prime
        assertTrue(p.checkIfPrime((Integer) a[0]) == (Boolean) a[1]);
    }
}

