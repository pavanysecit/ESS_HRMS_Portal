package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_With_ValidDetails {
WebDriver driver;	
	
	@Given("^Login page, username and password$")
	public void Login_page_username_and_password() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Enter the login details and click on login button$")
	public void Enter_the_login_details_and_click_on_login_button() throws Throwable {
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@Then("^User should login successfully after entering the valid credentials$")
	public void User_should_login_successfully_after_entering_the_valid_credentials() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/div[1]/div")).getText();
		String expected_value = "Home";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		driver.quit();
	}
}