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

public class Leaves_ApplyLeave_DeleteLeaves_Validations {
WebDriver driver;	
	
	@Given("^Leaves module, apply leave page, leave requests, delete link and validation message$")
	public void Leaves_module_apply_leave_page_leave_requests_delete_link_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Apply leave and click on delete icon on leave request for which salary already generated$")
	public void Click_on_Apply_leave_and_click_on_delete_icon_on_leave_request_for_which_salary_already_generated() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/ul/li/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[2]/td[12]/i")).click();
	    Thread.sleep(2000);
	}

	@Then("^Leave request should not get deleted and system should display validation message$")
	public void Leave_request_should_not_get_deleted_and_system_should_display_validation_message() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/span")).getText();
		String expected_value = "Already Salary generated, this Leave Request should not be cancelled";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);	
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}