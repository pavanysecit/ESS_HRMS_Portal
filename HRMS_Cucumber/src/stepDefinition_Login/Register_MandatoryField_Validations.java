package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_MandatoryField_Validations {
WebDriver driver;	
	
	@Given("^Login page, SingUp link, register button and validation messages$")
	public void Login_page_SingUp_link_register_button_and_validation_messages() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Click on SingUp link and click on Register button$")
	public void Click_on_SingUp_link_and_click_on_Register_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[4]/div/span")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[12]/div/div/button[3]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the mandatory field validation message for each field in registration page$")
	public void System_should_display_the_mandatory_field_validation_message_for_each_field_in_registration_page() throws Throwable {
		String actual_value = driver.findElement(By.id("spanEmpId")).getText();
		String expected_value = "Employee Id is required";
		Assert.assertEquals(actual_value, expected_value);
				
		String actual_value1 = driver.findElement(By.id("spanGovtId")).getText();
		String expected_value1 = "GovtId is Required";
		Assert.assertEquals(actual_value1, expected_value1);
				
		String actual_value2 = driver.findElement(By.id("spanDob")).getText();
		String expected_value2 = "DOB is required";
		Assert.assertEquals(actual_value2, expected_value2);
				
		String actual_value3 = driver.findElement(By.id("spanMobile")).getText();
		String expected_value3 = "Mobile Number is required";
		Assert.assertEquals(actual_value3, expected_value3);
				
		String actual_value4 = driver.findElement(By.id("spanCountry")).getText();
		String expected_value4 = "Please Select Country";
		Assert.assertEquals(actual_value4, expected_value4);
				
		String actual_value5 = driver.findElement(By.id("spanUserName")).getText();
		String expected_value5 = "UserName is required";
		Assert.assertEquals(actual_value5, expected_value5);
				
		String actual_value6 = driver.findElement(By.id("spanPassword")).getText();
		String expected_value6 = "Password is required";
		Assert.assertEquals(actual_value6, expected_value6);
				
		String actual_value7 = driver.findElement(By.id("spanConfirmPwd")).getText();
		String expected_value7 = "Confirm Password is required";
		Assert.assertEquals(actual_value7, expected_value7);
		Thread.sleep(2000);
		driver.quit();
	}
}