package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Dashboard_Page_objects;
import pageObjects.Login_Page_Objects;

public class Test_Pending_Leave_Request extends CommonFunctions {
	@Test
	public static void initialLogin() {

		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.username.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.loginButton.click();

	}

	@Test
	public void verifyPendingLeaveRequest() {

		PageFactory.initElements(driver, Dashboard_Page_objects.class);
		String actualmassege = Dashboard_Page_objects.PendingLeaveRequest.getText();
		Assert.assertEquals(actualmassege, "No Records are Available");

	}

}
