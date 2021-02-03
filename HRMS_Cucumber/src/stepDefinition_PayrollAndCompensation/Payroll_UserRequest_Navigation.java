package stepDefinition_PayrollAndCompensation;

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

public class Payroll_UserRequest_Navigation {
WebDriver driver;	
	
	@Given("^Admin login, Payroll and Compensation module and User Request page$")
	public void Admin_login_Payroll_and_Compensation_module_and_User_Request_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on User Request link under Payroll & Compensation module$")
	public void Click_on_User_Request_link_under_Payroll_Compensation_module() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[9]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should navigate to the user request page$")
	public void System_should_navigate_to_the_user_request_page() throws Throwable {
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[1]/div/span")).getText();
		String expected_value2 = "User Request";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}