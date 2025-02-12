package test.java;

import main.java.PrimeNumberChecker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, true},   
                {6, false},  
                {19, true},  
                {22, false}, 
                {23, true}   
        });
    }

    // Instance variables for each "column" of test data
    private final int number;
    private final boolean expectedResult;

    // Constructor that takes in one "row" of test data
    public PrimeNumberCheckerTest(int number, boolean expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    // Test with instance variables
    @Test
    public void testCheckIfPrime() {
        boolean result = PrimeNumberChecker.checkIfPrime(number);
        assertEquals(expectedResult, result);
    }
}

