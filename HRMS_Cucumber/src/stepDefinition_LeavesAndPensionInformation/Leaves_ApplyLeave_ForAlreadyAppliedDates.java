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

public class Leaves_ApplyLeave_ForAlreadyAppliedDates {
WebDriver driver;	
	
	@Given("^Leaves module, apply leave page, leave type, leave dates, description and validation message$")
	public void Leaves_module_apply_leave_page_leave_type_leave_dates_description_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Apply leave under leave application status module, select existing dates and click on submit$")
	public void Click_on_Apply_leave_under_leave_application_status_module_select_existing_dates_and_click_on_submit() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/a/span[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/ul/li/a")).click();
	    Thread.sleep(2000);
	    
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
	}

	@Then("^System should display the validation message and leave request should not get submitted$")
	public void System_should_display_the_validation_message_and_leave_request_should_not_get_submitted() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[1]/span")).getText();
		String expected_value = "Already Leave Applied for this Date";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);	
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(2000);	
	    driver.quit();
	}
}