package stepDefinition_PayrollAndCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Payroll_StaffAdvanceBalance_ViewPaybackSchedule {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, staff advance balance page, view link and payback schedule details$")
	public void Payroll_and_Compensation_module_staff_advance_balance_page_view_link_and_payback_schedule_details() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on staff advance balance under Payroll and Compensation module and click on View link$")
	public void Click_on_staff_advance_balance_under_Payroll_and_Compensation_module_and_click_on_View_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[3]/div[4]/div[3]/div/table/tbody/tr[1]/td[7]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the payback schedule details for the closed advance requests$")
	public void System_should_display_the_payback_schedule_details_for_the_closed_advance_requests() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[3]/div[6]/div/div/div[1]/h4")).getText();
		String expected_value = "EMI Form";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[3]/div[6]/div/div/div[2]/div/button")).click();
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}