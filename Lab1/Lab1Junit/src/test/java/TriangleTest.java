package test.java;

import main.java.Triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TriangleTest {

    private Triangle t1, t2, t3, tNegative, tInvalid;

    @Before
    public void setUp() {
        t1 = new Triangle(3, 4, 5);
        t2 = new Triangle(5, 4, 3);
        t3 = new Triangle(8, 5, 5);
        tNegative = new Triangle(-1, 1 ,3);
        tInvalid = new Triangle(3, 4, 100);
    }

    @Test
    public void testCalculateAreat1() {
        double expectedArea = 6.0; // Expected result using Heron
        double actualArea = t1.calculateArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalculateAreat2() {
        double expectedArea = 6.0; 
        double actualArea = t2.calculateArea();
        assertEquals(expectedArea, actualArea, 0.001); 
    }

    @Test
    public void testCalculateAreat3() {
        double expectedArea = 12.0; 
        double actualArea = t3.calculateArea();
        assertEquals(expectedArea, actualArea, 0.001); 
    }

    @Test
    public void testSameAreat1Andt2() {
        double areaT1 = t1.calculateArea();
        double areaT2 = t2.calculateArea();
        assertEquals(areaT1, areaT2, 0.001); 
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSideLength() {
        // Triangle with negative side length SHOULD throw an IllegalArgumentException
        tNegative.calculateArea();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidTriangle() {
        // Invalid triangle SHOULD throw an IllegalArgumentException
        tInvalid.calculateArea(); 
    }
}


