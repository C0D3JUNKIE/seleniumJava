

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestLogin {

	private static final String URL = "http://www.sanantoniobikeshop.com";
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testCorrectSignUpSuccessful(){
		driver.get(URL);
	}
}

