package stepDefinition_ITAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class NewUser_Creation_MandatoryValidation {
WebDriver driver;
	
	@Given("^Admin module, IT Admin module, New User creation page, submit button and mandatory field validation message$")
	public void Admin_module_IT_Admin_module_New_User_creation_page_submit_button_and_mandatory_field_validation_message() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on New user details link under IT Admin module and click on submit button$")
	public void Click_on_New_user_details_link_under_IT_Admin_module_and_click_on_submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/button[1]")).click();
	    Thread.sleep(2000);
	    
	    // Location
	    String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/div[1]/span")).getText();
	    String expected = "Select Location";
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(1000);
	    
	    String actual3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/div[5]/span")).getText();
	    String expected3 = "Select Role";
	    Assert.assertEquals(actual3, expected3);
	    Thread.sleep(1000);
	}

	@Then("^System should display the mandatory field validation message for not entering the mandatory details in user creation page$")
	public void System_should_display_the_mandatory_field_validation_message_for_not_entering_the_mandatory_details_in_user_creation_page() throws Throwable { 
	    String actual1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/div[2]/span")).getText();
	    String expected1 = "Select userid";
	    Assert.assertEquals(actual1, expected1);
	    Thread.sleep(1000);
	    
	    String actual2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/div[4]/span")).getText();
	    String expected2 = "Enter password";
	    Assert.assertEquals(actual2, expected2);
	    Thread.sleep(1000);
	    
	    new HRMS_LogOut(driver);
	}
}