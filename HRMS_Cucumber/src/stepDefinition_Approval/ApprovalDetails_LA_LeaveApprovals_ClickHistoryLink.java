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

public class ApprovalDetails_LA_LeaveApprovals_ClickHistoryLink {
WebDriver driver;

	@Given("^Admin module, Approval module, Approval details page, leave approval tab, history link and close button$")
	public void Admin_module_Approval_module_Approval_details_page_leave_approval_tab_history_link_and_close_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}
	
	@When("^Click on Approval details under approval module, click on history link and click on close button$")
	public void Click_on_Approval_details_under_approval_module_click_on_history_link_and_click_on_close_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[1]/td[10]/a")).click();
	    Thread.sleep(2000);
	}
	
	@Then("^System should display leave balance of the employee on click of history link$")
	public void System_should_display_leave_balance_of_the_employee_on_click_of_history_link() throws Throwable {
	    String actualvalue = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/div[1]/div/div/div[1]/h4")).getText();
	    String expectedvalue = "Leave Balance";
	    Assert.assertEquals(actualvalue, expectedvalue);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/div[1]/div/div/div[3]/button")).click();
	    Thread.sleep(1000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}