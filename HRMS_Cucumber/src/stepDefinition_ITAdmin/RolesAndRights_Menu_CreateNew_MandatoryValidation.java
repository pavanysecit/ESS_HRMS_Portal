package stepDefinition_ITAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class RolesAndRights_Menu_CreateNew_MandatoryValidation {
WebDriver driver;	
	
	@Given("^Admin module, IT Admin module, Roles & Rights page, Add Menu button, Save button and validation message$")
	public void Admin_module_IT_Admin_module_Roles_Rights_page_Add_Menu_button_Save_button_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, Click on add menu button and click on Save button$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_Click_on_add_menu_button_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/div[1]/button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[1]/form/div[2]/div/button[1]")).click();
	    Thread.sleep(1000);
	}

	@Then("^System should display the mandatory field validation message for not entering the mandatory details in add menu page$")
	public void System_should_display_the_mandatory_field_validation_message_for_not_entering_the_mandatory_details_in_add_menu_page() throws Throwable {
		String actual = driver.findElement(By.id("spanAddMenu")).getText();
		String expected = "Please Add Menu";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[4]/button")).click();
		Thread.sleep(2000);
		
		new HRMS_LogOut(driver);
	}
}