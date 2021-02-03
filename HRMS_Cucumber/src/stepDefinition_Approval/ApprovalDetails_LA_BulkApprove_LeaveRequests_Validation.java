package stepDefinition_Approval;

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

public class ApprovalDetails_LA_BulkApprove_LeaveRequests_Validation {
WebDriver driver;
	
	@Given("^Admin module, Approval module, Approval details page, Leave approval tab, bulk Approve button and validation message$")
	public void Admin_module_Approval_module_Approval_details_page_Leave_approval_tab_bulk_Approve_button_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000); 
	}

	@When("^Click on Approval details link under Approval module, dont select the Leave requests and click on Bulk Approve button$")
	public void Click_on_Approval_details_link_under_Approval_module_dont_select_the_Leave_requests_and_click_on_Bulk_Approve_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[2]/button[1]")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should display the validation message for not selecting the Leave requests and clicking on bulk approve button$")
	public void System_should_display_the_validation_message_for_not_selecting_the_Leave_requests_and_clicking_on_bulk_approve_button() throws Throwable {
	    String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[3]/span")).getText();
	    String expected = "Select Atleast one Employee";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}