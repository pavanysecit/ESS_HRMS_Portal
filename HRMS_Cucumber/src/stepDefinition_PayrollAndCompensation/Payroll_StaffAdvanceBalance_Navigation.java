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

public class Payroll_StaffAdvanceBalance_Navigation {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module and Staff Advance Balance page$")
	public void Payroll_and_Compensation_module_and_Staff_Advance_Balance_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Staff Advance Balance link under Payroll & Compensation module$")
	public void Click_on_Staff_Advance_Balance_link_under_Payroll_Compensation_module() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[7]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should navigate to the staff advance balance page$")
	public void System_should_navigate_to_the_staff_advance_balance_page() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[1]/span")).getText();
		String expected_value = "Staff Advance Balance";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}