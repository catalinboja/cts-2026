package ro.ase.csie.cts.unit.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.unit.testing.MathLibrary;

public class MathTests {

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
	public void testGetMinimumRightResult() {
		//define input data
		int[] values = new int[] {10,20,45,5};
		//define exptected result
		int expectedResult = 5;
		//call the method and get the result
		int result = MathLibrary.getMinimum(values);
		//check the result vs expected
		
		//NOT here
//		if(result != expectedResult) {
//			System.out.println("The method is wrong");
//		}
		
		assertEquals(expectedResult, result);
		
	}

}






