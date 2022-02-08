package testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.Authentication.User;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.User_Page_Objects;

public class Test_User_Role extends CommonFunctions {
	@Test
	public void checkUserRole() {
		PageFactory.initElements(driver, User_Page_Objects.class);
		movetToUserPage();
		selectUserRole();
		selectStatus();
		searchButton();
	}

	public void movetToUserPage() {
		Actions action = new Actions(driver);
		action.moveToElement(User_Page_Objects.admin);
		action.moveToElement(User_Page_Objects.userManagement);
		action.moveToElement(User_Page_Objects.users);
		action.click().build().perform();
	}

	public void selectUserRole() {
		Select select = new Select(User_Page_Objects.userRole);
		select.selectByIndex(1);

	}
	public void selectStatus() {
		Select select = new Select(User_Page_Objects.status);
		select.selectByIndex(1);
	
	}
	public void searchButton() {
		User_Page_Objects.searchButton.click();
	}
	

}
