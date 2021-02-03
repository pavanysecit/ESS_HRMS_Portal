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
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class Payroll_UserRequests_SearchCriteria {
WebDriver driver;	
	
	@Given("^Admin login, Payroll and Compensation module, user requests page, search box and search button$")
	public void Admin_login_Payroll_and_Compensation_module_user_requests_page_search_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on user request under Payroll and Compensation module, enter the data in search box and click on search icon$")
	public void Click_on_user_request_under_Payroll_and_Compensation_module_enter_the_data_in_search_box_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[9]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should check the entered details with existing user requests details and display the matching details$")
	public void System_should_check_the_entered_details_with_existing_user_requests_details_and_display_the_matching_details() throws Throwable {
	    // Search by S No
		WebElement SNO = driver.findElement(By.id("search"));
	    SNO.sendKeys("10");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")).getText();
		String expected_value = "10";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		SNO.clear();
		Thread.sleep(1000);
		
	    // Search by Employee Id
		WebElement eid = driver.findElement(By.id("search"));
		eid.sendKeys("5645");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
		String expected_value1 = "5645";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		eid.clear();
		Thread.sleep(1000);
		
	    // Search by Employee name
		WebElement ename = driver.findElement(By.id("search"));
		ename.sendKeys("Ashna");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[3]")).getText();
		String expected_value2 = "Ashna Ramroop";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);
		ename.clear();
		Thread.sleep(1000);
		
	    // Search by requested message
		WebElement rmsg = driver.findElement(By.id("search"));
		rmsg.sendKeys("Requesting the payslip");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actualvalue = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[4]")).getText();
		Assert.assertTrue(actualvalue.contains("Requesting the payslip for the month of"));
		Thread.sleep(1000);
		rmsg.clear();
		Thread.sleep(1000);
		
	    // Search by Requested date
		WebElement reqdate = driver.findElement(By.id("search"));
		reqdate.sendKeys("23-Nov-2018");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[5]")).getText();
		String expected_value3 = "23-Nov-2018";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(1000);
		reqdate.clear();
		Thread.sleep(1000);
		
	    // Search by Action Type
		WebElement AType = driver.findElement(By.id("search"));
		AType.sendKeys("Requested");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
		String expected_value4 = "Requested";
		Assert.assertEquals(actual_value4, expected_value4);
		Thread.sleep(1000);
		AType.clear();
		Thread.sleep(1000);
		
		WebElement AType1 = driver.findElement(By.id("search"));
		AType1.sendKeys("Replied");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
		String expected_value5 = "Replied";
		Assert.assertEquals(actual_value5, expected_value5);
		Thread.sleep(1000);
		AType1.clear();
		Thread.sleep(1000);
		
		// Search by Reply message
		WebElement RepMsg = driver.findElement(By.id("search"));
		RepMsg.sendKeys("Sure. Will check");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value6 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[7]")).getText();
		String expected_value6 = "Sure. Will check and update you";
		Assert.assertEquals(actual_value6, expected_value6);
		Thread.sleep(1000);
		RepMsg.clear();
		Thread.sleep(1000);
		
		// Search by Reply Date
		WebElement RepDate = driver.findElement(By.id("search"));
		RepDate.sendKeys("23-Nov-2018");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value7 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[8]")).getText();
		String expected_value7 = "23-Nov-2018";
		Assert.assertEquals(actual_value7, expected_value7);
		Thread.sleep(1000);
		RepDate.clear();
		Thread.sleep(1000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}