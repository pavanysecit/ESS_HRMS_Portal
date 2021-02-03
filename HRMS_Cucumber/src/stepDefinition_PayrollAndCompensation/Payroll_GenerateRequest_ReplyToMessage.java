package stepDefinition_PayrollAndCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class Payroll_GenerateRequest_ReplyToMessage {
WebDriver driver;	
	
	@Given("^Admin login, Payroll and Compensation module, User Request page, edit icon and submit button$")
	public void Admin_login_Payroll_and_Compensation_module_User_Request_page_edit_icon_and_submit_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Search the request which has status 'Requested'$")
	public void Search_the_request_which_has_status_Requested() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[9]/a")).click();
	    Thread.sleep(2000);
	}

	@When("^Click on User Request link under Payroll & Compensation module, click on edit icon, enter the message and click on Submit button$")
	public void Click_on_User_Request_link_under_Payroll_Compensation_module_click_on_edit_icon_enter_the_message_and_click_on_Submit_button() throws Throwable {
	    WebElement search = driver.findElement(By.id("search"));
	    search.sendKeys("Requested");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[9]/i")).click();
	    Thread.sleep(2000);
	    WebElement reply = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div/div/div/div[2]/div/div[3]/div/textarea"));
	    reply.sendKeys("We replied for your message already. Please check your email");
	    Thread.sleep(2000);
	}

	@Then("^Reply message should get submitted by the admin$")
	public void Reply_message_should_get_submitted_by_the_admin() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/form/div/div/div/div[3]/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^Replied message should be visible in requested employee's generate request page$")
	public void Replied_message_should_be_visible_in_requested_employee_s_generate_request_page() throws Throwable {
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/span")).getText();
		String expected_value2 = "Requested Message Replied Sucessfully";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}