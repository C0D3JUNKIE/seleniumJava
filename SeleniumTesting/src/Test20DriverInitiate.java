
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Test20DriverInitiate {

	private WebDriver driver;
	
		@Before
		public void testSetup() {
			driver = new FirefoxDriver();
		}
	
		@After
		public void testTeardown() {
			driver.close();
		}

		@Test
		public void 
}
