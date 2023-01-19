package PHPTravelsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutOage extends BasePage
{
	
	public LogoutOage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h1[normalize-space()=\"Logged In Successfully\"]") // MyAccount Page heading
	WebElement msgHeading;

	public boolean isMyPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	
	
	@FindBy(xpath="//a[normalize-space()=\"Log out\"]")
	WebElement logout;
	
	public void ClickLogout()
	{
		logout.click();
	}

}
