package jUnitExamples;

import org.junit.After;
import org.junit.Before;

public class ParentTest {
	@Before
	public void setUp() {
		System.out.println("Set up");
	}
	
	@After
	public void tearDown() {
		System.out.println("Tear Down");
	}

}
