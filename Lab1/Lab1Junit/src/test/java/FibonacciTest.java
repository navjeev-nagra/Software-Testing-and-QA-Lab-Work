package test.java;

import main.java.Fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {5, 5},
                {6, 8},
                {7, 13},
                {8, 21},
                {9, 34}
        });
    }

    // Instance variables for each "column" of test data
    private final int input;
    private final int expected;

    // Constructor that takes in one "row" of test data
    public FibonacciTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    // Test with the instance variables as the source of the test data
    @Test
    public void testFibonacci() {
        int result = Fibonacci.compute(input);
        assertEquals(expected, result);
    }
}

