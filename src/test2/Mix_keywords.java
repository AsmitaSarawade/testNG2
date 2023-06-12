package test2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mix_keywords {
	@Test(priority = 3,invocationCount=5)
	public void TC1()
	{
		Reporter.log("--running TC1--",true);
	}
	@Test(priority = 2,enabled=false)
	public void TC2()
	{
		Reporter.log("--running TC2--",true);
	}
	@Test(priority = 1,invocationCount=2)
	public void TC3()
	{
		Reporter.log("--running TC3--",true);
	}	

}
