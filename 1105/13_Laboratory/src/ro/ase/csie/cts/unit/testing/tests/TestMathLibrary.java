package ro.ase.csie.cts.unit.testing.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.unit.testing.MathLibrary;

public class TestMathLibrary {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Preparing tests...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Cleaning tests....");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Preparing a test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Cleaning after test");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testTrue() {
		assertTrue(true);
	}

	@Test
	public void testRightGetMinimum() {
		//define input data
		int[] values = new int[] {25, 5, 1, 50};
		//define expected result
		int expectedResult = 1;
		//call the methjod and get result
		int result = MathLibrary.getMinimum(values);
		//check result
		//		if(expectedResult == result) {
		//			
		//		}
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testRightAdd() {
		int a = 10;
		int b = 20;
		int expectedResult = 30;
		int result = MathLibrary.add(a, b);
		assertEquals("Adding 2 simple values test", expectedResult, result);
	}
	
	@Test
	public void testOrderingAscGetMinimum() {
		int[] values = new int[] {1,2,3,4,5,6};
		int expectedResult = 1;
		int result = MathLibrary.getMinimum(values);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testOrderingAdd() {
		// check if interchanging params values has any effect
		int a = 20;
		int b = 10;
		int expectedResult = 30;
		int result = MathLibrary.add(a, b);
		assertEquals("Adding 2 simple values test", expectedResult, result);
	}
	
	@Test
	public void testCardinalityZeroGetMinimum() {
		int[] values = new int[0];
		try {
			MathLibrary.getMinimum(values);
			fail("No exception for empty array");
		}
		catch(UnsupportedOperationException e) {
			assertTrue(true);
		}
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testCardinalityZeroExceptionGetMinimum() {
		int[] values = new int[0];
		MathLibrary.getMinimum(values);
	}
	
	@Test
	public void testCardinalityOneGetMinimum() {
		int[] values = new int[] {1};
		int expectedResult = 1;
		int result = MathLibrary.getMinimum(values);
		assertEquals(expectedResult, result);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testExistenceNullGetMinimum() {
		MathLibrary.getMinimum(null);
	}
	
	
}













