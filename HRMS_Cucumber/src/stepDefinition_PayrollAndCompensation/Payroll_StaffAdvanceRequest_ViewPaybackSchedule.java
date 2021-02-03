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

public class Payroll_StaffAdvanceRequest_ViewPaybackSchedule {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Staff Advance Request page, existing advance requests and view link$")
	public void Payroll_and_Compensation_module_Staff_Advance_Request_page_existing_advance_requests_and_view_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Staff Advance Request link under Payroll & Compensation module and click on View link available on the advance requests$")
	public void Click_on_Staff_Advance_Request_link_under_Payroll_Compensation_module_and_click_on_View_link_available_on_the_advance_requests() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[6]/a")).click();
	    Thread.sleep(4000);
	}

	@Then("^System should display the payback schedule details for existing requests in a popup$")
	public void System_should_display_the_payback_schedule_details_for_existing_requests_in_a_popup() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[4]/div/div/div[1]/h4")).getText();
		String expected_value = "PAYBACK SCHEDULES";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[4]/div/div/div[2]/div[1]/label[2]")).getText();
		String expected_value1 = "5645";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[4]/div/div/div[4]/button")).click();
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}