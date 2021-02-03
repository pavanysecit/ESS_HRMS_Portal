package stepDefinition_LeavesAndPensionInformation;

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

public class Leaves_ApplyLeave_SearchCriteria {
WebDriver driver;	
	
	@Given("^Leaves module, apply leave page, leave requets, search box and search button$")
	public void Leaves_module_apply_leave_page_leave_requets_search_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Apply leave under leave application status module, enter the data in search box and click on search icon$")
	public void Click_on_Apply_leave_under_leave_application_status_module_enter_the_data_in_search_box_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/a/span[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/ul/li/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement srchid = driver.findElement(By.id("search"));
	    srchid.sendKeys("5645");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
		String expected_value = "5645";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);	
		srchid.clear();
		Thread.sleep(1000);	
	}

	@Then("^System should check the entered details with existing leave requests and display the matching details$")
	public void System_should_check_the_entered_details_with_existing_leave_requests_and_display_the_matching_details() throws Throwable {
	    WebElement srchName = driver.findElement(By.id("search"));
	    srchName.sendKeys("Ashna");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]")).getText();
		String expected_value1 = "Ashna";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);	
		srchName.clear();
		Thread.sleep(1000);	
		
	    WebElement srchType = driver.findElement(By.id("search"));
	    srchType.sendKeys("ANNUAL");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[4]")).getText();
		String expected_value2 = "ANNUAL LEAVE";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);	
		srchType.clear();
		Thread.sleep(1000);	
		
	    WebElement srchApdate = driver.findElement(By.id("search"));
	    srchApdate.sendKeys("03-Apr-2018");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[5]")).getText();
		String expected_value3 = "03-Apr-2018";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(1000);	
		srchApdate.clear();
		Thread.sleep(1000);	
		
	    WebElement srchFrdate = driver.findElement(By.id("search"));
	    srchFrdate.sendKeys("24-Oct-2018");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[6]")).getText();
		String expected_value4 = "24-Oct-2018";
		Assert.assertEquals(actual_value4, expected_value4);
		Thread.sleep(1000);	
		srchFrdate.clear();
		Thread.sleep(1000);	
		
	    WebElement srchTodate = driver.findElement(By.id("search"));
	    srchTodate.sendKeys("30-Mar-2018");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[7]")).getText();
		String expected_value5 = "30-Mar-2018";
		Assert.assertEquals(actual_value5, expected_value5);
		Thread.sleep(1000);	
		srchTodate.clear();
		Thread.sleep(1000);	
		
	    WebElement hours = driver.findElement(By.id("search"));
	    hours.sendKeys("8.5");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value6 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[8]")).getText();
		String expected_value6 = "8.5";
		Assert.assertEquals(actual_value6, expected_value6);
		Thread.sleep(1000);	
		hours.clear();
		Thread.sleep(1000);	
		
	    WebElement days = driver.findElement(By.id("search"));
	    days.sendKeys("1");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value7 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[9]")).getText();
		String expected_value7 = "1";
		Assert.assertEquals(actual_value7, expected_value7);
		Thread.sleep(1000);	
		days.clear();
		Thread.sleep(1000);
		
	    WebElement dsc = driver.findElement(By.id("search"));
	    dsc.sendKeys("Holiday");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value8 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[2]/td[10]")).getText();
		String expected_value8 = "Holiday Leave";
		Assert.assertEquals(actual_value8, expected_value8);
		Thread.sleep(1000);	
		dsc.clear();
		Thread.sleep(1000);
		
	    WebElement st = driver.findElement(By.id("search"));
	    st.sendKeys("Approved");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
		String actual_value9 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[11]")).getText();
		String expected_value9 = "Approved";
		Assert.assertEquals(actual_value9, expected_value9);
		Thread.sleep(1000);	
		st.clear();
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(2000);	
	    driver.quit();
	}
}