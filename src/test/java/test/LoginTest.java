package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.Browse;

public class LoginTest {
	WebDriver driver;
	@Test
	public void UsershouldLoginIn() {
		Browse.init();
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class); // POM object
		LoginPage.InsertuserName("demo@techfios.com");
		LoginPage.Pass("abc123");
		LoginPage.clickSign();
		DashBoardPage dashboardpage=PageFactory.initElements(driver, DashBoardPage.class);
		
		Assert.assertEquals(dashboardpage.Dashtext(), "Dashboard", "not");
		Browse.tearDown();
	}

}
