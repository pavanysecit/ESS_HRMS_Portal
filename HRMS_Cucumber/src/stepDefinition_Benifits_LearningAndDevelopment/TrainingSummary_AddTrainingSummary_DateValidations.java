package stepDefinition_Benifits_LearningAndDevelopment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class TrainingSummary_AddTrainingSummary_DateValidations {
WebDriver driver;	
	
	@Given("^Learning & Development module, training summary page, add training summary button, course name, course dates, status, Save button and validation message$")
	public void Learning_Development_module_training_summary_page_add_training_summary_button_course_name_course_dates_status_Save_button_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on training summary under Learning & Development module, click add training summary button, select the start date greater than end date & enter other details and click on Save button$")
	public void Click_on_training_summary_under_Learning_Development_module_click_add_training_summary_button_select_the_start_date_greater_than_end_date_enter_other_details_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[5]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[5]/ul/li/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div/button")).click();
	    Thread.sleep(2000);
	    
	    WebElement Cname = driver.findElement(By.id("ddlCourseName"));
	    Select se = new Select(Cname);
	    se.selectByVisibleText("Machine Learning");
	    Thread.sleep(2000);
	    
	    WebElement csdate = driver.findElement(By.id("txtStartDate"));
	    csdate.sendKeys("22-Nov-2018");
	    Thread.sleep(2000);
	    
	    WebElement cfdate = driver.findElement(By.id("txtEndDate"));
	    cfdate.sendKeys("03-Nov-2018");
	    Thread.sleep(2000);
	    
	    WebElement status = driver.findElement(By.id("ddlStatus"));
	    Select pe = new Select(status);
	    pe.selectByVisibleText("Completed");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[4]/div/div/form/div[2]/button[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display validation message for selecting course start date greater than end date and training details should not get saved$")
	public void System_should_display_validation_message_for_selecting_course_start_date_greater_than_end_date_and_training_details_should_not_get_saved() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[4]/div/div/form/div[1]/div/div[3]/span[2]")).getText();
	    String expected_value = "Course End date should be greater than Start date";
	    Assert.assertEquals(actual_value, expected_value );
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[4]/div/div/form/div[2]/button[1]")).click();
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}