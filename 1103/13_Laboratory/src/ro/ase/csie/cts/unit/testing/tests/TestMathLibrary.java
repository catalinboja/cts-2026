package ro.ase.csie.cts.unit.testing.tests;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.unit.testing.MathLibrary;

public class TestMathLibrary {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRightGetSum() {
		//define input values
		int[] values = new int[] {10,20,30};
		//define expected result
		int expectedResult = 60;
		//call function and get result
		int result = MathLibrary.getSum(values);
		//assert results
		assertEquals("Testing getSum with right values", 
				expectedResult, result);
	}
	
	@Test
	public void testOrderingDescendingGetSum() {
		int[] values = new int[] {30,20,10};
		int expectedResult = 60;
		int result = MathLibrary.getSum(values);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testOrderingRandomGetSum() {
		int[] values = new int[] {5,20,1};
		int expectedResult = 26;
		int result = MathLibrary.getSum(values);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testCardinalityZeroGetSum() {
		int[] values = new int[0];
		try {
			MathLibrary.getSum(values);
			fail("No exception for empty array");
		}
		catch(UnsupportedOperationException ex) {
			assertTrue(true);
		}
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testCardinalityZeroExceptionGetSum() {
		int[] values = new int[0];
		MathLibrary.getSum(values);
	}
	
	@Test
	public void testCardinalityOneGetSum() {
		int[] values = new int[] {10};
		int expectedResult = values[0];
		int result = MathLibrary.getSum(values);
		assertEquals(expectedResult, result);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testReferenceNullGetSum() {
		int[] values = null;
		MathLibrary.getSum(values);
	}
	
	@Test
	public void testCrossCheckGetSum() {
		int[] values = new int[] {1,45,298};
		
		//to cross check we get the expected result from another function
		//use streams
		int expectedResult = IntStream.of(values).sum();
	
		int result = MathLibrary.getSum(values);
		
		assertEquals(expectedResult, result);
	}
	
	@Test 
	public void testInverseRelationGetSum() {
		int[] values = new int[] {10,10,10};
		
		//we verify that results it not 0 or negative
		// -> we conclude that if true maybe the function is ok
		int result = MathLibrary.getSum(values);
		
		if(result <= 0) {
			fail("Zero or negative for positive values");
		} else {
			assertTrue(true);
		}	
	}
	
	@Test
	public void testPerformanceGetSum() {
		int[] values = new int[1000000];
		for(int i =0; i < values.length; i++) {
			values[i] = 1;
		}
		
		double tStart = System.currentTimeMillis();
		MathLibrary.getSum(values);
		double tEnd = System.currentTimeMillis();
		
		double duration = tEnd - tStart;
		
		if(duration < 1) {
			assertTrue(true);
		} else {
			fail("Too slow");
		}
	}
	
	@Test(timeout = 500)
	public void testPerformance2GetSum() {
		
		//not ok to do this here because influences the total duration
		int[] values = new int[1000000];
		for(int i =0; i < values.length; i++) {
			values[i] = 1;
		}
		MathLibrary.getSum(values);
	}
	

}








