package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert_Identical_same_notSame {
	WebDriver driver=new FirefoxDriver();
    @BeforeTest
    public void Luanch()
    {
	
	driver.get("Https://www.Facebook.com");
	driver.manage().window().maximize();
	String actual=driver.getTitle();
    }
    @Test
	public void Test() {
	String expected="Google";
	String actual=driver.getTitle();
	System.out.println(actual);
	Assert.assertSame(actual, expected);
	}
    @Test
	public void Test1() {
	String expected="Facebook";
	String actual=driver.getTitle();
	System.out.println(actual);
	Assert.assertSame(actual, expected);
	}
    @AfterTest
	public void terminate()
	{
		driver.close();
	
}

}
