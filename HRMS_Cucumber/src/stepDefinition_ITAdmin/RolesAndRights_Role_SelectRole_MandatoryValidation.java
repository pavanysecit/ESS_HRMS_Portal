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

public class RolesAndRights_Role_SelectRole_MandatoryValidation {
WebDriver driver;
	
	@Given("^Admin module, IT Admin module, Roles & Rights page, Submit button and validation message$")
	public void Admin_module_IT_Admin_module_Roles_Rights_page_Submit_button_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, Click on Submit button wihtout select role$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_Click_on_Submit_button_wihtout_select_role() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/form/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the mandatory field validation message for not selecting the role and clicking on submit button$")
	public void System_should_display_the_mandatory_field_validation_message_for_not_selecting_the_role_and_clicking_on_submit_button() throws Throwable {
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/form/span")).getText();
		String expected = "Please Select Role";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
    
	    new HRMS_LogOut(driver);
	}
}