package q3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import q3.Triclass;

public class TriclassTest {

	@BeforeClass
	public static void init() {
		System.out.println("Testing started");
	}
	@AfterClass
	public static void breakdown() {
		System.out.println("Testing is finished");
	}
	
	@Test
	public void invalidTriTest() {
		System.out.println("#Test_1 - started");
		assertEquals("Invalid", Triclass.classify(1, 1, 9));
		assertEquals("Invalid", Triclass.classify(1, 1, 8));
		System.out.println("#Test_1 - finished");
	}
	
	@Test
	public void scaleneTest() {
		System.out.println("#Test_2 - started");
		assertEquals("Scalene", Triclass.classify(2, 3, 4));
		assertEquals("Scalene", Triclass.classify(5, 7, 4));
		System.out.println("#Test_2 - finished");
	}
	
	@Test
	public void equilateralTest() {
		System.out.println("#Test_3 - started");
		assertEquals("Equilateral", Triclass.classify(5, 5, 5));
		System.out.println("#Test_3 - finished");
	}
	
	@Test
	public void isocelesTest() {
		System.out.println("#Test_4 - started");
		assertEquals("Isosceles", Triclass.classify(2, 5, 5));
		assertEquals("Isosceles", Triclass.classify(3, 5, 5));
		assertEquals("Isosceles", Triclass.classify(4, 5, 5));
		assertEquals("Isosceles", Triclass.classify(6, 5, 5));
		assertEquals("Isosceles", Triclass.classify(7, 5, 5));
		assertEquals("Isosceles", Triclass.classify(8, 5, 5));
		assertEquals("Isosceles", Triclass.classify(9, 5, 5));
		System.out.println("#Test_4 - started");
	}


	
	@Test
	public void invalidTriSideLengthGreaterThan10Test() {
		System.out.println("#Test_5 - started");
		assertEquals("Invalid", Triclass.classify(5, 5, 11));
		System.out.println("#Test_5 - finished");
	}
}




