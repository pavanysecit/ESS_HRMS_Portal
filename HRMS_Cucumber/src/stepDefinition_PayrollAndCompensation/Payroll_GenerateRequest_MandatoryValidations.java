package stepDefinition_PayrollAndCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Payroll_GenerateRequest_MandatoryValidations {
WebDriver driver;
	
	@Given("^Payroll and Compensation module, Generate Request page, mandatory fields and validation message$")
	public void Payroll_and_Compensation_module_Generate_Request_page_mandatory_fields_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Generate Request link under Payroll & Compensation module and click on Submit button$")
	public void Click_on_Generate_Request_link_under_Payroll_Compensation_module_and_click_on_Submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[8]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[1]/form/div/sp/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the mandatory field validation message for each field in Generate Request page$")
	public void System_should_display_the_mandatory_field_validation_message_for_each_field_in_Generate_Request_page() throws Throwable {
		String actual_value = driver.findElement(By.id("spanError")).getText();
		String expected_value = "Please add Message";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}