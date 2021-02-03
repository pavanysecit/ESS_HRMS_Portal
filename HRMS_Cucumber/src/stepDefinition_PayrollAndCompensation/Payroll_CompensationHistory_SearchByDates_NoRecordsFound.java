package stepDefinition_PayrollAndCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Payroll_CompensationHistory_SearchByDates_NoRecordsFound {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Compensation history page, date fields, Submit button and No records found message$")
	public void Payroll_and_Compensation_module_Compensation_history_page_date_fields_Submit_button_and_No_records_found_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Compensation history link under Payroll and Compensation module, select the dates and click on Submit button$")
	public void Click_on_Compensation_history_link_under_Payroll_and_Compensation_module_select_the_dates_and_click_on_Submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement Fdate = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/form/div[1]/div/input"));
	    Fdate.sendKeys("01-Jan-2018");
	    Thread.sleep(2000);
	    
	    WebElement Tdate = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/form/div[2]/div/input"));
	    Tdate.sendKeys("31-Dec-2018");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/form/div[3]/button")).click();
	    Thread.sleep(4000);
	}

	@Then("^System should display No Records found message if there is no hostory available between the dates selected$")
	public void System_should_display_No_Records_found_message_if_there_is_no_hostory_available_between_the_dates_selected() throws Throwable {
		 
	}
}