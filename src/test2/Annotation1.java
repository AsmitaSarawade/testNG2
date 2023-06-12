package test2;

import org.testng.annotations.*;
public class Annotation1
{
	@BeforeSuite
	public void Beforesuite()
	{
		System.out.println("Beforesuite");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("@AfterSuite");
	}

}
