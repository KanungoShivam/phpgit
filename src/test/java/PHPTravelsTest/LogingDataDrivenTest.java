package PHPTravelsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PHPTravelsPageObject.LogingPage;
import PHPTravelsPageObject.LogoutOage;
import PHPTravelsUtilities.DataProviders;

public class LogingDataDrivenTest extends BaseClass
{
		@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
		public void test_LoginDDT(String user, String pwd, String exp) 
		{
		
		logger.info("******Starting LoginDataDrivenTest******");
		
		try
		{				
			
			LogingPage lp=new LogingPage(driver);
			
			lp.EnterUsserId(user); // valid email, get it from properties file
			logger.info("username is entered");
			lp.EnterPassword(pwd); // valid password, get it from properties file
			logger.info("password is entered");
			lp.ClickLoginBtn();
			
			LogoutOage lo = new LogoutOage(driver);
			boolean targetpage = lo.isMyPageExists();// this method is created MyAccountPage

			if (exp.equals("valid")) {
				if (targetpage == true) {
					lo.ClickLogout();
					logger.info("Logout for validis succesful");
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equals("invalid")) {
				if (targetpage == true) {
					LogoutOage loiv = new LogoutOage(driver);
					loiv.ClickLogout();
					logger.info("logout for InValid is successful");
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" ******Finished LoginDataDrivenTest****** ");
		
		}
	
}
