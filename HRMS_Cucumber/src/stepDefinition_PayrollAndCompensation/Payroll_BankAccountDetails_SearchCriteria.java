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

public class Payroll_BankAccountDetails_SearchCriteria {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, bank account details page, search box and search button$")
	public void Payroll_and_Compensation_module_bank_account_details_page_search_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on bank account details under Payroll and Compensation module, enter the data in search box and click on search icon$")
	public void Click_on_bank_account_details_under_Payroll_and_Compensation_module_enter_the_data_in_search_box_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[3]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should check the entered details with existing bank account details and display the matching details$")
	public void System_should_check_the_entered_details_with_existing_bank_account_details_and_display_the_matching_details() throws Throwable {
	    WebElement BM =  driver.findElement(By.id("search"));
	    BM.sendKeys("Surinaamse");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[1]")).getText();
		String expected_value = "Surinaamse Post Spaar Bank";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		BM.clear();
		Thread.sleep(1000);
		
	    WebElement IFSC =  driver.findElement(By.id("search"));
	    IFSC.sendKeys("SPSB");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[2]")).getText();
		String expected_value1 = "SPSB";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		IFSC.clear();
		Thread.sleep(1000);
		
	    WebElement NAME =  driver.findElement(By.id("search"));
	    NAME.sendKeys("Ashna");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[3]")).getText();
		String expected_value2 = "Ashna Ramroop";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(1000);
		NAME.clear();
		Thread.sleep(1000); 
		
	    WebElement AN =  driver.findElement(By.id("search"));
	    AN.sendKeys("40300");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div/div/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[4]")).getText();
		String expected_value3 = "403002228";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(1000);
		AN.clear();
		Thread.sleep(1000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}