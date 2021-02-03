package stepDefinition_PayrollAndCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Payroll_Payslip_DisplaySalarySlip {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Salary slip page, salary period and submit button$")
	public void Payroll_and_Compensation_module_Salary_slip_page_salary_period_and_submit_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Payslip link under Payroll & Compensation module, select the salary period and click on Submit button$")
	public void Click_on_Payslip_link_under_Payroll_Compensation_module_select_the_salary_period_and_click_on_Submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement SP =  driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/form/div/select"));
	    Select se =  new Select(SP);
	    se.selectByVisibleText("201805");
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/form/div/button[1]")).click();
	    Thread.sleep(4000);
	}

	@Then("^System should salary slip of the current employee for selected salary period$")
	public void System_should_salary_slip_of_the_current_employee_for_selected_salary_period() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div[1]/div[2]/ul/li[2]/span")).getText();
		String expected_value = "May";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div[1]/div[2]/ul/li[4]/span")).getText();
		String expected_value1 = "2018";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[5]/div/div[2]/table/thead/tr[1]/th")).getText();
		String expected_value2 = "HOURS & EARNINGS";
		Assert.assertEquals(actual_value2, expected_value2);
		Thread.sleep(2000);
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}