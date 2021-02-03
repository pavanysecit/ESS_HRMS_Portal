package stepDefinition_Benifits_LearningAndDevelopment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Benefits_BenifitsSummary_Navigation {
WebDriver driver;	
	
	@Given("^Benefits module and Benefits Summary page$")
	public void Benefits_module_and_Benefits_Summary_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Benefits Summary under Benifits module$")
	public void Click_on_Benefits_Summary_under_Benifits_module() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[4]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[4]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the benefits summary page of the current employee$")
	public void System_should_display_the_benefits_summary_page_of_the_current_employee() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[1]/div/span")).getText();
	    String expected_value = "Benefit Summary";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(1000);
	    
	    String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[1]")).getText();
	    String expected_value1 = "Ashna Ramroop";
	    Assert.assertEquals(actual_value1, expected_value1);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}