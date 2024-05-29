package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Browse {
		static WebDriver driver;
		public  static WebDriver init() {

			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://codefios.com/ebilling/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver; // this is done to connect the driver in the test package

		}
		public static void tearDown() {
			driver.close();
			driver.quit();
		}
	}
