package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_ForgotPassword_MandatoryField_Validations {
WebDriver driver;	
	
	@Given("^Login page, forgot password link and validation message$")
	public void Login_page_forgot_password_link_and_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	}

	@When("^Click on forgot password link and click on Submit button$")
	public void Click_on_forgot_password_link_and_click_on_Submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[4]/div/div/span")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/div/form/div[2]/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the mandatory field validation message for each field in forgot password page$")
	public void System_should_display_the_mandatory_field_validation_message_for_each_field_in_forgot_password_page() throws Throwable {
		String actual_value = driver.findElement(By.id("spanEmpID")).getText();
		String expected_value = "UserId is required";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		
		String actual_value1 = driver.findElement(By.id("spanEmail")).getText();
		String expected_value1 = "Email is required in valid format";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		
		String actual_value2 = driver.findElement(By.id("spanMobile")).getText();
		String expected_value2 = "Mobile Number is required";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}