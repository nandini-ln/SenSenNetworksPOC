package sensen;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sensen.commomutils.ApplicationConstants;
import com.sensen.commomutils.BaseClass;
import com.sensen.commomutils.WebDriverUtils;
import com.sensen.objectRepositoryLib.InfringementsPage;
import com.sensen.objectRepositoryLib.InitialReviewPage;
import com.sensen.objectRepositoryLib.LoginPage;

public class TS_001_Initial extends BaseClass implements ApplicationConstants{
	
	@Test
	public void initialReviewSuccessTest() throws Throwable {
	
		InitialReviewPage initReview = new InitialReviewPage(driver);
		LoginPage login= new LoginPage(driver);
		InfringementsPage infringe= new InfringementsPage(driver);
		
		//Navigate to application
		
		login.loginToApp(ApplicationConstants.userName,ApplicationConstants.password);
		
		
		//click on infringement tab
		
		//ip.clickOnInfringements;
		
		
		
		//click on Initial Review submenu
		
		//ip.clickOnInitialReview;
		//wb.waitForPageTitle()
	}
	

	

	
	
	

}
