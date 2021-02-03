package stepDefinition_HomePage_Navigation;

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

public class HomePage_LearningAndDevelopment_TrainingSummary {
WebDriver driver;
	
	@Given("^Home page, link to navigate to the training summary page and training summary page$")
	public void Home_page_link_to_navigate_to_the_training_summary_page_and_training_summary_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}
	
	@When("^Click on Learning & Development link and then click on training summary link$")
	public void Click_on_Learning_Development_link_and_then_click_on_training_summary_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[5]/div[1]/div")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[5]/div[2]/ul/li/a")).click();
	    Thread.sleep(4000);
	}
	
	@Then("^System should navigate to the training summary page from home page$")
	public void System_should_navigate_to_the_training_summary_page_from_home_page() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[1]/div/span")).getText();
		String expected_value = "Training Summary";
		Assert.assertEquals(actual_value, expected_value);

	    new HRMS_LogOut(driver);
	    Thread.sleep(2000);
		driver.quit();
	}
}