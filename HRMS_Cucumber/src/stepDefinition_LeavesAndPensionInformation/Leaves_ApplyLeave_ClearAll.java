package stepDefinition_LeavesAndPensionInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Leaves_ApplyLeave_ClearAll {
WebDriver driver;	
	
	@Given("^Leaves module, apply leave page, leave type, leave dates and clearall button$")
	public void Leaves_module_apply_leave_page_leave_type_leave_dates_and_clearall_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Apply leave under leave application status module, enter all the details and click on ClearAll button$")
	public void Click_on_Apply_leave_under_leave_application_status_module_enter_all_the_details_and_click_on_ClearAll_button() throws Throwable {
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
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[1]/div[7]/button[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should clear all the entered values in leaves form$")
	public void System_should_clear_all_the_entered_values_in_leaves_form() throws Throwable {
	    driver.quit();
	}
}