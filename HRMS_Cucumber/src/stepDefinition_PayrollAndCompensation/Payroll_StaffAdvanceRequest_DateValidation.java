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

public class Payroll_StaffAdvanceRequest_DateValidation {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Staff Advance Request page, select date as before (\\d+)th, enter other details and click on apply payback button$")
	public void Payroll_and_Compensation_module_Staff_Advance_Request_page_select_date_as_before_th_enter_other_details_and_click_on_apply_payback_button(int arg1) throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Staff Advance Request link under Payroll & Compensation module, enter the details and click on Apply Payback button$")
	public void Click_on_Staff_Advance_Request_link_under_Payroll_Compensation_module_enter_the_details_and_click_on_Apply_Payback_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement date = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[2]/form/div[3]/div/input"));
	    date.sendKeys("25-Nov-2018");
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
	}

	@Then("^System should display the validation message for requesting the advance amount after the (\\d+)th date$")
	public void System_should_display_the_validation_message_for_requesting_the_advance_amount_after_the_th_date(int arg1) throws Throwable {
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/div[1]/span")).getText();
		String expected_value2 = "You could not add loan after 20 of any month...please add from next month.";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}