package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_PasswordMismatch_Validations {
WebDriver driver;	
	
	@Given("^Login page, SingUp link, register button and validation messages for password mismatch$")
	public void Login_page_SingUp_link_register_button_and_validation_messages_for_password_mismatch() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Click on SingUp link, enter all the mandatory details, enter mismatching password details and click on Register button$")
	public void Click_on_SingUp_link_enter_all_the_mandatory_details_enter_mismatching_password_details_and_click_on_Register_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[4]/div/span")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[2]/div/input")).sendKeys("5645");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[3]/div/input")).sendKeys("998856414");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[4]/div/input")).sendKeys("20-Nov-1988");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[7]/div/input")).sendKeys("9986416710");
	    Thread.sleep(2000);
	    
	    WebElement cntry = driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[8]/div/div/select"));
	    Select se = new Select(cntry);
	    se.selectByVisibleText("Suriname");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[10]/div/input")).sendKeys("test@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[11]/div/input")).sendKeys("test123");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[12]/div/div/button[3]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display validation message if the value in password and confirm password are not same$")
	public void System_should_display_validation_message_if_the_value_in_password_and_confirm_password_are_not_same() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[1]/span")).getText();
		String expected_value = "Password and Confirm Password should be same";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		driver.quit();
	}
}