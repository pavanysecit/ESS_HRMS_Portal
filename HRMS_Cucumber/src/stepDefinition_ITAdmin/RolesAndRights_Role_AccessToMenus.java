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

public class RolesAndRights_Role_AccessToMenus {
WebDriver driver;
	
	@Given("^Admin module, IT Admin module, Roles & Rights page, Role drop down, readable & writable check box and submit button$")
	public void Admin_module_IT_Admin_module_Roles_Rights_page_Role_drop_down_readable_writable_check_box_and_submit_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, select the role from drop down, enable readable & writable checkboxs and click on Submit button$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_select_the_role_from_drop_down_enable_readable_writable_checkboxs_and_click_on_Submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement role = driver.findElement(By.id("Roles"));
	    Select se = new Select(role);
	    se.selectByVisibleText("IT Specialist");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/input")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/table/tbody/tr[2]/td[3]/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/table/tbody/tr[2]/td[4]/input")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/form/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^Selected role should get access to the selected menu controls$")
	public void Selected_role_should_get_access_to_the_selected_menu_controls() throws Throwable {
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/span")).getText();
		String expected = "Rights Updated";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	}
}