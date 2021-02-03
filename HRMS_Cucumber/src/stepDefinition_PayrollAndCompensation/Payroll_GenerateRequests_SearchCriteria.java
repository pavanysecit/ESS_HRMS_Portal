package stepDefinition_PayrollAndCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Payroll_GenerateRequests_SearchCriteria {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, generate requests page, search box and search button$")
	public void Payroll_and_Compensation_module_generate_requests_page_search_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on generate request under Payroll and Compensation module, enter the data in search box and click on search icon$")
	public void Click_on_generate_request_under_Payroll_and_Compensation_module_enter_the_data_in_search_box_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[8]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should check the entered details with existing generated requests details and display the matching details$")
	public void System_should_check_the_entered_details_with_existing_generated_requests_details_and_display_the_matching_details() throws Throwable {
		// Search by Requested Date
		WebElement Rdate = driver.findElement(By.id("search"));
		Rdate.sendKeys("23-Nov-2018");
		Thread.sleep(1000);
		
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]")).getText();
		String expected_value = "23-Nov-2018";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		Rdate.clear();
		Thread.sleep(1000);
		
		// Search by Message 
		WebElement msg = driver.findElement(By.id("search"));
		msg.sendKeys("requesting");
		Thread.sleep(1000);
		
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[2]")).getText();
		String expected_value1 = "Requesting the payslip for the month of July 2018";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		msg.clear();
		Thread.sleep(1000);
		
		// Search by RepliedBy 
		WebElement rpldby = driver.findElement(By.id("search"));
		rpldby.sendKeys("vedat");
		Thread.sleep(1000);
		
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[3]")).getText();
		String expected_value2 = "Vedat Erbas";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);
		rpldby.clear();
		Thread.sleep(1000);
		
		// Search by Replied Date 
		WebElement rpldDate = driver.findElement(By.id("search"));
		rpldDate.sendKeys("23-Nov-2018");
		Thread.sleep(1000);
		
		String actual_value3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[4]")).getText();
		String expected_value3 = "23-Nov-2018";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(1000);
		rpldDate.clear();
		Thread.sleep(1000);
		
		// Search by Reply message 
		WebElement reply = driver.findElement(By.id("search"));
		reply.sendKeys("Will check and update you");
		Thread.sleep(1000);
		
		String actual_value4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[5]")).getText();
		String expected_value4 = "Sure. Will check and update you";
		Assert.assertEquals(actual_value4, expected_value4);
		Thread.sleep(1000);
		reply.clear();
		Thread.sleep(1000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}