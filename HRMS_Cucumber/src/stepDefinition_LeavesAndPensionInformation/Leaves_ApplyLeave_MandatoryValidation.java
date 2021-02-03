package stepDefinition_LeavesAndPensionInformation;

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

public class Leaves_ApplyLeave_MandatoryValidation {
WebDriver driver;	
	
	@Given("^Leaves module, apply leave page, submit button and mandatory field validation message$")
	public void Leaves_module_apply_leave_page_submit_button_and_mandatory_field_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Apply leave under leave application status module and click on ClearAll button$")
	public void Click_on_Apply_leave_under_leave_application_status_module_and_click_on_ClearAll_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/a/span[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/ul/li/a")).click();
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[1]/div[7]/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the mandatory field validation message for not entering the mandatory details$")
	public void System_should_display_the_mandatory_field_validation_message_for_not_entering_the_mandatory_details() throws Throwable {
		String actual_value = driver.findElement(By.id("spanLeaveType")).getText();
		String expected_value = "Leave Type is required";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);	
		
		String actual_value1 = driver.findElement(By.id("spanFromDate")).getText();
		String expected_value1 = "From Date is required";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);	
		
		String actual_value2 = driver.findElement(By.id("spanToDate")).getText();
		String expected_value2 = "To Date is required";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);	
		
		String actual_value3 = driver.findElement(By.id("spanDescription")).getText();
		String expected_value3 = "Description is required";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(2000);	
	    driver.quit();
	}
}