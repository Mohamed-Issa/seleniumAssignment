package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();

	public String baseURL = readConfig.getApplicationURL();
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(baseURL);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public String rondomString() {
		String genetateString = RandomStringUtils.randomAlphabetic(8);
		return genetateString;
	}

	public String rondomNumber() {
		String genetateRondomnumber = RandomStringUtils.randomNumeric(5);
		return genetateRondomnumber;
	}

}
