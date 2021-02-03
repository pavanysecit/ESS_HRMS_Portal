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

public class HomePage_PayrollAndCompensation_StaffAdvanceRequest {
WebDriver driver;	
	
	@Given("^Home page, link to navigate to the staff advance request page and staff advance request page$")
	public void Home_page_link_to_navigate_to_the_staff_advance_request_page_and_staff_advance_request_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(4000);
	}

	@When("^Click on Payroll & Compensation link and then click on staff advance request link$")
	public void Click_on_Payroll_Compensation_link_and_then_click_on_staff_advance_request_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[3]/div[1]/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[3]/div[2]/ul/li[6]/a")).click();
	    Thread.sleep(4000);
	}

	@Then("^System should navigate to the staff advance request page from home page$")
	public void System_should_navigate_to_the_staff_advance_request_page_from_home_page() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[1]/span")).getText();
		String expected_value = "Staff Advance Request";
		Assert.assertEquals(actual_value, expected_value);

	    new HRMS_LogOut(driver);
	    Thread.sleep(2000);
		driver.quit();
	}
}