package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Page_Objects {
	
	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement admin;
	
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement userManagement;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement users;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement userRole;
	
	@FindBy(name="searchSystemUser[status]")
	public static WebElement status;
	
	@FindBy(id="searchBtn")
	public static WebElement searchButton;
	
	
}
