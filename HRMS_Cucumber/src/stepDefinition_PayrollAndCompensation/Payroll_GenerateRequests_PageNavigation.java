package stepDefinition_PayrollAndCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class Payroll_GenerateRequests_PageNavigation {
WebDriver driver;	
	
	@Given("^Admin login, Payroll and Compensation module, user requests page, next and prev buttons$")
	public void Admin_login_Payroll_and_Compensation_module_user_requests_page_next_and_prev_buttons() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on user requests under Payroll and Compensation module and click on Next & Prev buttons$")
	public void Click_on_user_requests_under_Payroll_and_Compensation_module_and_click_on_Next_Prev_buttons() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[9]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/ul/li[3]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should navigate to different user request pages when user click on next and prev button$")
	public void System_should_navigate_to_different_user_request_pages_when_user_click_on_next_and_prev_button() throws Throwable {
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}