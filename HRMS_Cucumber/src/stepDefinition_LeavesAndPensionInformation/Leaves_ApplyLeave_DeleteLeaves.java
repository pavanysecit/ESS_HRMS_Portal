package stepDefinition_LeavesAndPensionInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Leaves_ApplyLeave_DeleteLeaves {
WebDriver driver;	
	
	@Given("^Leaves module, apply leave page, leave requests and delete link$")
	public void Leaves_module_apply_leave_page_leave_requests_and_delete_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Apply leave under leave application status module and click on delete icon$")
	public void Click_on_Apply_leave_under_leave_application_status_module_and_click_on_delete_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/ul/li/a")).click();
	    Thread.sleep(2000);
	    
	    // Applying new leave request
	    WebElement LT = driver.findElement(By.id("leavetype"));
	    Select se = new  Select(LT);
	    se.selectByVisibleText("ANNUAL LEAVE");
	    Thread.sleep(2000);
	    
	    //Selecting From Date
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[1]/div[3]/div/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[31]")).click();
	    Thread.sleep(2000);
	    
	    //Selecting To Date
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[1]/div[4]/div/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[31]")).click();
	    Thread.sleep(2000);
	    
	    WebElement DSC = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[1]/div[6]/textarea"));
	    DSC.sendKeys("New year celebration 2019");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[1]/div[7]/button[1]")).click();
	    Thread.sleep(2000);
	    
	    // Clicking on delete icon
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[12]/i")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should ask for confirmation before delete$")
	public void System_should_ask_for_confirmation_before_delete() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/form/div/div/label")).getText();
		String expected_value = "  Please confirm the selected leave details will be delete!!!!!";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);	
		
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div/div/div/div[3]/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Leave request should get deleted and deleted leaves count should get added to leave balance$")
	public void Leave_request_should_get_deleted_and_deleted_leaves_count_should_get_added_to_leave_balance() throws Throwable {
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}