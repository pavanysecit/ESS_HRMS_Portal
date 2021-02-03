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

public class TrainingSummary_TrainingSummary_Delete {
WebDriver driver;	
	
	@Given("^Learning & Development module, training summary page, delete icon and confirm button$")
	public void Learning_Development_module_training_summary_page_delete_icon_and_confirm_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on training summary under Learning & Development module, click delete icon and click on Confirm button$")
	public void Click_on_training_summary_under_Learning_Development_module_click_delete_icon_and_click_on_Confirm_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[5]/ul/li/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[6]/i")).click();
	    Thread.sleep(2000);
	}

	@Then("^Training summary details should get deleted successfully and should not be visible in the grid$")
	public void Training_summary_details_should_get_deleted_successfully_and_should_not_be_visible_in_the_grid() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div[2]/form/div/div/label")).getText();
	    String expected_value = "  Please confirm the selected training details will be delete!!!!!";
	    Assert.assertEquals(actual_value, expected_value );
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[5]/div/div/div[3]/button[1]")).click();
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}