package stepDefinition_PayrollAndCompensation;

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

public class Payroll_StaffAdvanceRequest_RequestForAdvacne {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Staff Advance Request page, date, amount,currency, paybak count and save button$")
	public void Payroll_and_Compensation_module_Staff_Advance_Request_page_date_amount_currency_paybak_count_and_save_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Staff Advance Request link under Payroll & Compensation module, enter all the details and click on Save button$")
	public void Click_on_Staff_Advance_Request_link_under_Payroll_Compensation_module_enter_all_the_details_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement date = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[3]/div/input"));
	    date.sendKeys("06-Dec-2018");
	    Thread.sleep(2000);
	    
	    WebElement cry = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[4]/select"));
	    Select se =  new Select (cry);
	    se.selectByVisibleText("SRD");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[5]/input")).sendKeys("5000");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[6]/input")).sendKeys("Taking the advance amount for personal issues");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[7]/input")).sendKeys("5");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[7]/button")).click();
	    Thread.sleep(2000);
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]")).getText();
		String expected_value = "1000.00";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[4]/div/table/tbody/tr[6]/td[2]")).getText();
		String expected_value1 = "5,000.00";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[8]/button[1]")).click();
		Thread.sleep(3000);
	}

	@Then("^Staff Advance request should get submitted for the current employee and request should be pending for approval$")
	public void Staff_Advance_request_should_get_submitted_for_the_current_employee_and_request_should_be_pending_for_approval() throws Throwable {
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[1]/span")).getText();
		String expected_value2 = "Loan/Advance Request Submitted Successfully";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}