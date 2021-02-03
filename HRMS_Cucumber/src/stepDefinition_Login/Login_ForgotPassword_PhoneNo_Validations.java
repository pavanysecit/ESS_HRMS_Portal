package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_ForgotPassword_PhoneNo_Validations {
WebDriver driver;	
	
	@Given("^Login page, forgot password link and Send OTP link$")
	public void Login_page_forgot_password_link_and_Send_OTP_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Click on forgot password link and click on Send OTP link$")
	public void Click_on_forgot_password_link_and_click_on_Send_OTP_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[4]/div/div/span")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("txtEmployeeId")).sendKeys("5645");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("txtEmail")).sendKeys("pavan.kumar@ysecit.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("txtMobile")).sendKeys("9986106700");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/div/form/div[1]/div/div[5]/div[3]/div/button")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should display validation message for entering the phone no which is not registered$")
	public void System_should_display_validation_message_for_entering_the_phone_no_which_is_not_registered() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/div/form/div[1]/div/div[1]/span")).getText();
		String expected_value = "Destination Phone Numbers need to be verified. Please go to https://manage.plivo.com/sandbox-numbers/ to verify them.";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}