

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestLogin {

	private static final String URL = "http://www.sanantoniobikeshop.com/contact";
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testCorrectSignUpSuccessful(){
		driver.get(URL);
		driver.findElement(By.cssSelector("input[name=FirstName]")).sendKeys("Albert");
		driver.findElement(By.cssSelector("input[name=LastName]")).sendKeys("Bustamante");
		driver.findElement(By.cssSelector("input[name=EmailAddress]")).sendKeys("albertbustamante@hotmail.com");
		driver.findElement(By.cssSelector("input[name=CellPhone]")).sendKeys("210 393 4555");
		driver.findElement(By.cssSelector("input[name=HomePhone]")).sendKeys("210-393-4555");
//	driver.findElement(By.cssSelector("input[name=CAT_Custom_869]")).sendKeys("***PLEASE IGNORE *** ***THIS IS A TEST***");
		
		}
}

