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

public class Payroll_StaffAdvanceRequest_CancelRequest {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Staff Advance Request page, date, amount,currency, paybak count, save button and cancel link$")
	public void Payroll_and_Compensation_module_Staff_Advance_Request_page_date_amount_currency_paybak_count_save_button_and_cancel_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Staff Advance Request link under Payroll & Compensation module, enter all the details, click on Save button and click on Cancel link$")
	public void Click_on_Staff_Advance_Request_link_under_Payroll_Compensation_module_enter_all_the_details_click_on_Save_button_and_click_on_Cancel_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement date = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[3]/div/input"));
	    date.sendKeys("06-Jan-2019");
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
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[8]/button[1]")).click();
	    Thread.sleep(2000);
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[1]/span")).getText();
		String expected_value = "Loan/Advance Request Submitted Successfully";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[8]/i")).click();
	    Thread.sleep(4000);
	}

	@Then("^System should ask for confirmation before cancelling and clicking on confirm, Request for staff advance should get cancelled$")
	public void System_should_ask_for_confirmation_before_cancelling_and_clicking_on_confirm_Request_for_staff_advance_should_get_cancelled() throws Throwable {
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div/div[2]/form/div/div/label")).getText();
		String expected_value1 = "  Please confirm the selected advance request details will be delete!";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div/div[3]/div/button[1]")).click();
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}