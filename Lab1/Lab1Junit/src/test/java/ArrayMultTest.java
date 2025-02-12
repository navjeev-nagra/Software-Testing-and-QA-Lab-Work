package test.java;

import main.java.ArrayMult;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayMultTest {
    private ArrayMult arrayMult;

    @Before
    public void setUp() {
        // Initialize the ArrayMult object before each test
        arrayMult = new ArrayMult();
    }

    @Test
    public void testMult() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7};
        int[] expected = {5, 12, 21, 4}; // 4 is the element from the longer array

        int[] result = arrayMult.mult(array1, array2);

        // Check if the result matches the expected output
        assertArrayEquals(expected, result);
    }


}

