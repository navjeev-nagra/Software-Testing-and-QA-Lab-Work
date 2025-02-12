package test.java;

import main.java.Fibonacci;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Theories.class)
public class FibonacciTestWithTheories {

    @DataPoints
    public static int[][] values() {
        return new int[][] {{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}, {8, 21}, {9, 34}};
    }

    @Theory
    public void fibonacciTestTheory(int[] a) {
        Fibonacci f = new Fibonacci(); // New instance each time
        assertTrue(f.compute(a[0]) == a[1]);
    }
}


