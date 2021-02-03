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

public class TrainingSummary_EditTrainingSummaryDetails {
WebDriver driver;	
	
	@Given("^Learning & Development module, training summary page, edit icon and save button$")
	public void Learning_Development_module_training_summary_page_edit_icon_and_save_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on training summary under Learning & Development module, click edit icon, change the training details and click on Save button$")
	public void Click_on_training_summary_under_Learning_Development_module_click_edit_icon_change_the_training_details_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[5]/ul/li/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[5]/i")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("txtStartDateUpdate")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[6]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("txtEndDateUpdate")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[7]")).click();
	    Thread.sleep(2000); 
  
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[3]/div/div/form/div[2]/button[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Training summary details should get changed successfully and confirmation message should be displayed$")
	public void Training_summary_details_should_get_changed_successfully_and_confirmation_message_should_be_displayed() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[3]/div/div/form/div[1]/div/span")).getText();
	    String expected_value = "Records Updated Successfully";
	    Assert.assertEquals(actual_value, expected_value );
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[3]/div/div/form/div[2]/button[1]")).click();
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}