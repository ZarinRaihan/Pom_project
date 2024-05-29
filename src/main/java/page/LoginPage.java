package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
public LoginPage(WebDriver driver) { // constructor for test package
	this.driver=driver;
}
	/// WebElements varibale declaration 
	//By User_Name_Field=By.xpath("//*[@id=\"user_name\"]");
	//WebElement USER_NAME_ELEMENT1 =driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
	@FindBy(how = How.XPATH, using ="//*[@id=\"user_name\"]")
	static  WebElement USER_Name_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"password\"]")
	static WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"login_submit\"]")
	static WebElement SIGNIN_ELEMENT;
	
	
	public static void InsertuserName(String userName) {
		USER_Name_ELEMENT.sendKeys(userName);
	
	}
	public static void Pass(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public static void clickSign() {
		SIGNIN_ELEMENT.click();
	}
	//combined method
	public void performLogin(String userName,String password) {
		USER_Name_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_ELEMENT.click();
	}
}
