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

public class ApprovalDetails_LA_NavigationTo_LeavesAndAdvanceTab {
WebDriver driver;	
	
	@Given("^Admin module, Approval module, Approval details page, leave approval tab and advance approval tab$")
	public void Admin_module_Approval_module_Approval_details_page_leave_approval_tab_and_advance_approval_tab() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Approval details link under Approval module, click on leave approval tab and then click on advance approval tab$")
	public void Click_on_Approval_details_link_under_Approval_module_click_on_leave_approval_tab_and_then_click_on_advance_approval_tab() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/nav/div/a[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should navigate to the leave apporval screen and advance approval screen on respective clicks$")
	public void System_should_navigate_to_the_leave_apporval_screen_and_advance_approval_screen_on_respective_clicks() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/nav/div/a[1]")).getText();
	    String expected_value = "Leave Approval";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/nav/div/a[2]")).click();
	    Thread.sleep(2000);
	    
	    String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/nav/div/a[2]")).getText();
	    String expected_value1 = "Advance Approval";
	    Assert.assertEquals(actual_value1, expected_value1);
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}