package ro.ase.csie.cts.unit.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.unit.testing.MathLibrary;

public class TestMathLibrary {
	
	public static void doSomething() {
		System.out.println("Do something....");
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Preparing tests....");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Clear after tests....");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Clear test data");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSuccess() {
		assertTrue(true);
	}
	
	@Test
	public void testRightAdd() {
		//define input values
		int a = 10;
		int b = 20;
		//define expected result
		int expectedResult = 30;
		//call the method and get the result
		int result = MathLibrary.add(a, b);
		//check the result
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testRightGetMinimum() {
		int[] values = new int[] {10,3,50,34};
		int expectedResult = 3;
		int result = MathLibrary.getMinimum(values);
		assertEquals("Testing with good values", expectedResult, result);
	}
	
	@Test
	public void testOrderingDescGetMinimum() {
		int[] values = new int[] {50,30,24,5,2};
		int expected = 2;
		int result = MathLibrary.getMinimum(values);
		assertEquals(expected, result);
	}
	
	@Test
	public void testOrderingAscGetMinimum() {
		int[] values = new int[] {2,6,10,34,50};
		int expected = 2;
		int result = MathLibrary.getMinimum(values);
		assertEquals(expected, result);
	}
	
	@Test
	public void testCardinalityZeroGetMinimum() {
		int[] values = new int[0];
		try {
			MathLibrary.getMinimum(values);
			fail("No exception for no values");
		}
		catch(UnsupportedOperationException ex) {
			assertTrue(true);
		}
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testCardinalityZeroGetMinimumImproved() {
		int values[] = new int[0];
		MathLibrary.getMinimum(values);
	}

}





