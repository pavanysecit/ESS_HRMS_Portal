package stepDefinition_ITAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class RolesAndRights_SubMenu_IsActive {
WebDriver driver;
	
	@Given("^Admin module, IT Admin module, Roles And Rights page, edit icon, IsActive checkbox and Add SubMenu button$")
	public void Admin_module_IT_Admin_module_Roles_And_Rights_page_edit_icon_IsActive_checkbox_and_Add_SubMenu_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, click on edit link on submenu, disbale IsActive checkbox and click on Add SubMenu button$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_click_on_edit_link_on_submenu_disbale_IsActive_checkbox_and_click_on_Add_SubMenu_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement Element = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/div/div/table/tbody/tr[31]/td[2]"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/div/div/table/tbody/tr[31]/td[4]/i")).click();
        Thread.sleep(2000);
        
        
	    WebElement Element1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/div[1]/button"));
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", Element1);
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/div[2]/div[2]/div/input")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/div[3]/div/button[1]")).click();
        Thread.sleep(2000);
	}

	@Then("^SubMenu should get Inactive and should not be visible under menu control in the left panel$")
	public void SubMenu_should_get_Inactive_and_should_not_be_visible_under_menu_control_in_the_left_panel() throws Throwable {
	    WebElement Element2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/div/span"));
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView();", Element2);
        Thread.sleep(2000);
        
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/span")).getText();
		String expected = "Menu Updated";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		
		new HRMS_LogOut(driver);
	}
}