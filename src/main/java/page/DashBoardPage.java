package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {
WebDriver driver;
public DashBoardPage(WebDriver driver) {
	this.driver=driver;
}
@FindBy(how=How.XPATH,using="//strong[text()='Dashboard']")WebElement DASHBOARD_HEADER_ELEMENT;

public String Dashtext() {
	String d=DASHBOARD_HEADER_ELEMENT.getText();
	return d;


}

}