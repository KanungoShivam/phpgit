package PHPTravelsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogingPage extends BasePage
{

	public LogingPage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id=\"username\"]")
	WebElement user;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement pass;
	
	@FindBy(xpath="//button[@id=\"submit\"]")
	WebElement login;
	
	public void EnterUsserId(String userID)
	{
		user.sendKeys(userID);
	}
	
	public void EnterPassword(String password)
	{
		pass.sendKeys(password);
	}
	
	public void ClickLoginBtn()
	{
		login.click();
	}
}
