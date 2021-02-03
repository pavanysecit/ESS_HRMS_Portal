package stepDefinition_LeavesAndPensionInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Leaves_ApplyLeave_PageNavigation {
WebDriver driver;	
	
	@Given("^Leaves module, apply leave page, next and prev buttons$")
	public void Leaves_module_apply_leave_page_next_and_prev_buttons() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Apply leave under leave application status module and click on Next & Prev buttons$")
	public void Click_on_Apply_leave_under_leave_application_status_module_and_click_on_Next_Prev_buttons() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/a/span[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[1]/ul/li/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/ul/li[3]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div[2]/div[3]/div[2]/div/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should navigate to different pages when click on next and prev button$")
	public void System_should_navigate_to_different_pages_when_click_on_next_and_prev_button() throws Throwable {
	    driver.quit();
	}
}