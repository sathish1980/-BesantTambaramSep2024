package TestNGconcepts;

import org.testng.annotations.*;

public class TestNGBasics {
	
	/*
	 * Annotation
	 * @Test - Testcases
	 * @BeforeMethod
	 * @AfterMethod
	 * @BeforeClass
	 * @AfterClass
	 * @BeforeTest
	 * @AfterTest
	 * @BeforeSuite
	 * @AfterSuite
	 */
	
	@Test
	public void Testcase()
	{
		System.out.println("Testcase1");
	}
	
	@Test
	public void Testcase2()
	{
		System.out.println("Testcase2");
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}
	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	

}
