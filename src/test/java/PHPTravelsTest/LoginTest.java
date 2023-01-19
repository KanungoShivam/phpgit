package PHPTravelsTest;

import org.testng.Assert;
import org.testng.annotations.Test;


import PHPTravelsPageObject.LogingPage;
import PHPTravelsPageObject.LogoutOage;

public class LoginTest extends BaseClass
{

	
		@Test
		public void test_Login()
		{
			logger.info("******Starting LoginTest******");
			
			try
			{				
				
				LogingPage lp=new LogingPage(driver);
				
				lp.EnterUsserId(rb.getString("email")); // valid email, get it from properties file
				
				lp.EnterPassword(rb.getString("password")); // valid password, get it from properties file
				
				lp.ClickLoginBtn();
				
				LogoutOage lo = new LogoutOage(driver);
				boolean targetpage = lo.isMyPageExists();
							
				Assert.assertEquals(targetpage, true);
				Thread.sleep(3000);
				lo.ClickLogout();
				
				
			}	
			catch(Exception e)
			{
				Assert.fail();
			}
			logger.info(" ******Finished LoginTest****** ");
			
			}
		
		
		
		
	
}
