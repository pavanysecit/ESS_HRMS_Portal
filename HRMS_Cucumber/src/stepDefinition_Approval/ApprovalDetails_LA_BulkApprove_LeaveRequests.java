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

public class ApprovalDetails_LA_BulkApprove_LeaveRequests {
WebDriver driver;	
	
	@Given("^Admin module, Approval module, Approval details page, leave approval tab, bulk Approve button and close button$")
	public void Admin_module_Approval_module_Approval_details_page_leave_approval_tab_bulk_Approve_button_and_close_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Approval details link under Approval module, select the leave requests, click on Bulk Approve button and click on Close button$")
	public void Click_on_Approval_details_link_under_Approval_module_select_the_leave_requests_click_on_Bulk_Approve_button_and_click_on_Close_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[1]/td[12]/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[2]/td[12]/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[3]/td[12]/input")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[2]/button[1]")).click();
	    Thread.sleep(4000);
	}

	@Then("^All the selected Leave requests should get approved and confirmation message should be displayed$")
	public void All_the_selected_Leave_requests_should_get_approved_and_confirmation_message_should_be_displayed() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[3]/div/div/div[2]/form/div/div/label")).getText();
	    String expected_value = "  Leave has been Approved";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[3]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^After bulk approval, employees leave count should get deducted from their leave balance$")
	public void After_bulk_approval_employees_leave_count_should_get_deducted_from_their_leave_balance() throws Throwable {
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}