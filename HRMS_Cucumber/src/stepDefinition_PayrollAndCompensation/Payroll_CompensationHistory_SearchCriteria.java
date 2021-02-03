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

public class Payroll_CompensationHistory_SearchCriteria {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, compensation history page, search box and search button$")
	public void Payroll_and_Compensation_module_compensation_history_page_search_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on compensation history under Payroll and Compensation module, enter the data in search box and click on search icon$")
	public void Click_on_compensation_history_under_Payroll_and_Compensation_module_enter_the_data_in_search_box_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    // Searching by Date of Change field
	    WebElement DOC = driver.findElement(By.id("search"));
	    DOC.sendKeys("09-Oct-2017");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div/i")).click();
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[1]")).getText();
		String expected_value = "09-Oct-2017";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		DOC.clear();
		Thread.sleep(1000);
	}

	@Then("^System should check the entered details with existing compensation history details and display the matching details$")
	public void System_should_check_the_entered_details_with_existing_compensation_history_details_and_display_the_matching_details() throws Throwable {
	    // Searching by Action field
	    WebElement ACT = driver.findElement(By.id("search"));
	    ACT.sendKeys("Salary Changed");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div/i")).click();
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[2]")).getText();
		String expected_value = "Salary Changed";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		ACT.clear();
		Thread.sleep(1000);
		
	    // Searching by Reason field
	    WebElement RSN = driver.findElement(By.id("search"));
	    RSN.sendKeys("Salary Changed");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div/i")).click();
	    
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[3]")).getText();
		String expected_value1 = "Salary Changed";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(2000);
		RSN.clear();
		Thread.sleep(1000);
		
	    // Searching by Annual Salary field
	    WebElement SLRY = driver.findElement(By.id("search"));
	    SLRY.sendKeys("54000");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div/i")).click();
	    
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[4]")).getText();
		String expected_value2 = "54000.00";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(2000);
		SLRY.clear();
		Thread.sleep(1000);
		
	    // Searching by Currency field
	    WebElement CRR = driver.findElement(By.id("search"));
	    CRR.sendKeys("SRD");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div/i")).click();
	    
		String actual_value3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[5]")).getText();
		String expected_value3 = "SRD";
		Assert.assertEquals(actual_value3, expected_value3);
		Thread.sleep(2000);
		CRR.clear();
		Thread.sleep(1000);
		
	    // Searching by Compensation per frequency field
	    WebElement CPF = driver.findElement(By.id("search"));
	    CPF.sendKeys("4500");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div/i")).click();
	    
		String actual_value4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[6]")).getText();
		String expected_value4 = "4500.00";
		Assert.assertEquals(actual_value4, expected_value4);
		Thread.sleep(2000);
		CPF.clear();
		Thread.sleep(1000);
		
	    // Searching by remarks field
	    WebElement RMK = driver.findElement(By.id("search"));
	    RMK.sendKeys("cos");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div/i")).click();
	    
		String actual_value5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[8]")).getText();
		String expected_value5 = "cos";
		Assert.assertEquals(actual_value5, expected_value5);
		Thread.sleep(2000);
		RMK.clear();
		Thread.sleep(1000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}