package testpack;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNg {
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("TESTbefore");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BEFORECLASS");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFOREMETHOD");
	}
	
	@Test 
	public void test1()
	{
		System.out.println("TEST1");
	}
	@Test 
	public void test2()
	{
		System.out.println("TEST2");
	}
	@Test 
	public void test3()
	{
		System.out.println("TEST3");
		
	}
	
	@Test 
	public void test4()
	{
		System.out.println("TEST4");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AFTERMETHOD");
	}
	
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("AFTERCLASS");
	}
	

	@AfterTest
	public void aftertest()
	{
		System.out.println("TESTafter");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
