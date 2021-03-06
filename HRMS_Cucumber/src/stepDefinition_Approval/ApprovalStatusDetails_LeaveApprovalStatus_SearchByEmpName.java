package stepDefinition_Approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class ApprovalStatusDetails_LeaveApprovalStatus_SearchByEmpName {
WebDriver driver;
	
	@Given("^Admin module, Approval module, Approval status details page, leave approval status tab, search box and search link$")
	public void Admin_module_Approval_module_Approval_status_details_page_leave_approval_status_tab_search_box_and_search_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Approval status details under approval module, enter the employee name and click on search link$")
	public void Click_on_Approval_status_details_under_approval_module_enter_the_employee_name_and_click_on_search_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement search = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/input"));
	    search.click();
	    search.sendKeys("Ashna");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
	    String expected = "Ashna";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(1000);
	    search.clear();
	    Thread.sleep(1000);
	}

	@Then("^System should search the leave request which is submitted by the respective employee and display the leave approval status details$")
	public void System_should_search_the_leave_request_which_is_submitted_by_the_respective_employee_and_display_the_leave_approval_status_details() throws Throwable {
	    WebElement search1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/input"));
	    search1.click();
	    search1.sendKeys("randall");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
	    String expected1 = "Randall";
	    Assert.assertEquals(actual1, expected1);
	    Thread.sleep(1000);
	    search1.clear();
	    Thread.sleep(1000);
	    
	    WebElement search2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/input"));
	    search2.click();
	    search2.sendKeys("ortwin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
	    String expected2 = "Ortwin";
	    Assert.assertEquals(expected2, actual2);
	    Thread.sleep(1000);
	    search2.clear();
	    Thread.sleep(1000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}