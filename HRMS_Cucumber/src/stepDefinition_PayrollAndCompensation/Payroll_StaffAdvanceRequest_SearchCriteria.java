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

public class Payroll_StaffAdvanceRequest_SearchCriteria {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, staff advance requests page, search box and search button$")
	public void Payroll_and_Compensation_module_staff_advance_requests_page_search_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on staff advance requests under Payroll and Compensation module, enter the data in search box and click on search icon$")
	public void Click_on_staff_advance_requests_under_Payroll_and_Compensation_module_enter_the_data_in_search_box_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[6]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should check the entered details with existing staff advance requests details and display the matching details$")
	public void System_should_check_the_entered_details_with_existing_staff_advance_requests_details_and_display_the_matching_details() throws Throwable {
	    // Search by date
		WebElement date =  driver.findElement(By.id("search"));
	    date.sendKeys("20-Oct-2018");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[1]/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[1]")).getText();
		String expected_value = "20-Oct-2018";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		date.clear();
		Thread.sleep(1000);
		
		// Search by amount
	    WebElement amt =  driver.findElement(By.id("search"));
	    amt.sendKeys("10000");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[1]/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[2]")).getText();
		String expected_value1 = "10000.00";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		amt.clear();
		Thread.sleep(1000);
		
		// Search by currency
	    WebElement cry =  driver.findElement(By.id("search"));
	    cry.sendKeys("USD");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[1]/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[3]")).getText();
		String expected_value2 = "USD";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);
		cry.clear();
		Thread.sleep(1000);
		
		// Search by remarks
	    WebElement rmk =  driver.findElement(By.id("search"));
	    rmk.sendKeys("due to");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[1]/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[4]")).getText();
		String expected_value3 = "due to";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(1000);
		rmk.clear();
		Thread.sleep(1000);
		
		// Search by payback count
	    WebElement pyc =  driver.findElement(By.id("search"));
	    pyc.sendKeys("2");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[1]/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[5]")).getText();
		String expected_value4 = "2";
		Assert.assertEquals(actual_value4, expected_value4);
		Thread.sleep(1000);
		pyc.clear();
		Thread.sleep(1000);
		
		// Search by status
	    WebElement status =  driver.findElement(By.id("search"));
	    status.sendKeys("Processed");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[1]/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[7]")).getText();
		String expected_value5 = "Processed";
		Assert.assertEquals(actual_value5, expected_value5);
		Thread.sleep(1000);
		status.clear();
		Thread.sleep(1000);
		
	    WebElement status1 =  driver.findElement(By.id("search"));
	    status1.sendKeys("Cancel");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[1]/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actualvalue = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[7]")).getText();
		Assert.assertTrue(actualvalue.contains("Cancelled"));
		Thread.sleep(1000);
		status1.clear();
		Thread.sleep(1000);
		
	    WebElement status2 =  driver.findElement(By.id("search"));
	    status2.sendKeys("Approve");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[1]/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value6 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/div[3]/div[2]/table/tbody/tr[1]/td[7]")).getText();
		String expected_value6 = "Approved";
		Assert.assertEquals(actual_value6, expected_value6);
		Thread.sleep(1000);
		status2.clear();
		Thread.sleep(1000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}