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

public class TrainingSummary_Navigation {
WebDriver driver;	
	
	@Given("^Learning & Development module and Training Summary page$")
	public void Learning_Development_module_and_Training_Summary_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on training summary under Learning & Development module$")
	public void Click_on_training_summary_under_Learning_Development_module() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[5]/ul/li/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should navigate to the training summary page of the current employee$")
	public void System_should_navigate_to_the_training_summary_page_of_the_current_employee() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[1]/div/span")).getText();
	    String expected_value = "Training Summary";
	    Assert.assertEquals(actual_value, expected_value );
	    Thread.sleep(1000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}