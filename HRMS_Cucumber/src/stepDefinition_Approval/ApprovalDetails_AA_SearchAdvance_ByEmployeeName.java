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

public class ApprovalDetails_AA_SearchAdvance_ByEmployeeName {
WebDriver driver;
	
	@Given("^Admin module, Approval module, Approval details page, advance approval tab, search box and search link$")
	public void Admin_module_Approval_module_Approval_details_page_advance_approval_tab_search_box_and_search_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000); 
	}

	@When("^Click on Approval details under approval module, click on Advance approval tab, enter the employee name and click on search link$")
	public void Click_on_Approval_details_under_approval_module_click_on_Advance_approval_tab_enter_the_employee_name_and_click_on_search_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/nav/div/a[2]")).click();
	    Thread.sleep(4000);
	    
	    WebElement search = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/input"));
	    search.click();
	    search.sendKeys("Ashna");
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[4]/table/tbody/tr[1]/td[7]")).getText();
	    String expected = "Ashna Ramroop";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(1000);
	    search.clear();
	    Thread.sleep(1000);
	}

	@Then("^System should search the advance requests which is submitted by the respective employee and display the results$")
	public void System_should_search_the_advance_requests_which_is_submitted_by_the_respective_employee_and_display_the_results() throws Throwable {    
	    WebElement search1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/input"));
	    search1.sendKeys("namik");
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[2]/div/div[2]/div[4]/table/tbody/tr[1]/td[7]")).getText();
	    String expected1 = "Namik Demiroglu";
	    Assert.assertEquals(actual1, expected1);
	    Thread.sleep(1000);
	    search1.clear();
	    Thread.sleep(1000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}