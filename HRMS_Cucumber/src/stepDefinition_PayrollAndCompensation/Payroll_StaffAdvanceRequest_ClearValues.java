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

public class Payroll_StaffAdvanceRequest_ClearValues {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Staff Advance Request page, date, amount,currency, paybak count and clear button$")
	public void Payroll_and_Compensation_module_Staff_Advance_Request_page_date_amount_currency_paybak_count_and_clear_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Staff Advance Request link under Payroll & Compensation module, enter all the details and click on Clear button$")
	public void Click_on_Staff_Advance_Request_link_under_Payroll_Compensation_module_enter_all_the_details_and_click_on_Clear_button() throws Throwable {
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
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[8]/button[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^All the entered details should get cleared on click of clear button$")
	public void All_the_entered_details_should_get_cleared_on_click_of_clear_button() throws Throwable {
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[5]/input")).getText();
		Assert.assertTrue(actual.isEmpty());
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}