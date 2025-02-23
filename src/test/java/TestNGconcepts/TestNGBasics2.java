package TestNGconcepts;

import org.testng.annotations.*;

public class TestNGBasics2 {
	
	/*
	 * Annotation
	 * @Test - Testcases
	 * @BeforeMethod
	 * @AfterMethod
	 * @BeforeClass
	 * @AfterClass
	 * 
	 */
	
	@Test
	public void Testcase()
	{
		System.out.println("Testcase3");
	}
	
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class in TNBSC2");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class in TNBSC2");
	}
	
	
	@AfterTest
	public void AfterTest() {
		System.out.println("after Test");
	}

}
