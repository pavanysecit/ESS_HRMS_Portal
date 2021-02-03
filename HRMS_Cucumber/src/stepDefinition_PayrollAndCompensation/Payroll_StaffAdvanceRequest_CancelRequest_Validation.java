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

public class Payroll_StaffAdvanceRequest_CancelRequest_Validation {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Staff Advance Request page, existing advance request for which salary generated already$")
	public void Payroll_and_Compensation_module_Staff_Advance_Request_page_existing_advance_request_for_which_salary_generated_already() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@Given("^Cancel link on the request and confirm button$")
	public void Cancel_link_on_the_request_and_confirm_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	}

	@When("^Click on Staff Advance Request link under Payroll & Compensation module, Click on Cancel link and click confirm button$")
	public void Click_on_Staff_Advance_Request_link_under_Payroll_Compensation_module_Click_on_Cancel_link_and_click_confirm_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[8]/i")).click();
	    Thread.sleep(2000);
	}

	@Then("^Advance request should not get deleted if the salary is already generated for that month$")
	public void Advance_request_should_not_get_deleted_if_the_salary_is_already_generated_for_that_month() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div/div[2]/form/div/div/label")).getText();
		String expected_value = "  Please confirm the selected advance request details will be delete!";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div/div[3]/div/button[1]")).click();
		Thread.sleep(2000);
	}

	@Then("^System should display validation message$")
	public void System_should_display_validation_message() throws Throwable {
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div/div[3]/span")).getText();
		String expected_value1 = "Already Salary Generated/Request Approved";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div/div[3]/div/button[2]")).click();
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}