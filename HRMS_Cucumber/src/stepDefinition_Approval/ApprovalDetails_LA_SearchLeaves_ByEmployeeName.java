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

public class ApprovalDetails_LA_SearchLeaves_ByEmployeeName {
WebDriver driver;	
	
	@Given("^Admin module, Approval module, Approval details page, leave approval tab, search box and search link$")
	public void Admin_module_Approval_module_Approval_details_page_leave_approval_tab_search_box_and_search_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Approval details under approval module, enter the employee name and click on search link$")
	public void Click_on_Approval_details_under_approval_module_enter_the_employee_name_and_click_on_search_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should search the leave requests which is submitted by the respective employee and display the results$")
	public void System_should_search_the_leave_requests_which_is_submitted_by_the_respective_employee_and_display_the_results() throws Throwable {
		WebElement ename = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/input"));
		ename.sendKeys("Ashna");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]")).getText();
	    String expected_value = "Ashna Ramroop";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(1000);
	    ename.clear();
	    Thread.sleep(1000);
	    
		WebElement ename1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/input"));
		ename1.sendKeys("namik");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]")).getText();
	    String expected_value2 = "Namik Demiroglu";
	    Assert.assertEquals(actual_value2, expected_value2);
	    Thread.sleep(1000);
	    ename1.clear();
	    Thread.sleep(1000);
	    
		WebElement ename2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/input"));
		ename2.sendKeys("hemra");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual_value3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]")).getText();
	    String expected_value3 = "Hemradjie Ghisaidoobe";
	    Assert.assertEquals(actual_value3, expected_value3);
	    Thread.sleep(1000);
	    ename2.clear();
	    Thread.sleep(1000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}