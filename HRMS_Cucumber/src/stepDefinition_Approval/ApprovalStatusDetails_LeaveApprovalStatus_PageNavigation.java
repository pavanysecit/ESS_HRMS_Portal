package stepDefinition_Approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class ApprovalStatusDetails_LeaveApprovalStatus_PageNavigation {
WebDriver driver;
	
	@Given("^Admin module, Approval module, Approval status details page, leave approval status tab, next and prev buttons$")
	public void Admin_module_Approval_module_Approval_status_details_page_leave_approval_status_tab_next_and_prev_buttons() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Approval status details under approval module and click on Next & Prev buttons$")
	public void Click_on_Approval_status_details_under_approval_module_and_click_on_Next_Prev_buttons() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/div/ul/li[3]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/div/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should navigate to different leave request approval status pages when user clicks on next and prev button$")
	public void System_should_navigate_to_different_leave_request_approval_status_pages_when_user_clicks_on_next_and_prev_button() throws Throwable {
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}