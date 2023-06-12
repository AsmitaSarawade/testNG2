package test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Google {
	WebDriver driver=new ChromeDriver();
	@Test
	public void Open_webpage()
	{
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
	}
	@Test
	public void Enter_mno_pass_click() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\policybazaar.xlsx");
		String mno=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(mno);
		//Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		//String pass=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sanjay@23");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	}
	

}
