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

public class ApprovalDetails_AA_Individual_AdvanceApprove {
WebDriver driver;
	
	@Given("^Admin module, Approval module, Approval details page, Advance approval tab, Approve button and close button$")
	public void Admin_module_Approval_module_Approval_details_page_Advance_approval_tab_Approve_button_and_close_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000); 
	}

	@When("^Click on Approval details link under Approval module, click on Approve button under Advance approval tab and click on Close button$")
	public void Click_on_Approval_details_link_under_Approval_module_click_on_Approve_button_under_Advance_approval_tab_and_click_on_Close_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/nav/div/a[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[4]/table/tbody/tr/td[15]/button[1]")).click();
	    Thread.sleep(3000);
	}

	@Then("^Advance request should get approved and confirmation message should be displayed$")
	public void Advance_request_should_get_approved_and_confirmation_message_should_be_displayed() throws Throwable {
	    String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[5]/div/div/div[2]/form/div/div/label")).getText();
	    String expected = "   Request has been Approved";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[5]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}