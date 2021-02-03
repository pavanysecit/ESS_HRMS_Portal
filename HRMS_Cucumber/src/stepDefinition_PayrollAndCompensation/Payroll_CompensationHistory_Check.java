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

public class Payroll_CompensationHistory_Check {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Compensation page and Compensation history$")
	public void Payroll_and_Compensation_module_Compensation_page_and_Compensation_history() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Compensation history under Payroll and Compensation module$")
	public void Click_on_Compensation_history_under_Payroll_and_Compensation_module() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the compensation history of the current employee$")
	public void System_should_display_the_compensation_history_of_the_current_employee() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[1]/div/span")).getText();
		String expected_value = "Compensation History";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);	
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}