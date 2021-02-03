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

public class Payroll_PensionDeductions_SearchCriteria {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, pension deductions page, search box and search button$")
	public void Payroll_and_Compensation_module_pension_deductions_page_search_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on pension deductions under Payroll and Compensation module, enter the data in search box and click on search icon$")
	public void Click_on_pension_deductions_under_Payroll_and_Compensation_module_enter_the_data_in_search_box_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[5]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement PD = driver.findElement(By.id("search"));
	    PD.sendKeys("Pension Premie");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div/div/div/i")).click();
	    Thread.sleep(3000);
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[1]")).getText();
		String expected_value = "Pension Premie - 71.84";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		PD.clear();
		Thread.sleep(1000);
	}

	@Then("^System should check the entered details with existing pension deductions details and display the matching details$")
	public void System_should_check_the_entered_details_with_existing_pension_deductions_details_and_display_the_matching_details() throws Throwable {
	    WebElement DM = driver.findElement(By.id("search"));
	    DM.sendKeys("September");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div/div/div/i")).click();
	    Thread.sleep(3000);
	    
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[2]")).getText();
		String expected_value1 = "September-2018";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		DM.clear();
		Thread.sleep(1000);
		
	    WebElement GA = driver.findElement(By.id("search"));
	    GA.sendKeys("143");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div/div/div/i")).click();
	    Thread.sleep(3000);
	    
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[3]")).getText();
		String expected_value2 = "143.68";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);
		GA.clear();
		Thread.sleep(1000);
		
	    WebElement ES = driver.findElement(By.id("search"));
	    ES.sendKeys("50");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div/div/div/i")).click();
	    Thread.sleep(3000);
	    
		String actual_value3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[4]")).getText();
		String expected_value3 = "50.00";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(1000);
		ES.clear();
		Thread.sleep(1000);
		
	    WebElement EC = driver.findElement(By.id("search"));
	    EC.sendKeys("71");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div/div/div/i")).click();
	    Thread.sleep(3000);
	    
		String actual_value4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[6]")).getText();
		String expected_value4 = "71.84";
		Assert.assertEquals(actual_value4, expected_value4);
		Thread.sleep(1000);
		EC.clear();
		Thread.sleep(1000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}