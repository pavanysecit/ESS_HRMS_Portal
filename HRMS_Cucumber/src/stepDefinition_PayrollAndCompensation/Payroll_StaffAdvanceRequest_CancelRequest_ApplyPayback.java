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

public class Payroll_StaffAdvanceRequest_CancelRequest_ApplyPayback {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Staff Advance Request page, date, currency and Apply payback button$")
	public void Payroll_and_Compensation_module_Staff_Advance_Request_page_date_currency_and_Apply_payback_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Staff Advance Request link under Payroll & Compensation module, Enter the date, currenct, amount and click on Apply Payback button$")
	public void Click_on_Staff_Advance_Request_link_under_Payroll_Compensation_module_Enter_the_date_currenct_amount_and_click_on_Apply_Payback_button() throws Throwable {
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
	}

	@Then("^System should divide the amount into the value entered in the payback count field$")
	public void System_should_divide_the_amount_into_the_value_entered_in_the_payback_count_field() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[5]/input")).sendKeys("50000");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[6]/input")).sendKeys("Taking the advance amount for personal issues");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[7]/input")).sendKeys("5");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[7]/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^Divided amount as amount needs to be paid per month should be displayed in the Payback Schedule table$")
	public void Divided_amount_as_amount_needs_to_be_paid_per_month_should_be_displayed_in_the_Payback_Schedule_table() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[4]/div/table/thead/tr[1]/th")).getText();
		String expected_value = "PAYBACK SCHEDULES";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[4]/div/table/tbody/tr[1]/td[2]")).getText();
		String expected_value1 = "10000.00";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[4]/div/table/tbody/tr[6]/td[2]")).getText();
		String expected_value2 = "50,000.00";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}