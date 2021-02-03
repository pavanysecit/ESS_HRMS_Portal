package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_NavigateTo_LoginPage {
WebDriver driver;	
	
	@Given("^Login page, SingUp link and login button$")
	public void Login_page_SingUp_link_and_login_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Click on SingUp link and click on Login button$")
	public void Click_on_SingUp_link_and_click_on_Login_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[4]/div/span")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[12]/div/div/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should take user to login page on click of login link$")
	public void System_should_take_user_to_login_page_on_click_of_login_link() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/span[2]")).getText();
		String expected_value = "Login";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		driver.quit();
	}
}