package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;



public class Assert_Equals_notequals {
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
		Assert.assertEquals(actual, expected);
		}
		@Test
		public void Test1() {
		String expected="Google";
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertNotEquals(actual, expected);
		}
		@Test
		public void Test2() 
		{
			Assert.assertEquals(10, 10);
		}
		@AfterTest
		public void terminate()
		{
			driver.close();
		
	}

}
