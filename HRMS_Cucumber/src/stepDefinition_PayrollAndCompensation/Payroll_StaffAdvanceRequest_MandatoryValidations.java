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

public class Payroll_StaffAdvanceRequest_MandatoryValidations {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Staff Advance Request page, mandatory fields and validation message$")
	public void Payroll_and_Compensation_module_Staff_Advance_Request_page_mandatory_fields_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Staff Advance Request link under Payroll & Compensation module and click on Save button$")
	public void Click_on_Staff_Advance_Request_link_under_Payroll_Compensation_module_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[7]/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the mandatory field validation message for each field in Advance staff request page$")
	public void System_should_display_the_mandatory_field_validation_message_for_each_field_in_Advance_staff_request_page() throws Throwable {
		String actual_value = driver.findElement(By.id("spanDate")).getText();
		String expected_value = "Date is required";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		
		String actual_value1 = driver.findElement(By.id("spanCurrency")).getText();
		String expected_value1 = "Currency type is required";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		
		String actual_value2 = driver.findElement(By.id("spanAmount")).getText();
		String expected_value2 = "Amount is required";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);
		
		String actual_value3 = driver.findElement(By.id("spanPaybackCount")).getText();
		String expected_value3 = "Payback Count is required";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(1000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}