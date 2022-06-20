package jUnitExamples;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertJUnitTests extends ParentTest {

	@Test
	public void useAssertEquals() {
		String a = "5";
		int b = 5;
		assertEquals(Integer.parseInt(a), b);
	}
	
	@Test
	public void useAssertTrue() {
		int a = 5;
		int b = 4;
		assertTrue(a > b);
	}
	
	@Test
	public void useAssertNotNull() {
		int b = 4;
		assertNotNull(b);
	}
	
	@Test
	@Ignore
	public void ignoredTest() {

		System.out.println(" I am ignored !");
	}

}
