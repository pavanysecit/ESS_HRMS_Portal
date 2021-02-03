package stepDefinition_ITAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class RolesAndRights_SubMenu_CreateNew {
WebDriver driver;	
	
	@Given("^Admin module, IT Admin module, Roles And Rights page, Menu list and Add SubMenu button$")
	public void Admin_module_IT_Admin_module_Roles_And_Rights_page_Menu_list_and_Add_SubMenu_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, select the menu from the drop down and click on Add SubMenu button$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_select_the_menu_from_the_drop_down_and_click_on_Add_SubMenu_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement menu = driver.findElement(By.id("ParentMenu"));
	    Select se = new Select(menu);
	    se.selectByVisibleText("PF Details");
	    Thread.sleep(2000);
	    
	    WebElement submenu = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/div[2]/div[1]/div/input"));
	    submenu.sendKeys("PF Withdraw");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/div[3]/div/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^New SubMenu should get created under selected parent menu successfully and should be visible under the parent menu$")
	public void New_SubMenu_should_get_created_under_selected_parent_menu_successfully_and_should_be_visible_under_the_parent_menu() throws Throwable {
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/span")).getText();
		String expected = "Menu Added";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		
		new HRMS_LogOut(driver);
	}
}