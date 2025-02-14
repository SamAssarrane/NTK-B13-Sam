package utils.HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksHW {
	
	public static WebDriver driver;

	// Method 1 => Opens the browser
	public static void setUp(String browserName) {

		if (browserName.equals("edge")) {

			// Set up Edge for WebdriverManager
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browserName.equals("Safari")) {
			// Set up Safari for WebdriverManager
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		} else if (browserName.equals("firefox")) {
			// Set up Safari for WebdriverManager
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		// Maximize the Webpage
		driver.manage().window().maximize();
	}

	// Method 2 => Closes the browser
	public static void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
	
}
