package test2;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeClass
	public void Openbrowser()
	{
		Reporter.log("Open Browser");
	}
	@BeforeMethod
	public void Login()
	{
		Reporter.log("Login inti application");
	}
	@Test
	public void EnterFullName()
	{
		Reporter.log("Enter Full name");
	}
	@Test
	public void EnterPassword()
	{
		Reporter.log("Enter password");
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout from application");
	}
	
	@AfterClass
	public void Closebrowser()
	{
		Reporter.log("Close the Broeser");
	}

}
