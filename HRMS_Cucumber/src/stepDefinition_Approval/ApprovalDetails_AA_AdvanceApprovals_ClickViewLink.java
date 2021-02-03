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

public class ApprovalDetails_AA_AdvanceApprovals_ClickViewLink {
WebDriver driver;
	
	@Given("^Admin module, Approval module, Approval details page, Advance approval tab, View link and close button$")
	public void Admin_module_Approval_module_Approval_details_page_Advance_approval_tab_View_link_and_close_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}
	
	@When("^Click on Approval details under approval module, click on Advance approval tab, click on view link and click on close button$")
	public void Click_on_Approval_details_under_approval_module_click_on_Advance_approval_tab_click_on_view_link_and_click_on_close_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/nav/div/a[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[4]/table/tbody/tr[1]/td[14]/a")).click();
	    Thread.sleep(4000);
	}
	
	@Then("^System should display Payback schedule of the advance request submitted by an employee on click of view link$")
	public void System_should_display_Payback_schedule_of_the_advance_request_submitted_by_an_employee_on_click_of_view_link() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[7]/div/div/div[1]/h4")).getText();
	    String expected_value = "PAYBACK SCHEDULES";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[7]/div/div/div[4]/button")).click();
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}