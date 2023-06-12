package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert_null_notnull {
	WebDriver driver=new FirefoxDriver();
	@BeforeTest
    public void Luanch()
    {
	
	driver.get("Https://www.Facebook.com");
	driver.manage().window().maximize();
    }
	@Test
	public void Test() {
		String actual=driver.getCurrentUrl();
		System.out.println(actual);
		Assert.assertNull(actual); 
	}
	@Test
	public void Test1() {
		String actual1=driver.getCurrentUrl();
        Assert.assertNotNull(actual1); 
	}
	@AfterTest
	public void terminate()
	{
		driver.close();
	
    }

}
